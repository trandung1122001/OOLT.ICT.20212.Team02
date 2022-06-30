package hust.ict.globalict.project.gui;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SurfaceDisplay {

	public SurfaceDisplay(JFrame mainFrame) {
		JLabel surfaceDisplay = new JLabel("");
		surfaceDisplay.setIcon(new ImageIcon(MainSimalationScreen.class.getResource("/assets/surface/surface.png")));
		surfaceDisplay.setBounds(-38, 508, 1500, 30);
		mainFrame.getContentPane().add(surfaceDisplay);
	}

}
