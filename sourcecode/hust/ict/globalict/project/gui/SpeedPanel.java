package hust.ict.globalict.project.gui;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

public class SpeedPanel {

	public SpeedPanel(JFrame mainFrame) {
		JPanel speedPanel = new JPanel();
		speedPanel.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		speedPanel.setBounds(10, 10, 260, 120);
		mainFrame.getContentPane().add(speedPanel);
		speedPanel.setLayout(null);
		
		JLabel accelerationLb_1 = new JLabel("Angular Acceleration = 100 km/s2");
		accelerationLb_1.setHorizontalAlignment(SwingConstants.CENTER);
		accelerationLb_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		accelerationLb_1.setBounds(10, 60, 240, 50);
		speedPanel.add(accelerationLb_1);
		
		JLabel speedLb_1 = new JLabel("Angular Speed = 100 km/s");
		speedLb_1.setHorizontalAlignment(SwingConstants.CENTER);
		speedLb_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		speedLb_1.setBounds(10, 10, 240, 50);
		speedPanel.add(speedLb_1);
	}

}
