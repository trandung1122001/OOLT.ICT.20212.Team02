package hust.ict.globalict.project.surface;

public class Surface {
	private double kineticCoefficient;
	private double staticCoefficient;

	public Surface(double kc, double sc) {
		this.kineticCoefficient = kc;
		this.staticCoefficient = sc;
	}

	public double getStaticCoefficient() {
		return staticCoefficient;
	}

	public void setStaticCoefficient(double staticCoefficient) {
		this.staticCoefficient = staticCoefficient;
	}

	public double getKineticCoefficient() {
		return kineticCoefficient;
	}

	public void setKineticCoefficient(double kineticCoefficient) {
		this.kineticCoefficient = kineticCoefficient;
	}

}
