package hust.ict.globalict.project.gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

public class SimStatusPanel {

	public SimStatusPanel(JFrame mainFrame) {
		JPanel simStatusPanel = new JPanel();
		simStatusPanel.setLayout(null);
		simStatusPanel.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		simStatusPanel.setBounds(566, 76, 291, 101);
		mainFrame.getContentPane().add(simStatusPanel);
				
		JPanel statusPanel = new JPanel();
		statusPanel.setLayout(null);
		statusPanel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		statusPanel.setBounds(10, 11, 271, 79);
		simStatusPanel.add(statusPanel);
				
		JButton pauseBtn = new JButton("Pause");
		pauseBtn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		pauseBtn.setBounds(10, 21, 89, 39);
		statusPanel.add(pauseBtn);
				
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnReset.setBounds(172, 21, 89, 39);
		statusPanel.add(btnReset);
	}

}
