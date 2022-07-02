package hust.ict.globalict.project.controller;

import java.util.HashSet;
import java.util.Set;

import hust.ict.globalict.project.force.AppliedForce;
import hust.ict.globalict.project.force.Force;
import hust.ict.globalict.project.force.Friction;
import hust.ict.globalict.project.force.Gravitation;
import hust.ict.globalict.project.object.MainObject;
import hust.ict.globalict.project.surface.Surface;
import hust.ict.globalict.project.utils.Contants.*;

public class SimulationController {

	private MainObject mainObj;
	private Surface surface;

	private Gravitation gravitation;
	private AppliedForce appliedF;
	private Friction friction;
	private Force sumOfForce;

	private Set<SimState> states = new HashSet<SimState>();

	// private double deltaTime = 0.5f;
	private double position = 0;
	private double acceleration = 0;
	private double velocity = 0;

	public SimulationController() {
		mainObj = new MainObject();
		surface = new Surface();
		gravitation = new Gravitation(this.mainObj);
		appliedF = new AppliedForce(this.mainObj);
		friction = new Friction(surface, mainObj, gravitation, appliedF);
		sumOfForce = new Force();
		calFriction();
		calSumOfForce();
	}

	public void calAcceleration() {
		double a = 0;
		if (mainObj.getShape() == Shape.CUBE) {
			if (mainObj.getMass() == 0)
				a = 0;
			else
				a = Math.abs(appliedF.getStrength() - friction.getStrength()) / mainObj.getMass();
		} else if (mainObj.getShape() == Shape.CYLINDER) {
			if (mainObj.getMass() == 0 || mainObj.getRadius() == 0)
				a = 0;
			else
				a = friction.getStrength() / 0.5 / mainObj.getMass() / mainObj.getRadius() / mainObj.getRadius();
		}
		this.acceleration = a;
	}

	public void reCalPositionAfter(double sec) {
		this.position = this.position + acceleration * sec;
	}

	public void reCalVelocityAfter(double sec) {
		this.velocity = this.velocity + acceleration * sec;
	}

	public MainObject getMainObj() {
		return mainObj;
	}

	public void updateObjShape(Shape s) {
		this.mainObj.setShape(s);
		calFriction();
	}

	public void updateObjMass(double m) {
		this.mainObj.setMass(m);
		this.gravitation.setStrength(m * 10);
		calFriction();
	}

	public void updateObjRadius(double m) {
		this.mainObj.setRadius(m);
		calAcceleration();
	}

	public void updateObjSideLength(double m) {
		this.mainObj.setSideLength(m);
	}

	public Surface getSurface() {
		return surface;
	}

	public void updateStaticCoef(double sc) {
		surface.setStaticCoefficient(sc);
		calFriction();
	}

	public void updateKineticCoef(double kc) {
		surface.setKineticCoefficient(kc);
		calFriction();
	}

	public double getPosition() {
		return position;
	}

	public AppliedForce getAppliedF() {
		return appliedF;
	}

	public void updateAppliedFStrength(double f) {
		appliedF.setStrength(f);
		if (f < 0)
			appliedF.setDirection(Direction.LEFT);
		else if (f > 0)
			appliedF.setDirection(Direction.RIGHT);
		calFriction();
	}

	public Friction getFriction() {
		return friction;
	}

	public void calFriction() {
		double a = Math.abs(appliedF.getStrength());
		double n = mainObj.getMass() * 10;
		double sc = surface.getStaticCoefficient();
		double kc = surface.getKineticCoefficient();
		double rlt = 0;
		if (mainObj.getShape() == Shape.CUBE) {
			if (a <= n * sc)
				rlt = a;
			else
				rlt = n * kc;
		} else if (mainObj.getShape() == Shape.CYLINDER) {
			if (a <= 3 * n * sc)
				rlt = a / 3;
			else
				rlt = n * kc;
		}
		if (appliedF.getStrength() > 0) {
			friction.setStrength(rlt * -1);
			friction.setDirection(Direction.LEFT);
		} else {
			friction.setStrength(rlt);
			friction.setDirection(Direction.RIGHT);
		}
	}

	public Force getSumOfForce() {
		return sumOfForce;
	}

	public void calSumOfForce() {
		this.sumOfForce.setFname(Fname.SUMOFFORCES);
		double str = (friction.getStrength() - appliedF.getStrength());
		this.sumOfForce.setStrength(Math.abs(str));
		if (str < 0)
			this.sumOfForce.setDirection(appliedF.getDirection());
		else
			this.sumOfForce.setDirection(friction.getDirection());
	}

	public double getAcceleration() {
		return acceleration;
	}

	public double getVelocity() {
		return velocity;
	}

	public Set<SimState> getStates() {
		return this.states;
	}
}
