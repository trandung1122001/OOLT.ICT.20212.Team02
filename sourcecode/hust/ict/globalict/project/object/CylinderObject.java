package hust.ict.globalict.project.object;

import hust.ict.globalict.project.force.Force;
import hust.ict.globalict.project.force.SumOfForce;
import hust.ict.globalict.project.utils.Constants;
import hust.ict.globalict.project.utils.Constants.Fname;
import hust.ict.globalict.project.utils.Constants.Shape;

public class CylinderObject extends MainObject{

	private double radius = 0;
	
	public CylinderObject() {
	}
	
	public CylinderObject(double mass, double sl) {
		this.radius = sl;
		this.setMass(mass);
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public Shape getShape() {
		return Shape.CYLINDER;
	}

	@Override
	public void recalAcceleration(SumOfForce sof) {
		double m = this.getMass();
		Force f = sof.getFriction();
		if (m == 0 || radius == 0 || f == null ||  f.getStrength() == 0)
			this.setAcceleration(0);
		else {
			this.setAcceleration(f.getStrength() / (-0.5) / m / radius / radius);
		}
	}

	@Override
	public void recalPosition() {
		this.setPosition(this.getPosition() + radius * this.getVelocity() * Constants.DELTA_TIME);
	}
}
