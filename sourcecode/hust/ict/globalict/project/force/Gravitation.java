package hust.ict.globalict.project.force;

import hust.ict.globalict.project.object.MainObject;
import hust.ict.globalict.project.utils.Constants.*;

public class Gravitation extends Force {

	public Gravitation(MainObject obj) {
		this.setFname(Fname.GRAVITATION);
		this.setObj(obj);
		this.setStrength(obj.getMass() * 10);
		this.setDirection(Direction.DOWN);
	}
}
