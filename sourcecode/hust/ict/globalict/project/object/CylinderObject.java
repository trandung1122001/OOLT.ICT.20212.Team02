package hust.ict.globalict.project.object;

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
}
