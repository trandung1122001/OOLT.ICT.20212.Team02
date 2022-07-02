package hust.ict.globalict.project.force;

import hust.ict.globalict.project.object.MainObject;
import hust.ict.globalict.project.utils.Constants.*;

public class Force {
	private Fname fname;
	private double strength;
	private Direction direction;
	private MainObject obj;
	
	public Force() {
		this.strength = 0;
	}
	
	public Force(Fname fname, double strength, Direction direction) {
		this.fname = fname;
		this.strength = strength;
		this.direction = direction;
	}

	public Fname getFname() {
		return fname;
	}

	public void setFname(Fname fname) {
		this.fname = fname;
	}

	public MainObject getObj() {
		return obj;
	}

	public void setObj(MainObject obj) {
		this.obj = obj;
	}

	public double getStrength() {
		return strength;
	}

	public void setStrength(double strength) {
		if (fname != Fname.GRAVITATION) {
			if (strength > 0) setDirection(Direction.RIGHT);
			else if (strength < 0) setDirection(Direction.RIGHT);
		}
		this.strength = strength;
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

}
