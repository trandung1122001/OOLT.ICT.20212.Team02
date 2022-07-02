package hust.ict.globalict.project.gui;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import hust.ict.globalict.project.controller.SimulationController;
import hust.ict.globalict.project.utils.Constants;
import hust.ict.globalict.project.utils.Constants.SimState;

public class FrictionPanel extends JPanel {

	public FrictionPanel(SimulationController simCtrl, ForceDisplay frictionDisplay) {
		setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		setBounds(1124, 549, 290, 300);
		setLayout(null);
		
		JLabel frictonLb = new JLabel("Friction");
		JPanel kineticPanel = new JPanel();
		JLabel kineticLb = new JLabel("Kinetic coefficient");
		kineticLb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		JTextField kcTextField = new JTextField();
		JSlider kcSlder = new JSlider();
		JPanel staticPanel = new JPanel();
		JLabel staticLb = new JLabel("Static coefficient");
		staticLb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		JTextField scTextField = new JTextField();
		JSlider scSlder = new JSlider();
		
		frictonLb.setBounds(10, 11, 271, 32);
		add(frictonLb);
		frictonLb.setHorizontalAlignment(SwingConstants.CENTER);
		frictonLb.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		//static Panel
		staticPanel.setBounds(10, 54, 271, 105);
		add(staticPanel);
		staticPanel.setLayout(null);
		staticPanel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));

		
		staticLb.setBounds(36, 11, 111, 20);
		staticPanel.add(staticLb);

		
		scSlder.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		scTextField.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent e) {
				try {
					Double value = Double.parseDouble(scTextField.getText())/ 0.018;
					simCtrl.updateKineticCoef(value);
					scSlder.setValue(value.intValue());
					kcSlder.setMaximum(value.intValue());
				} catch (NumberFormatException ex) {
					scTextField.setText(String.format("%.2f", simCtrl.getSurface().getStaticCoefficient()));
				}

			}
		});

		scSlder.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				kcSlder.setMaximum(scSlder.getValue());
				simCtrl.updateStaticCoef(scSlder.getValue() * 0.018);
				scTextField.setText(String.format("%.2f", simCtrl.getSurface().getStaticCoefficient()));
			}
		});

		scTextField.setText("0");
		scTextField.setHorizontalAlignment(SwingConstants.CENTER);
		scTextField.setBounds(157, 11, 50, 20);
		staticPanel.add(scTextField);
		scSlder.setValue(0);
		scSlder.setRequestFocusEnabled(false);
		scSlder.setPaintTicks(true);
		scSlder.setMinorTickSpacing(10);
		scSlder.setMajorTickSpacing(100);
		scSlder.setFont(new Font("Tahoma", Font.PLAIN, 12));
		scSlder.setBounds(36, 41, 200, 53);
		staticPanel.add(scSlder);
		
		//kinetic Panel
		kineticPanel.setBounds(10, 171, 271, 105);
		add(kineticPanel);
		kineticPanel.setLayout(null);
		kineticPanel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));

		
		kineticLb.setBounds(36, 11, 111, 20);
		kineticPanel.add(kineticLb);

		
		kcSlder.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		kcTextField.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent e) {
				try {
					Double value = Double.parseDouble(kcTextField.getText()) / 0.018;
					simCtrl.updateKineticCoef(value);
					kcSlder.setValue(value.intValue());
					scSlder.setMinimum(value.intValue());
					
				} catch (NumberFormatException ex) {
					kcTextField.setText(String.format("%.2f", simCtrl.getSurface().getKineticCoefficient()));
				}
			}
		});

		kcSlder.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				scSlder.setMinimum(kcSlder.getValue());
				simCtrl.updateKineticCoef(kcSlder.getValue() * 0.018);
				kcTextField.setText(String.format("%.2f", simCtrl.getSurface().getKineticCoefficient()));
			}
		});

		kcTextField.setText("0");
		kcTextField.setHorizontalAlignment(SwingConstants.CENTER);
		kcTextField.setBounds(157, 11, 50, 20);
		kineticPanel.add(kcTextField);
		kcSlder.setValue(0);
		kcSlder.setRequestFocusEnabled(false);
		kcSlder.setPaintTicks(true);
		kcSlder.setMinorTickSpacing(10);
		kcSlder.setMajorTickSpacing(100);
		kcSlder.setFont(new Font("Tahoma", Font.PLAIN, 12));
		kcSlder.setBounds(36, 41, 200, 53);
		kineticPanel.add(kcSlder);
	}

}
