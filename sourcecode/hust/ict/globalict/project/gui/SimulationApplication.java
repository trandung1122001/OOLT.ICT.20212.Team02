package hust.ict.globalict.project.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;

import hust.ict.globalict.project.controller.SimulationController;
import hust.ict.globalict.project.utils.Constants.Fname;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class SimulationApplication {

	private JFrame frame;
	private SimulationController simCtrl;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimulationApplication window = new SimulationApplication();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public SimulationApplication() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(UIManager.getColor("Button.shadow"));
		frame.setResizable(false);
		frame.setTitle("Interactive simulation of the composition of forces");
		frame.setBounds(100, 100, 1440, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.getContentPane().setLayout(null);
		simCtrl = new SimulationController();

		JLabel massLb = new JLabel();
		massLb.setHorizontalAlignment(SwingConstants.CENTER);
		massLb.setFont(new Font("Tahoma", Font.BOLD, 12));
		massLb.setBounds(637, 416, 150, 28);
		frame.getContentPane().add(massLb);

		DetailLabel afLb = new DetailLabel(simCtrl, Fname.APPLIEDFORCE);
		frame.getContentPane().add(afLb);
		DetailLabel fLb = new DetailLabel(simCtrl, Fname.FRICTION);
		frame.getContentPane().add(fLb);
		DetailLabel sofLb = new DetailLabel(simCtrl, Fname.SUMOFFORCES);
		frame.getContentPane().add(sofLb);
		ForceDisplay aFDisplay = new ForceDisplay(simCtrl, Fname.APPLIEDFORCE);
		frame.getContentPane().add(aFDisplay);
		ForceDisplay frictionDisplay = new ForceDisplay(simCtrl, Fname.FRICTION);
		frame.getContentPane().add(frictionDisplay);
		ForceDisplay sofDisplay = new ForceDisplay(simCtrl, Fname.SUMOFFORCES);
		frame.getContentPane().add(sofDisplay);
		SpeedDisplay speedDisplay = new SpeedDisplay(simCtrl);
		frame.getContentPane().add(speedDisplay);
		DetailCheckboxPanel detailPanel = new DetailCheckboxPanel(simCtrl, massLb, speedDisplay);
		frame.getContentPane().add(detailPanel);

		SimStatusPanel simStatusPanel = new SimStatusPanel(simCtrl);
		frame.getContentPane().add(simStatusPanel);
		ObjectParamPanel objParamPanel = new ObjectParamPanel(simCtrl, massLb);
		frame.getContentPane().add(objParamPanel);
		ObjectSelectedPanel objSelected = new ObjectSelectedPanel(simCtrl, objParamPanel);
		frame.getContentPane().add(objSelected);

		ObjectPanel objPanel = new ObjectPanel(simCtrl, frame, objSelected, objParamPanel);
		frame.getContentPane().add(objPanel);

		AppliedForcePanel appliedFPanel = new AppliedForcePanel(simCtrl, aFDisplay);
		frame.getContentPane().add(appliedFPanel);
		FrictionPanel frictionPanel = new FrictionPanel(simCtrl, frictionDisplay);
		frame.getContentPane().add(frictionPanel);

		SurfacePanel surfacePanel = new SurfacePanel();
		frame.getContentPane().add(surfacePanel);

	}
}
