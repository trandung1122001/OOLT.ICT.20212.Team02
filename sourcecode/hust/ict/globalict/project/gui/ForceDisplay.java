package hust.ict.globalict.project.gui;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;

import hust.ict.globalict.project.controller.SimulationController;
import hust.ict.globalict.project.force.Force;
import hust.ict.globalict.project.utils.Constants;
import hust.ict.globalict.project.utils.Constants.*;

public class ForceDisplay extends JLabel implements ActionListener {
	private SimulationController simCtrl;
	private Fname fn;
	private Force f;
	private Direction fdir;

	public ForceDisplay(SimulationController simCtrl, Fname fn) {
		this.simCtrl = simCtrl;
		this.fn = fn;
		setSize(121, 60);
		Timer timer = new Timer(Constants.DELTA_TIME * 1000, (ActionListener) this);
		timer.setInitialDelay(1);
		timer.start();
	}

	public void display(String path, Point p) {
		setLocation(p);
		setIcon(new ImageIcon(ForceDisplay.class.getResource(path)));
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (fn == Fname.SUMOFFORCES) {
			if (simCtrl.checkState(SimState.SHOWING_SUMOFFORCES_ARROW) 
					&& simCtrl.getSumOfForce().getStrength() != 0) {
				f = simCtrl.getSumOfForce();
				fdir = f.getDirection();
				if (fdir == Direction.LEFT)
					display(Constants.YELLOW_LEFT_ARROW, new Point(590, 273));
				else if (fdir == Direction.RIGHT)
					display(Constants.YELLOW_RIGHT_ARROW, new Point(715, 273));
			} else
				setVisible(false);
		} else if (simCtrl.checkState(SimState.SHOWING_FORCES_ARROW)) {
			if (fn == Fname.APPLIEDFORCE) {
				if (simCtrl.getSumOfForce().getAppliedForce().getStrength() != 0) {
					f = simCtrl.getSumOfForce().getAppliedForce();
					fdir = f.getDirection();
					if (fdir == Direction.LEFT)
						display(Constants.BLUE_LEFT_ARROW, new Point(590, 373));
					else if (fdir == Direction.RIGHT)
						display(Constants.BLUE_RIGHT_ARROW, new Point(715, 373));
				} else {
					setVisible(false);
				}
			} else if (fn == Fname.FRICTION) {
				if (simCtrl.getSumOfForce().getFriction().getStrength() != 0) {
					f = simCtrl.getSumOfForce().getFriction();
					fdir = f.getDirection();
					if (fdir == Direction.LEFT)
						display(Constants.RED_LEFT_ARROW, new Point(590, 473));
					else if (fdir == Direction.RIGHT)
						display(Constants.RED_RIGHT_ARROW, new Point(715, 473));
				} else {
					setVisible(false);
				}
			}
		} else
			setVisible(false);

	}
}
