package hust.ict.globalict.project.force;

import hust.ict.globalict.project.object.MainObject;
import hust.ict.globalict.project.utils.Constants.*;

public class Gravitation extends Force {

	public Gravitation() {
		this.setFname(Fname.GRAVITATION);
		this.setDirection(Direction.DOWN);
		recalStrAndDir();
	}
	
	public void recalStrAndDir(MainObject obj) {
		if (obj == null) {
			setStrength(0);
			return;
		}
		this.setStrength(obj.getMass() * 10);
	}
}
