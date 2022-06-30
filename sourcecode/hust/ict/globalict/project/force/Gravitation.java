package hust.ict.globalict.project.force;

import hust.ict.globalict.project.object.MainObject;
import hust.ict.globalict.project.utils.Direction;
import hust.ict.globalict.project.utils.Fname;

public class Gravitation extends Force{

	public Gravitation(MainObject obj) {
		this.setFname(Fname.Gravitation);
		this.setObj(obj);
		this.setStrength(obj.getMass() * 10);
		this.setDirection(Direction.DOWN);
	}
}
