package hust.ict.globalict.project.object;

import hust.ict.globalict.project.force.SumOfForce;
import hust.ict.globalict.project.utils.Constants;
import hust.ict.globalict.project.utils.Constants.Shape;

public class CubeObject extends MainObject {

	private double sideLength = 0;

	public CubeObject() {
	}

	public CubeObject(double mass, double sl) {
		this.sideLength = sl;
		this.setMass(mass);
	}

	public double getSideLength() {
		return sideLength;
	}

	public void setSideLength(double sideLength) {
		this.sideLength = sideLength;
	}

	@Override
	public Shape getShape() {
		return Shape.CUBE;
	}

	@Override
	public void recalAcceleration(SumOfForce sof) {
		if (this.getMass() != 0)
			this.setAcceleration(sof.getStrength() / this.getMass());
		else
			this.setAcceleration(0);
	}

	@Override
	public void recalPosition() {
		this.setPosition(this.getPosition() + this.getVelocity() * Constants.DELTA_TIME);
	}
}
