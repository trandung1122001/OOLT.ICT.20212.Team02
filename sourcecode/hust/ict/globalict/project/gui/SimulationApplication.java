package hust.ict.globalict.project.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.border.SoftBevelBorder;

import hust.ict.globalict.project.controller.SimulationController;
import hust.ict.globalict.project.utils.Constants.Fname;
import hust.ict.globalict.project.utils.Constants.SimState;

import javax.swing.border.BevelBorder;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.event.HierarchyListener;
import java.awt.event.HierarchyEvent;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.Color;
import javax.swing.UIManager;

public class SimulationApplication {

	private JFrame frame;
	private SimulationController simCtrl;
	private int deltaT = 1000; // ms

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
		DetailCheckboxPanel detailPanel = new DetailCheckboxPanel(simCtrl,  massLb, speedDisplay);
		frame.getContentPane().add(detailPanel);

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
		
		JPanel panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBounds(671, 51, 316, 90);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(12, 21, 89, 47);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(113, 21, 89, 47);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("New button");
		btnNewButton_1_1.setBounds(214, 21, 89, 47);
		panel.add(btnNewButton_1_1);

	}
}
