package hust.ict.globalict.project.force;

import hust.ict.globalict.project.object.MainObject;
import hust.ict.globalict.project.surface.Surface;
import hust.ict.globalict.project.utils.Constants.*;

public class Friction extends Force {
	private Surface sf;
	private Force appliedF;

	public Friction(Surface sf, MainObject obj, Force appliedF) {
		this.setFname(Fname.FRICTION);
		this.setSf(sf);
		this.setObj(obj);
		this.setAppliedForce(appliedF);
		recalStrAndDir();
		if (appliedF.getDirection() == Direction.LEFT)
			this.setDirection(Direction.RIGHT);
		else
			this.setDirection(Direction.LEFT);
	}

	@Override
	public void recalStrAndDir() {
		double a = Math.abs(appliedF.getStrength());
		double n = this.getObj().getMass() * 10;
		double sc = sf.getStaticCoefficient();
		double kc = sf.getKineticCoefficient();
		double rlt = 0;
		if (this.getObj().getShape() == Shape.CUBE) {
			if (a <= n * sc)
				rlt = a;
			else
				rlt = n * kc;
		} else if (this.getObj().getShape() == Shape.CYLINDER) {
			if (a <= 3 * n * sc)
				rlt = a / 3;
			else
				rlt = n * kc;
		}
		if (appliedF.getStrength() > 0) {
			setStrength(rlt * -1);
			setDirection(Direction.LEFT);
		} else {

			setStrength(rlt);
			setDirection(Direction.RIGHT);
		}
	}

	public Surface getSf() {
		return sf;
	}

	public void setSf(Surface sf) {
		this.sf = sf;
	}

	public void setAppliedForce(Force appliedForce) {
		this.appliedF = appliedForce;
	}
}
