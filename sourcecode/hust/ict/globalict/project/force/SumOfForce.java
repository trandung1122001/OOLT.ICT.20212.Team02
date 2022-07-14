package hust.ict.globalict.project.force;

import hust.ict.globalict.project.utils.Constants.Fname;

public class SumOfForce extends Force {
	public SumOfForce() {
		this.setFname(Fname.SUMOFFORCES);
	}

	public void recalStrAndDir(Force app, Force fri) {
		if (app != null && fri != null) {
			this.setStrength(app.getStrength() + fri.getStrength());
		} else
			this.setStrength(0);
	}
}
