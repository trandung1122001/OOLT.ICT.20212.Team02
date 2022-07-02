package hust.ict.globalict.project.object;

import hust.ict.globalict.project.utils.Contants.Shape;

public class MainObject {
	private Shape shape;
	private double mass;
	private double sideLength;
	private double radius;

	public MainObject(Shape s) {
		this.shape = s;
	}
	
	public MainObject() {
		shape = Shape.UNSHAPE;
		mass = 0;
		sideLength = 0;
		radius = 0;
	}
	
	public double getMass() {
		return mass;
	}

	public void setMass(double mass) {
		this.mass = mass;
	}

	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}
	
	public double getSideLength() {
		return sideLength;
	}

	public void setSideLength(double sideLength) {
		this.sideLength = sideLength;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}
