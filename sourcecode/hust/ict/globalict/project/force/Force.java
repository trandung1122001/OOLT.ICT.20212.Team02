package hust.ict.globalict.project.force;

import hust.ict.globalict.project.object.MainObject;
import hust.ict.globalict.project.utils.Constants.*;

public class Force {
	private Fname fname;
	private double strength = 0;
	private Direction direction;
//	private MainObject obj;

	public Force() {
	}
	
	public Force(Fname fname) {
		this.fname = fname;
	}

	public Force(Fname fname, double strength, Direction direction, MainObject obj) {
		this.fname = fname;
		this.strength = strength;
		this.direction = direction;
//		this.obj = obj;
	}

	public Fname getFname() {
		return fname;
	}

	public void setFname(Fname fname) {
		this.fname = fname;
	}

//	public MainObject getObj() {
//		return obj;
//	}
//
//	public void setObj(MainObject obj) {
//		this.obj = obj;
//	}

	public double getStrength() {
		return strength;
	}

	public void setStrength(double strength) {
		this.strength = strength;
		if (fname != Fname.GRAVITATION) {
			this.setDirection();
		}
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public void setDirection() {
		if (strength > 0)
			setDirection(Direction.RIGHT);
		else if (strength < 0)
			setDirection(Direction.RIGHT);
	}
	
	public void recalStrAndDir() {
		setDirection();
	}
}
