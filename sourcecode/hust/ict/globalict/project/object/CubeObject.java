package hust.ict.globalict.project.object;

import hust.ict.globalict.project.utils.Constants.Shape;

public class CubeObject extends MainObject{

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
}
