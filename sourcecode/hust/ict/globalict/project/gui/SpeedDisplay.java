package hust.ict.globalict.project.gui;

import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.Timer;

import hust.ict.globalict.project.controller.SimulationController;
import hust.ict.globalict.project.utils.Constants;
import hust.ict.globalict.project.utils.Constants.Fname;
import hust.ict.globalict.project.utils.Constants.Shape;
import hust.ict.globalict.project.utils.Constants.SimState;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Cursor;

public class SpeedDisplay extends JPanel implements ActionListener {
	private JTextField tf1, tf2, tf3;
	private JLabel lb1, lb2, lb3;
	private SimulationController simCtrl;

	public SpeedDisplay(SimulationController simCtrl) {

		this.simCtrl = simCtrl;

		setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		setLayout(null);
		setLocation(10, 10);
		setSize(300, 170);
		setVisible(false);

		tf1 = new JTextField();
		tf1.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		tf1.setFocusable(false);
		tf1.setHorizontalAlignment(SwingConstants.CENTER);
		tf1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		tf1.setColumns(4);
		tf1.setBounds(201, 20, 77, 30);
		add(tf1);
		lb1 = new JLabel();
		lb1.setHorizontalAlignment(SwingConstants.LEFT);
		lb1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lb1.setBounds(27, 17, 175, 34);
		add(lb1);
		tf2 = new JTextField();
		tf2.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		tf2.setFocusable(false);
		tf2.setHorizontalAlignment(SwingConstants.CENTER);
		tf2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		tf2.setColumns(4);
		tf2.setBounds(201, 70, 77, 30);
		add(tf2);
		lb2 = new JLabel();
		lb2.setHorizontalAlignment(SwingConstants.LEFT);
		lb2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lb2.setBounds(27, 68, 175, 34);
		add(lb2);

		Timer timer = new Timer(Constants.DELTA_TIME, (ActionListener) this);

		tf3 = new JTextField();
		tf3.setHorizontalAlignment(SwingConstants.CENTER);
		tf3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		tf3.setFocusable(false);
		tf3.setColumns(4);
		tf3.setBounds(201, 120, 77, 30);
		add(tf3);

		lb3 = new JLabel();
		lb3.setHorizontalAlignment(SwingConstants.LEFT);
		lb3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lb3.setBounds(27, 119, 175, 34);
		add(lb3);
		timer.setInitialDelay(1);
		timer.start();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (simCtrl.checkState(SimState.SHOWING_SPEED)) {
			setVisible(true);
//			simCtrl.calAcceleration();
			
			if (!simCtrl.checkState(SimState.PAUSE)) {
				simCtrl.recalSimulation();
			}
			tf1.setText(String.format("%.2f", Math.abs(simCtrl.getMainObj().getAcceleration())));
			tf2.setText(String.format("%.2f", Math.abs(simCtrl.getMainObj().getVelocity())));
			double p = simCtrl.getMainObj().getPosition();
			
			
			if (simCtrl.getMainObj().getShape() == Shape.CUBE) {
				lb1.setText("Acceleration [m/s2]");
				lb2.setText("Velocity [m/s]");
				if (p > 1000) {
					tf3.setText(String.format("%.2f", p/1000));
					lb3.setText("Position [km]");
				} else {
					tf3.setText(String.format("%.2f", p));
					lb3.setText("Position [m]");
				}
			} else if (simCtrl.getMainObj().getShape() == Shape.CYLINDER) {
				lb1.setText("Angular Acceleration [rad/s2]");
				lb2.setText("Angular Velocity [rad/s]");
				if (p > 1000) {
					tf3.setText(String.format("%.2f", p/1000));
					lb3.setText("Angular Position [km]");
				} else {
					tf3.setText(String.format("%.2f", p));
					lb3.setText("Angular Position [m]");
				}
			}
		} else
			setVisible(false);
	}
}
