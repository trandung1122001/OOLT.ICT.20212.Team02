package hust.ict.globalict.project.controller;

import java.util.HashSet;
import java.util.Set;

import hust.ict.globalict.project.force.*;
import hust.ict.globalict.project.object.*;
import hust.ict.globalict.project.surface.Surface;
import hust.ict.globalict.project.utils.Constants.*;

public class SimulationController {
	

	private MainObject mainObj;
	private Surface surface;
	private Force sumOfForce, gravitation, appliedF, friction;
	

	private Set<SimState> states;

	//Contructor
	public SimulationController() {
		initialize();
	}
	
	public void initialize() {
		mainObj = new CubeObject();
		surface = new Surface();
		gravitation = new Gravitation();
		appliedF = new Force(Fname.APPLIEDFORCE);
		friction = new Friction();
		sumOfForce = new SumOfForce();
		states = new HashSet<SimState>();
	}
	
	
	// OnUpdateValueOnGuiHandler
	public void recalSimulation() {
		((Gravitation) gravitation).recalStrAndDir(mainObj);
		((Friction) friction).recalStrAndDir(mainObj, appliedF, surface);
		((SumOfForce) sumOfForce).recalStrAndDir(appliedF, friction);
		mainObj.recalAcceleration(friction, sumOfForce);
		mainObj.recalVelocity();
		mainObj.recalPosition();
	}
	
	public void updateStaticCoef(double sc) {
		surface.setStaticCoefficient(sc);
		recalSimulation();
	}

	public void updateKineticCoef(double kc) {
		surface.setKineticCoefficient(kc);
		recalSimulation();
	}

	public void updateAppliedFStrength(double f) {
		appliedF.setStrength(f);
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


	//Forces
	public SumOfForce getSumOfForce() {
		return (SumOfForce) sumOfForce;
	}
	
	public Gravitation getGravitation() {
		return (Gravitation) gravitation;
	}
	
	public Force getAppliedForce() {
		return appliedF;
	}
	
	public Friction getFriction() {
		return (Friction) friction;
	}

	//Object
	public MainObject getMainObj() {
		return mainObj;
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

	//State
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
	
	public void addState(SimState state) {
		this.states.add(state);
	}

	public void removeState(SimState state) {
		this.states.remove(state);
	}

	public boolean checkState(SimState state) {
		return this.states.contains(state);
	}
	
	//Surface 
	public Surface getSurface() {
		return surface;
	}
}
