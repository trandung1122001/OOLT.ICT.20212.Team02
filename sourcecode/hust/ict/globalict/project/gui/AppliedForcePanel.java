package hust.ict.globalict.project.gui;

import javax.swing.JPanel;
import javax.swing.border.SoftBevelBorder;

import hust.ict.globalict.project.controller.SimulationController;

import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.Cursor;

public class AppliedForcePanel extends JPanel {
	public AppliedForcePanel(SimulationController simCtrl, ForceDisplay aFDisplay) {
		setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		setBounds(824, 670, 290, 180);
		setLayout(null);

		JLabel lblAppliedForce = new JLabel("Applied Force");
		lblAppliedForce.setBounds(10, 11, 271, 32);
		add(lblAppliedForce);
		lblAppliedForce.setHorizontalAlignment(SwingConstants.CENTER);
		lblAppliedForce.setFont(new Font("Tahoma", Font.BOLD, 15));

		JPanel forcePanel = new JPanel();
		forcePanel.setBounds(10, 55, 271, 105);
		add(forcePanel);
		forcePanel.setLayout(null);
		forcePanel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));

		JLabel afUnitLB = new JLabel("newtons");
		afUnitLB.setFont(new Font("Tahoma", Font.PLAIN, 14));
		afUnitLB.setBounds(147, 11, 60, 20);
		forcePanel.add(afUnitLB);

		JTextField afTextField = new JTextField();

		JSlider afSlder = new JSlider();
		afSlder.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		afTextField.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent e) {
				try {
					Double value = Double.parseDouble(afTextField.getText());
					simCtrl.updateAppliedFStrength(value);
					afSlder.setValue(value.intValue());
				} catch (NumberFormatException ex) {
					afTextField.setText(simCtrl.getAppliedForce().getStrength() + "");
				}
			}
		});

		afSlder.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				simCtrl.updateAppliedFStrength(afSlder.getValue());
				afTextField.setText(simCtrl.getAppliedForce().getStrength() + "");
			}
		});

		afTextField.setText("0");
		afTextField.setHorizontalAlignment(SwingConstants.CENTER);
		afTextField.setBounds(86, 11, 53, 20);
		forcePanel.add(afTextField);
		afSlder.setValue(0);
		afSlder.setRequestFocusEnabled(false);
		afSlder.setPaintTicks(true);
		afSlder.setPaintLabels(true);
		afSlder.setMinorTickSpacing(10);
		afSlder.setMinimum(-100);
		afSlder.setMajorTickSpacing(100);
		afSlder.setFont(new Font("Tahoma", Font.PLAIN, 12));
		afSlder.setBounds(36, 41, 200, 53);
		forcePanel.add(afSlder);

	}

}
