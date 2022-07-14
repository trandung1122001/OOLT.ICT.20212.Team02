package hust.ict.globalict.project.force;

import hust.ict.globalict.project.object.MainObject;
import hust.ict.globalict.project.utils.Constants.*;

public class Force {
	private Fname fname;
	private double strength = 0;
	private Direction direction;

	public Force() {
	}
	
	public Force(Fname fname) {
		this.fname = fname;
	}

	public Force(Fname fname, double strength, Direction direction, MainObject obj) {
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

	public double getStrength() {
		return strength;
	}

	public void setStrength(double strength) {
		this.strength = strength;
		if (this.fname != Fname.GRAVITATION) {
			this.recalStrAndDir();
		}
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}
	
	public void recalStrAndDir() {
		if (this.strength > 0)
			this.setDirection(Direction.RIGHT);
		else if (this.strength < 0)
			this.setDirection(Direction.LEFT);
	}
}
