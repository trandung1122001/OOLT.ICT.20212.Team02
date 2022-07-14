package hust.ict.globalict.project.object;

import hust.ict.globalict.project.force.Force;
import hust.ict.globalict.project.utils.Constants;
import hust.ict.globalict.project.utils.Constants.Shape;

public abstract class MainObject {
	private double mass = 0;

	private double position = 0;
	private double acceleration = 0;
	private double velocity = 0;

	public MainObject() {
	}

	public abstract Shape getShape();

	public abstract void recalAcceleration(Force fri, Force sof);

	public void recalVelocity() {
		this.setVelocity(this.getVelocity() + this.getAcceleration() * Constants.DELTA_TIME / 1000);
	};

	public abstract void recalPosition();

	public double getMass() {
		return mass;
	}

	public void setMass(double mass) {
		this.mass = mass;
	}

	public double getPosition() {
		return position;
	}

	public void setPosition(double position) {
		this.position = position;
	}

	public double getAcceleration() {
		return acceleration;
	}

	public void setAcceleration(double acceleration) {
		this.acceleration = acceleration;
	}

	public double getVelocity() {
		return velocity;
	}

	public void setVelocity(double velocity) {
		this.velocity = velocity;
	}
}
