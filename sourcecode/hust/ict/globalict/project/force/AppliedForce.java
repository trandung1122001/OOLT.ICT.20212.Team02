package hust.ict.globalict.project.force;

import hust.ict.globalict.project.object.MainObject;
import hust.ict.globalict.project.utils.Contants.*;

public class AppliedForce extends Force {

	public AppliedForce(MainObject obj, double strength, Direction dir) {
		this.setFname(Fname.APPLIEDFORCE);
		this.setObj(obj);
		this.setStrength(strength);
		this.setDirection(dir);
	}
	
	public AppliedForce(MainObject obj) {
		this.setFname(Fname.APPLIEDFORCE);
		this.setObj(obj);
		this.setStrength(0);
	}
}
