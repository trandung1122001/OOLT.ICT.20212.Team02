package hust.ict.globalict.project.gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

public class AppliedForcePanel {

	private JTextField textField_2;

	public AppliedForcePanel(JFrame mainFrame) {
		JPanel appliedForcePanel = new JPanel();
		appliedForcePanel.setLayout(null);
		appliedForcePanel.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		appliedForcePanel.setBounds(822, 672, 291, 178);
		mainFrame.getContentPane().add(appliedForcePanel);

		JLabel lblAppliedForce = new JLabel("Applied Force");
		lblAppliedForce.setHorizontalAlignment(SwingConstants.CENTER);
		lblAppliedForce.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAppliedForce.setBounds(10, 11, 271, 32);
		appliedForcePanel.add(lblAppliedForce);

		JPanel forcePanel = new JPanel();
		forcePanel.setLayout(null);
		forcePanel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		forcePanel.setBounds(10, 55, 271, 105);
		appliedForcePanel.add(forcePanel);

		JButton decBtn_2 = new JButton("-");
		decBtn_2.setBounds(75, 11, 37, 23);
		forcePanel.add(decBtn_2);

		textField_2 = new JTextField();
		textField_2.setColumns(4);
		textField_2.setBounds(117, 12, 38, 20);
		forcePanel.add(textField_2);

		JButton incBtn_2 = new JButton("+");
		incBtn_2.setBounds(160, 11, 41, 23);
		forcePanel.add(incBtn_2);

		JSlider slider_2 = new JSlider();
		slider_2.setSnapToTicks(true);
		slider_2.setPaintTicks(true);
		slider_2.setPaintLabels(true);
		slider_2.setName("");
		slider_2.setMinorTickSpacing(10);
		slider_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		slider_2.setBounds(36, 41, 200, 31);
		forcePanel.add(slider_2);

		JLabel lblNewLabel_2_2 = new JLabel("-100N                         0N                      100N");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setFocusable(false);
		lblNewLabel_2_2.setBounds(11, 74, 251, 20);
		forcePanel.add(lblNewLabel_2_2);

	}

}
