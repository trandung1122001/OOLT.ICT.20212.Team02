package hust.ict.globalict.project.utils;

public final class Constants {
	public static final double MAX_COEFFCIENT = 0.018;

	public static final String RED_LEFT_ARROW = "/assets/force/redLeft.png";
	public static final String RED_RIGHT_ARROW = "/assets/force/redRight.png";
	public static final String BLUE_LEFT_ARROW = "/assets/force/blueLeft.png";
	public static final String BLUE_RIGHT_ARROW = "/assets/force/blueRight.png";
	public static final String YELLOW_LEFT_ARROW = "/assets/force/yellowLeft.png";
	public static final String YELLOW_RIGHT_ARROW = "/assets/force/yellowRight.png";
	public static final int DELTA_TIME_MILISECS = 1000;

	public static enum Direction {
		UP, 
		DOWN, 
		RIGHT, 
		LEFT
	}

	public static enum Fname {
		APPLIEDFORCE, 
		FRICTION, 
		GRAVITATION, 
		SUMOFFORCES
	}

	public static enum Shape {
		CUBE, 
		CYLINDER, 
		UNSHAPE
	}

	public enum SimState {
		RESTART, 
		PAUSE, 
		CONTINUE, 
		SHOWING_FORCES_ARROW, 
		SHOWING_SUMOFFORCES_ARROW, 
		SHOWING_FORCES_VALUE, 
		SHOWING_MASS,
		SHOWING_SPEED
	}
}
