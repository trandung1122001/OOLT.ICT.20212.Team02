package hust.ict.globalict.project.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.border.SoftBevelBorder;

import hust.ict.globalict.project.controller.SimulationController;
import hust.ict.globalict.project.utils.Contants.Fname;
import hust.ict.globalict.project.utils.Contants.SimState;

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
		
		JLabel afLb = new JLabel("AppliedForce = 10N");
		afLb.setHorizontalAlignment(SwingConstants.CENTER);
		afLb.setFont(new Font("Tahoma", Font.BOLD, 12));
		afLb.setBounds(632, 370, 160, 28);
		frame.getContentPane().add(afLb);
		
		JLabel fLb = new JLabel("Friction = 10N");
		fLb.setHorizontalAlignment(SwingConstants.CENTER);
		fLb.setFont(new Font("Tahoma", Font.BOLD, 12));
		fLb.setBounds(614, 469, 195, 28);
		frame.getContentPane().add(fLb);
		
		JLabel sofLb = new JLabel("SumOfForces = 10N");
		sofLb.setHorizontalAlignment(SwingConstants.CENTER);
		sofLb.setFont(new Font("Tahoma", Font.BOLD, 12));
		sofLb.setBounds(632, 272, 160, 28);
		frame.getContentPane().add(sofLb);

		ForceDisplay aFDisplay = new ForceDisplay(simCtrl, Fname.APPLIEDFORCE);
		frame.getContentPane().add(aFDisplay);
		ForceDisplay frictionDisplay = new ForceDisplay(simCtrl, Fname.FRICTION);
		frame.getContentPane().add(frictionDisplay);
		ForceDisplay sofDisplay = new ForceDisplay(simCtrl, Fname.SUMOFFORCES);
		frame.getContentPane().add(sofDisplay);
		DetailCheckboxPanel detailPanel = new DetailCheckboxPanel(simCtrl, aFDisplay, frictionDisplay, sofDisplay, massLb);
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
		
		
		
	}
}
