package hust.ict.globalict.project.gui;

import javax.swing.JLabel;

import hust.ict.globalict.project.controller.SimulationController;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ObjectSelectedPanel extends JLabel {
	
	public ObjectSelectedPanel(SimulationController simCtrl, ObjectParamPanel paramPanel) {
		setLayout(null);
		addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e) {
				if(e.getButton() == MouseEvent.BUTTON3) {
					paramPanel.setVisible(!paramPanel.isVisible());
				}
			}
		});
	}
}
