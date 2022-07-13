package hust.ict.globalict.project.object;

import hust.ict.globalict.project.utils.Constants.Shape;

public abstract class MainObject {
	private double mass = 0;
	
	public double getMass() {
		return mass;
	}

	public void setMass(double mass) {
		this.mass = mass;
	}

	public abstract Shape getShape();
}
