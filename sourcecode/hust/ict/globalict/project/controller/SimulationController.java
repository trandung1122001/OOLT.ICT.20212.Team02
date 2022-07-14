package hust.ict.globalict.project.controller;

import java.util.HashSet;
import java.util.Set;

import hust.ict.globalict.project.force.*;
import hust.ict.globalict.project.object.*;
import hust.ict.globalict.project.surface.Surface;
import hust.ict.globalict.project.utils.Constants.*;

public class SimulationController {
	// OnUpdateValueOnGuiHandler

	private MainObject mainObj;
	private SumOfForce sumOfForce;

	private Set<SimState> states = new HashSet<SimState>();;

	public SimulationController() {
		Surface surface = new Surface();
		Force gravitation, appliedF, friction;
		gravitation = new Gravitation();
		appliedF = new Force(Fname.APPLIEDFORCE);
		friction = new Friction(surface, appliedF);
		sumOfForce = new SumOfForce(gravitation, appliedF, friction);
	}

	public void recalSimulation() {
		sumOfForce.getGravitation().recalStrAndDir(mainObj);
		sumOfForce.getFriction().recalStrAndDir(mainObj);
		sumOfForce.recalStrAndDir();
		mainObj.recalAcceleration(sumOfForce);
		mainObj.recalVelocity();
		mainObj.recalPosition();
	}

	public void resetSimulation() {
		mainObj.setVelocity(0);
		mainObj.setPosition(0);
	}

	public void pauseSimulation() {
		if (!states.contains(SimState.PAUSE))
			states.add(SimState.PAUSE);
	}

	public void continueSimulation() {
		states.remove(SimState.PAUSE);
	}

	public void updateStaticCoef(double sc) {
		sumOfForce.getFriction().getSf().setStaticCoefficient(sc);
		recalSimulation();
	}

	public void updateKineticCoef(double kc) {
		sumOfForce.getFriction().getSf().setKineticCoefficient(kc);
		recalSimulation();
	}

	public void updateAppliedFStrength(double f) {
		sumOfForce.getAppliedForce().setStrength(f);
		recalSimulation();
	}

	public void updateObjectSelected(Shape s) {
		if (s == Shape.CUBE)
			mainObj = new CubeObject();
		else if (s == Shape.CYLINDER)
			mainObj = new CylinderObject();
	}

	public void updateObjectMass(double m) {
		mainObj.setMass(m);
		recalSimulation();
	}

	public void updateObjectRadius(double r) {
		if (mainObj instanceof CylinderObject)
			((CylinderObject) mainObj).setRadius(r);
		recalSimulation();
	}

	public void updateObjectSideLength(double l) {
		if (mainObj instanceof CubeObject)
			((CubeObject) mainObj).setSideLength(l);
		recalSimulation();
	}

	public MainObject getMainObj() {
		return mainObj;
	}

	public SumOfForce getSumOfForce() {
		return sumOfForce;
	}

	public Surface getSurface() {
		return sumOfForce.getFriction().getSf();
	}

	public double getObjectRadius() {
		if (mainObj instanceof CylinderObject)
			return ((CylinderObject) mainObj).getRadius();
		return 0;
	}

	public double getObjectSideLength() {
		if (mainObj instanceof CubeObject)
			return ((CubeObject) mainObj).getSideLength();
		return 0;
	}

//	public Set<SimState> getStates() {
//		return this.states;
//	}

	public void addState(SimState state) {
		this.states.add(state);
	}

	public void removeState(SimState state) {
		this.states.remove(state);
	}

	public boolean checkState(SimState state) {
		return this.states.contains(state);
	}
}
