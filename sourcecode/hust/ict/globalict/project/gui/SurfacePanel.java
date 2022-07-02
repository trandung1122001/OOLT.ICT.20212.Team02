package hust.ict.globalict.project.gui;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SurfacePanel extends JPanel {
	public SurfacePanel() {
		setLayout(null);
		setBounds(-38, 508, 1500, 30);
		JLabel surfaceDisplay = new JLabel();
		surfaceDisplay.setIcon(new ImageIcon(SurfacePanel.class.getResource("/assets/surface/surface.png")));
		surfaceDisplay.setBounds(0, 0, 1500, 30);
		add(surfaceDisplay);
	}
}
