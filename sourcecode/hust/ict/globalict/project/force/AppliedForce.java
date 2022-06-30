package hust.ict.globalict.project.force;

import hust.ict.globalict.project.object.MainObject;
import hust.ict.globalict.project.utils.Direction;

public class AppliedForce extends Force {

	public AppliedForce(MainObject obj, double strength, Direction dir) {
		this.setObj(obj);
		this.setStrength(strength);
		this.setDirection(dir);
	}

}
