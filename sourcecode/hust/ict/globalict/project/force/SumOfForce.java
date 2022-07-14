package hust.ict.globalict.project.force;

import java.util.ArrayList;
import hust.ict.globalict.project.utils.Constants.Fname;

public class SumOfForce extends Force {
	private ArrayList<Force> forces;
	private Friction fric;
	private Force app;
	private Gravitation gra;

	public SumOfForce(Force... forces) {
		this.setFname(Fname.SUMOFFORCES);
		AddForce(forces);
	}

	public void AddForce(Force... forces) {
		for (Force f : forces) {
			if (f.getFname() == Fname.FRICTION) {
				setFriction((Friction) f);
			} else if (f.getFname() == Fname.APPLIEDFORCE) {
				setAppliedForce(f);
			} else if (f.getFname() == Fname.GRAVITATION) {
				setGravitation((Gravitation) f);
			} else
				this.forces.add(f);
		}
		recalStrAndDir();
	}

//	public Force getForceByName(Fname fn) {
//		for (Force f : this.forces) {
//			if (f.getFname() == fn) {
//				return f;
//			}
//		}
//		return null;
//	}

	public void recalStrAndDir() {
		Force app = getAppliedForce();
		Force fri = getFriction();
		if (app != null && fri != null) {
			this.setStrength(app.getStrength() + fri.getStrength());
		} else this.setStrength(0);
	}

	public Friction getFriction() {
		return fric;
	}

	public void setFriction(Friction fric) {
		this.fric = fric;
	}

	public Force getAppliedForce() {
		return app;
	}

	public void setAppliedForce(Force app) {
		this.app = app;
	}

	public Gravitation getGravitation() {
		return gra;
	}

	public void setGravitation(Gravitation gra) {
		this.gra = gra;
	}

}
