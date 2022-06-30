package hust.ict.globalict.project.gui;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

public class DetailCheckboxPanel {

	public DetailCheckboxPanel(JFrame mainFrame) {
		JPanel detailCheckboxPanel = new JPanel();
		detailCheckboxPanel.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		detailCheckboxPanel.setBounds(1231, 10, 183, 224);
		mainFrame.getContentPane().add(detailCheckboxPanel);
		detailCheckboxPanel.setLayout(null);

		JPanel checkbox = new JPanel();
		checkbox.setBounds(16, 36, 157, 177);
		detailCheckboxPanel.add(checkbox);
		checkbox.setLayout(new GridLayout(0, 1, 0, 0));

		JCheckBox forceCB_1 = new JCheckBox("    Force");
		forceCB_1.setFocusable(false);
		forceCB_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		forceCB_1.setSelected(true);
		forceCB_1.setHorizontalAlignment(SwingConstants.LEFT);
		forceCB_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		checkbox.add(forceCB_1);

		JCheckBox sumOfForcesCB_1 = new JCheckBox("    Sum of Forces");
		sumOfForcesCB_1.setFocusable(false);
		sumOfForcesCB_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		sumOfForcesCB_1.setHorizontalAlignment(SwingConstants.LEFT);
		sumOfForcesCB_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		checkbox.add(sumOfForcesCB_1);

		JCheckBox valueOfForcesCB_1 = new JCheckBox("    Value Of Forces");
		valueOfForcesCB_1.setFocusable(false);
		valueOfForcesCB_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		valueOfForcesCB_1.setHorizontalAlignment(SwingConstants.LEFT);
		valueOfForcesCB_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		checkbox.add(valueOfForcesCB_1);

		JCheckBox massCB_1 = new JCheckBox("    Mass");
		massCB_1.setFocusable(false);
		massCB_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		massCB_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		checkbox.add(massCB_1);

		JCheckBox speedCB_1 = new JCheckBox("    Speed");
		speedCB_1.setFocusable(false);
		speedCB_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		speedCB_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		checkbox.add(speedCB_1);

		JCheckBox accelerationCB_1 = new JCheckBox("    Acceleration");
		accelerationCB_1.setFocusable(false);
		accelerationCB_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		accelerationCB_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		checkbox.add(accelerationCB_1);

		JLabel lblNewLabel = new JLabel("More Details");
		lblNewLabel.setLabelFor(detailCheckboxPanel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 183, 37);
		detailCheckboxPanel.add(lblNewLabel);
	}

}
