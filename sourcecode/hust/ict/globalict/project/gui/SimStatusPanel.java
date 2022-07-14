package hust.ict.globalict.project.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

import hust.ict.globalict.project.controller.SimulationController;

public class SimStatusPanel extends JPanel implements ActionListener {

	public SimStatusPanel(SimulationController simCtrl) {
		setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		setBounds(671, 51, 316, 90);
		setLayout(null);
		JButton pauseBtn = new JButton("Pause");
		pauseBtn.setBounds(12, 21, 89, 47);
		add(pauseBtn);

		JButton continueBtn = new JButton("Continue");
		continueBtn.setBounds(113, 21, 89, 47);
		add(continueBtn);

		JButton resetBtn = new JButton("Reset");
		resetBtn.setBounds(214, 21, 89, 47);
		add(resetBtn);

		pauseBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				simCtrl.pauseSimulation();
			}
		});

		continueBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				simCtrl.continueSimulation();
			}
		});
		
		resetBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				simCtrl.resetSimulation();
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
