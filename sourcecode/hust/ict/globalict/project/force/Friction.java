package hust.ict.globalict.project.force;

import hust.ict.globalict.project.object.MainObject;
import hust.ict.globalict.project.surface.Surface;
import hust.ict.globalict.project.utils.Direction;
import hust.ict.globalict.project.utils.Fname;

public class Friction extends Force{
	private Surface sf;
	private Force appliedForce;
	private Force normalForce;
	
	public Friction(Surface sf, MainObject obj, Force normalF, Force appliedF) {
		this.setFname(Fname.Friction);
		this.setSf(sf);
		this.setObj(obj);
		this.setNormalForce(normalF);
		this.setAppliedForce(appliedF);
		if (appliedF.getDirection() == Direction.LEFT)
			this.setDirection(Direction.RIGHT);
		else this.setDirection(Direction.LEFT);
	}
	
	public void calFriction() {
		
	}

	public Surface getSf() {
		return sf;
	}

	public void setSf(Surface sf) {
		this.sf = sf;
	}

	public void setNormalForce(Force normalForce) {
		this.normalForce = normalForce;
	}

	public void setAppliedForce(Force appliedForce) {
		this.appliedForce = appliedForce;
	}

}
