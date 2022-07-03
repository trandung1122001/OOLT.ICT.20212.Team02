package hust.ict.globalict.project.gui;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

import hust.ict.globalict.project.controller.SimulationController;
import hust.ict.globalict.project.utils.Constants.Shape;
import hust.ict.globalict.project.utils.Constants.SimState;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class ObjectParamPanel extends JPanel {
	private JTextField pText1, pText2;
	private JLabel pTitle1, pTitle2;
	
	public ObjectParamPanel(SimulationController simCtrl, JLabel massLb) {
		setVisible(false);
		setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		setLayout(null);
		setBounds(904, 308, 210, 90);
		pText1 = new JTextField();
		pText1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		pText1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				try {
					Double value = Double.parseDouble(pText1.getText());
					simCtrl.updateObjMass(value);
					if (simCtrl.getStates().contains(SimState.SHOWING_MASS)) {
						massLb.setText("[" + value + " " + "kg]");
					}
				} catch (NumberFormatException ex) {
					pText1.setText(simCtrl.getMainObj().getMass() + "");
				}
			}
		});
		pText1.setHorizontalAlignment(SwingConstants.CENTER);
		pText1.setColumns(4);
		pText1.setBounds(115, 11, 85, 30);
		add(pText1);

		pTitle1 = new JLabel();
		pTitle1.setHorizontalAlignment(SwingConstants.LEFT);
		pTitle1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		pTitle1.setBounds(10, 11, 86, 30);
		add(pTitle1);

		pText2 = new JTextField();
		pText2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		pText2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (simCtrl.getMainObj().getShape() == Shape.CUBE) {
					try {
						Double value = Double.parseDouble(pText2.getText());
						simCtrl.updateObjSideLength(value);
					} catch (NumberFormatException ex) {
						pText2.setText(simCtrl.getMainObj().getSideLength() + "");
					}
				}

				else if (simCtrl.getMainObj().getShape() == Shape.CYLINDER) {
					try {
						Double value = Double.parseDouble(pText2.getText());
						simCtrl.updateObjRadius(value);
					} catch (NumberFormatException ex) {
						pText2.setText(simCtrl.getMainObj().getRadius() + "");
					}
				}
			}
		});
		pText2.setHorizontalAlignment(SwingConstants.CENTER);
		pText2.setColumns(4);
		pText2.setBounds(115, 52, 85, 30);
		add(pText2);

		pTitle2 = new JLabel();
		pTitle2.setHorizontalAlignment(SwingConstants.LEFT);
		pTitle2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		pTitle2.setBounds(10, 52, 86, 30);
		add(pTitle2);
	}

	public void setTitle(String t1, String t2) {
		pTitle1.setText(t1);
		pTitle2.setText(t2);
	}

	public void setContent(double t1, double t2) {
		pText1.setText(t1 + "");
		pText2.setText(t2 + "");
	}
}
