package hust.ict.globalict.project.force;

import hust.ict.globalict.project.object.MainObject;
import hust.ict.globalict.project.surface.Surface;
import hust.ict.globalict.project.utils.Contants.*;

public class Friction extends Force {
	private Surface sf;
	private Gravitation gravitation;
	private AppliedForce appliedF;

	public Friction(Surface sf, MainObject obj, Gravitation gravitation, AppliedForce appliedF) {
		this.setFname(Fname.FRICTION);
		this.setSf(sf);
		this.setObj(obj);
		this.setGravitation(gravitation);
		this.setAppliedForce(appliedF);
		if (appliedF.getDirection() == Direction.LEFT)
			this.setDirection(Direction.RIGHT);
		else
			this.setDirection(Direction.LEFT);
	}

	public void calFriction() {

	}

	public Surface getSf() {
		return sf;
	}

	public void setSf(Surface sf) {
		this.sf = sf;
	}

	public void setGravitation(Gravitation gravitation) {
		this.gravitation = gravitation;
	}

	public void setAppliedForce(AppliedForce appliedForce) {
		this.appliedF = appliedForce;
	}

}
