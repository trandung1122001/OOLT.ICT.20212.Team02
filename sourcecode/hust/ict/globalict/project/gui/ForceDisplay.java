package hust.ict.globalict.project.gui;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;

import hust.ict.globalict.project.controller.SimulationController;
import hust.ict.globalict.project.force.Force;
import hust.ict.globalict.project.utils.Contants;
import hust.ict.globalict.project.utils.Contants.*;

public class ForceDisplay extends JLabel implements ActionListener {
	private SimulationController simCtrl;
	private Fname fn;
	private Force f;
	private Direction fdir;
	
	public ForceDisplay(SimulationController simCtrl, Fname fn) {
		this.simCtrl = simCtrl;
		this.fn = fn;
		setSize(121, 60);
		Timer timer = new Timer(1000, (ActionListener) this);
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
		
		if(simCtrl.getStates().contains(SimState.SHOWING_FORCES_ARROW)) {
			if (fn == Fname.APPLIEDFORCE) {
				f = simCtrl.getAppliedF();
				fdir = f.getDirection();
				if (fdir == Direction.LEFT)
					display(Contants.BLUE_LEFT_ARROW, new Point(590, 373));
				else if (fdir == Direction.RIGHT)
					display(Contants.BLUE_RIGHT_ARROW, new Point(715, 373));
			}
			else if (fn == Fname.FRICTION) {
				f = simCtrl.getFriction();
				fdir = f.getDirection();
				if (fdir == Direction.LEFT)
					display(Contants.RED_LEFT_ARROW, new Point(590, 473));
				else if (fdir == Direction.RIGHT)
					display(Contants.RED_RIGHT_ARROW, new Point(715, 473));
			}
		}
		if(simCtrl.getStates().contains(SimState.SHOWING_SUMOFFORCES_ARROW)) {
			if (fn == Fname.SUMOFFORCES) {
				f = simCtrl.getSumOfForce();
				fdir = f.getDirection();
				if (fdir == Direction.LEFT)
					display(Contants.YELLOW_LEFT_ARROW, new Point(590, 273));
				else if (fdir == Direction.RIGHT)
					display(Contants.YELLOW_RIGHT_ARROW, new Point(715, 273));
			}
		}
		
	}
}
