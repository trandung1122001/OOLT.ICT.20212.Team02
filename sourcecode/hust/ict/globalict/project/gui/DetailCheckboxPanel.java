package hust.ict.globalict.project.gui;

import javax.swing.JPanel;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;

import hust.ict.globalict.project.controller.SimulationController;
import hust.ict.globalict.project.utils.Constants.SimState;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class DetailCheckboxPanel extends JPanel {

	public DetailCheckboxPanel(SimulationController simCtrl, JLabel massLb, SpeedDisplay speedDisplay) {
		setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		setLayout(null);
		setBounds(1184, 11, 230, 250);

		JPanel checkbox = new JPanel();
		checkbox.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		checkbox.setBounds(15, 59, 200, 177);
		add(checkbox);

		JLabel lblNewLabel = new JLabel("More Details ");
		lblNewLabel.setBounds(5, 11, 220, 37);
		add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		checkbox.setLayout(null);

		JCheckBox forceCB = new JCheckBox("Forces");
		forceCB.setBounds(18, 3, 179, 34);
		forceCB.setIconTextGap(25);
		forceCB.setSelected(false);
		forceCB.setHorizontalAlignment(SwingConstants.LEFT);
		forceCB.setFont(new Font("Tahoma", Font.PLAIN, 13));
		forceCB.setFocusable(false);
		checkbox.add(forceCB);

		JCheckBox sumOfForcesCB = new JCheckBox("Sum of Forces");
		sumOfForcesCB.setBounds(18, 37, 179, 34);
		sumOfForcesCB.setIconTextGap(25);
		sumOfForcesCB.setHorizontalAlignment(SwingConstants.LEFT);
		sumOfForcesCB.setFont(new Font("Tahoma", Font.PLAIN, 13));
		sumOfForcesCB.setFocusable(false);
		checkbox.add(sumOfForcesCB);

		JCheckBox valueOfForcesCB = new JCheckBox("Value Of Forces");
		valueOfForcesCB.setBounds(18, 71, 179, 34);
		valueOfForcesCB.setIconTextGap(25);
		valueOfForcesCB.setHorizontalAlignment(SwingConstants.LEFT);
		valueOfForcesCB.setFont(new Font("Tahoma", Font.PLAIN, 13));
		valueOfForcesCB.setFocusable(false);
		checkbox.add(valueOfForcesCB);

		JCheckBox massCB = new JCheckBox("Mass");
		massCB.setBounds(18, 105, 179, 34);
		massCB.setIconTextGap(25);
		massCB.setFont(new Font("Tahoma", Font.PLAIN, 13));
		massCB.setFocusable(false);
		checkbox.add(massCB);

		JCheckBox speedCB = new JCheckBox("Speed & Acceleration");
		speedCB.setBounds(18, 139, 179, 34);
		speedCB.setIconTextGap(25);
		speedCB.setFont(new Font("Tahoma", Font.PLAIN, 13));
		speedCB.setFocusable(false);
		checkbox.add(speedCB);

		forceCB.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == 1) {
					simCtrl.addState(SimState.SHOWING_FORCES_ARROW);
				} else {
					simCtrl.removeState(SimState.SHOWING_FORCES_ARROW);
				}

			}
		});
		sumOfForcesCB.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == 1) {
					simCtrl.addState(SimState.SHOWING_SUMOFFORCES_ARROW);
				} else {
					simCtrl.removeState(SimState.SHOWING_SUMOFFORCES_ARROW);
				}
			}
		});
		valueOfForcesCB.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == 1)
					simCtrl.addState(SimState.SHOWING_FORCES_VALUE);
				else
					simCtrl.removeState(SimState.SHOWING_FORCES_VALUE);
			}
		});
		massCB.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == 1) {
					simCtrl.addState(SimState.SHOWING_MASS);
					massLb.setVisible(true);
					massLb.setText("[" + simCtrl.getMainObj().getMass() + " kg]");
				} else {
					simCtrl.removeState(SimState.SHOWING_MASS);
					massLb.setVisible(false);
				}
			}
		});
		speedCB.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == 1) {
					simCtrl.removeState(SimState.SHOWING_SPEED);
				}
				else {
					simCtrl.removeState(SimState.SHOWING_SPEED);
				}
					
			}
		});
	}

}
