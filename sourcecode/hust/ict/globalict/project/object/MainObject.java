package hust.ict.globalict.project.object;

import hust.ict.globalict.project.force.Force;
import hust.ict.globalict.project.utils.Shape;

public class MainObject {
	private Shape shape;
	private double position;
	private double mass;
	private double acceleration;
	private double velocity;
	//forces
	private Force forces[];
	private Force sumOfForces;
	
	
	
	public MainObject(Shape shape) {
		this.shape = shape;
	}



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

	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}



	public double getVelocity() {
		return velocity;
	}



	public void setVelocity(double velocity) {
		this.velocity = velocity;
	}



	public double getAcceleration() {
		return acceleration;
	}



	public void setAcceleration(double acceleration) {
		this.acceleration = acceleration;
	}



	public Force getSumOfForces() {
		return sumOfForces;
	}



	public void calSumOfForces() {
	}

}
