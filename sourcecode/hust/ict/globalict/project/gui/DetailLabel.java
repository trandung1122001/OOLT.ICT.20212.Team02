package hust.ict.globalict.project.gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import hust.ict.globalict.project.controller.SimulationController;
import hust.ict.globalict.project.utils.Constants;
import hust.ict.globalict.project.utils.Constants.Fname;
import hust.ict.globalict.project.utils.Constants.SimState;

public class DetailLabel extends JLabel implements ActionListener{
	
	private SimulationController simCtrl;
	private Fname fn;

	public DetailLabel(SimulationController simCtrl, Fname fn) {
		this.simCtrl = simCtrl;
		this.fn = fn;
		setSize(121, 60);
		Timer timer = new Timer(Constants.DELTA_TIME_MILISECS, (ActionListener) this);
		timer.setInitialDelay(1);
		timer.start();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if (simCtrl.getStates().contains(SimState.SHOWING_FORCES_VALUE)) {
			setVisible(true);
			if (fn == Fname.APPLIEDFORCE) {
				setText(String.format("AppliedForce = %.2f N", Math.abs(simCtrl.getAppliedF().getStrength())));
				setHorizontalAlignment(SwingConstants.CENTER);
				setFont(new Font("Tahoma", Font.BOLD, 12));
				setBounds(632, 370, 160, 28);
			} else if (fn == Fname.FRICTION) {
				setText(String.format("Friction = %.2f N", Math.abs(simCtrl.getFriction().getStrength())));
				setHorizontalAlignment(SwingConstants.CENTER);
				setFont(new Font("Tahoma", Font.BOLD, 12));
				setBounds(614, 469, 195, 28);
			} else if (fn == Fname.SUMOFFORCES) {
				setText(String.format("SumOfForces = %.2f N", Math.abs(simCtrl.getSumOfForce().getStrength())));
				setHorizontalAlignment(SwingConstants.CENTER);
				setFont(new Font("Tahoma", Font.BOLD, 12));
				setBounds(632, 272, 160, 28);
			}
		} else setVisible(false);

	}
}
