package hust.ict.globalict.project.gui;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import hust.ict.globalict.project.utils.Shape;

import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

public class MainSimalationScreen {

	private JFrame mainFrame;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainSimalationScreen window = new MainSimalationScreen();
					window.mainFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MainSimalationScreen() {
		initialize();
	}

	private void initialize() {
		mainFrame = new JFrame();
		mainFrame.setResizable(false);
		mainFrame.setTitle("Interactive simulation of the composition of forces");
		mainFrame.setBounds(100, 100, 1440, 900);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.getContentPane().setLayout(null);
		
		
		
		

		new ObjectShapePanel(mainFrame);
		new SpeedPanel(mainFrame);
		new DetailCheckboxPanel(mainFrame);
		new FrictionPanel(mainFrame);
		new AppliedForcePanel(mainFrame);
		new SimStatusPanel(mainFrame);
		new SurfaceDisplay(mainFrame);
		mainFrame.setVisible(true);
	}
}
