package hust.ict.globalict.project.force;

import hust.ict.globalict.project.object.MainObject;
import hust.ict.globalict.project.surface.Surface;
import hust.ict.globalict.project.utils.Constants.*;

public class Friction extends Force {

	public Friction() {
		this.setFname(Fname.FRICTION);
		recalStrAndDir();
	}

	public void recalStrAndDir(MainObject obj, Force appliedF, Surface sf) {
		if (obj == null) {
			setStrength(0);
			return;
		}
		double a = Math.abs(appliedF.getStrength());
		double n = obj.getMass() * 10;
		double sc = sf.getStaticCoefficient();
		double kc = sf.getKineticCoefficient();
		double rlt = 0;
		if (obj.getShape() == Shape.CUBE) {
			if (a <= n * sc)
				rlt = a;
			else
				rlt = n * kc;
		} else if (obj.getShape() == Shape.CYLINDER) {
			if (a <= 3 * n * sc)
				rlt = a / 3;
			else
				rlt = n * kc;
		}
		if (appliedF.getStrength() > 0) {
			setStrength(rlt * -1);
		} else {
			setStrength(rlt);
		}
		
	}
}
