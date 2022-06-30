package hust.ict.globalict.project.force;

import hust.ict.globalict.project.object.MainObject;
import hust.ict.globalict.project.utils.Direction;
import hust.ict.globalict.project.utils.Fname;

public class AppliedForce extends Force {

	public AppliedForce(MainObject obj, double strength, Direction dir) {
		this.setFname(Fname.AppliedF);
		this.setObj(obj);
		this.setStrength(strength);
		this.setDirection(dir);
	}

}
