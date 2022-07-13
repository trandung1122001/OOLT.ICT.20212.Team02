package hust.ict.globalict.project.force;

import java.util.ArrayList;
import hust.ict.globalict.project.utils.Constants.Fname;

public class SumOfForce extends Force {
	private ArrayList<Force> forces;
	
	public SumOfForce(Force... forces) {
		this.setFname(Fname.SUMOFFORCES);
		AddForce(forces);
	}

	public void AddForce(Force... forces) {
		for (Force f : forces) {
			this.forces.add(f);
		}
	}

	public Force GetForceByName(Fname fn) {
		for (Force f : this.forces) {
			if (f.getFname() == fn) {
				return f;
			}
		}
		return null;
	}
	
	@Override
	public void recalStrAndDir() {
		Force app = GetForceByName(Fname.APPLIEDFORCE);
		Force fri = GetForceByName(Fname.FRICTION);
		if (app != null && fri != null) {
			this.setStrength(app.getStrength() + fri.getStrength());
			super.recalStrAndDir();
		}
	}

}
