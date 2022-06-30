package hust.ict.globalict.project.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import java.awt.Cursor;
import javax.swing.JSlider;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import java.awt.Rectangle;
import java.awt.FlowLayout;
import java.awt.SystemColor;
import javax.swing.ImageIcon;

public class test {

	private JFrame frmInteractiveSimulationOf;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test window = new test();
					window.frmInteractiveSimulationOf.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmInteractiveSimulationOf = new JFrame();
		frmInteractiveSimulationOf.setResizable(false);
		frmInteractiveSimulationOf.setTitle("Interactive simulation of the composition of forces");
		frmInteractiveSimulationOf.setBounds(100, 100, 1440, 900);
		frmInteractiveSimulationOf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmInteractiveSimulationOf.getContentPane().setLayout(null);
		
		JPanel speedPanel = new JPanel();
		speedPanel.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		speedPanel.setBounds(10, 10, 260, 120);
		frmInteractiveSimulationOf.getContentPane().add(speedPanel);
		speedPanel.setLayout(null);
		
		JLabel accelerationLb_1 = new JLabel("Angular Acceleration = 100 km/s2");
		accelerationLb_1.setHorizontalAlignment(SwingConstants.CENTER);
		accelerationLb_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		accelerationLb_1.setBounds(10, 60, 240, 50);
		speedPanel.add(accelerationLb_1);
		
		JLabel speedLb_1 = new JLabel("AngularSpeed = 100 km/s");
		speedLb_1.setHorizontalAlignment(SwingConstants.CENTER);
		speedLb_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		speedLb_1.setBounds(10, 10, 240, 50);
		speedPanel.add(speedLb_1);
		
		JPanel detailCheckbox = new JPanel();
		detailCheckbox.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		detailCheckbox.setBounds(1231, 10, 183, 224);
		frmInteractiveSimulationOf.getContentPane().add(detailCheckbox);
		detailCheckbox.setLayout(null);
		
		JPanel checkbox = new JPanel();
		checkbox.setBounds(16, 36, 157, 177);
		detailCheckbox.add(checkbox);
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
		lblNewLabel.setLabelFor(detailCheckbox);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 183, 37);
		detailCheckbox.add(lblNewLabel);
		
		JPanel frictionPanel = new JPanel();
		frictionPanel.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		frictionPanel.setBounds(1123, 560, 291, 290);
		frmInteractiveSimulationOf.getContentPane().add(frictionPanel);
		frictionPanel.setLayout(null);
		
		JLabel Firction = new JLabel("Friction");
		Firction.setLabelFor(frictionPanel);
		Firction.setHorizontalAlignment(SwingConstants.CENTER);
		Firction.setBounds(10, 11, 271, 32);
		Firction.setFont(new Font("Tahoma", Font.BOLD, 13));
		frictionPanel.add(Firction);
		
		JPanel staticPanel = new JPanel();
		staticPanel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		staticPanel.setBounds(10, 55, 271, 105);
		frictionPanel.add(staticPanel);
		staticPanel.setLayout(null);
		
		JButton decBtn = new JButton("-");
		decBtn.setBounds(135, 7, 37, 23);
		staticPanel.add(decBtn);
		
		textField = new JTextField();
		textField.setBounds(177, 8, 38, 20);
		staticPanel.add(textField);
		textField.setColumns(4);
		
		JButton incBtn = new JButton("+");
		incBtn.setBounds(220, 7, 41, 23);
		incBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		staticPanel.add(incBtn);
		
		JSlider slider = new JSlider();
		slider.setBounds(35, 41, 200, 31);
		slider.setFont(new Font("Tahoma", Font.PLAIN, 12));
		slider.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		slider.setName("");
		slider.setMinorTickSpacing(10);
		slider.setPaintLabels(true);
		slider.setSnapToTicks(true);
		slider.setPaintTicks(true);
		staticPanel.add(slider);
		
		JLabel lblNewLabel_2 = new JLabel("-100N                         0N                      100N");
		lblNewLabel_2.setFocusable(false);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(10, 74, 251, 20);
		staticPanel.add(lblNewLabel_2);
		
		JLabel staticTitle = new JLabel("Static Coefficient");
		staticTitle.setFont(new Font("Tahoma", Font.PLAIN, 13));
		staticTitle.setBounds(10, 11, 115, 19);
		staticPanel.add(staticTitle);
		
		JPanel kineticPanel = new JPanel();
		kineticPanel.setLayout(null);
		kineticPanel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		kineticPanel.setBounds(10, 171, 271, 105);
		frictionPanel.add(kineticPanel);
		
		JButton decBtn_1 = new JButton("-");
		decBtn_1.setBounds(135, 7, 37, 23);
		kineticPanel.add(decBtn_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(4);
		textField_1.setBounds(177, 8, 38, 20);
		kineticPanel.add(textField_1);
		
		JButton incBtn_1 = new JButton("+");
		incBtn_1.setBounds(220, 7, 41, 23);
		kineticPanel.add(incBtn_1);
		
		JSlider slider_1 = new JSlider();
		slider_1.setSnapToTicks(true);
		slider_1.setPaintTicks(true);
		slider_1.setPaintLabels(true);
		slider_1.setName("");
		slider_1.setMinorTickSpacing(10);
		slider_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		slider_1.setBounds(35, 41, 200, 31);
		kineticPanel.add(slider_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("-100N                         0N                      100N");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFocusable(false);
		lblNewLabel_2_1.setBounds(10, 74, 251, 20);
		kineticPanel.add(lblNewLabel_2_1);
		
		JLabel kineticTitle = new JLabel("Kinetic Coefficient");
		kineticTitle.setFont(new Font("Tahoma", Font.PLAIN, 13));
		kineticTitle.setBounds(10, 11, 115, 19);
		kineticPanel.add(kineticTitle);
		
		JPanel appliedForcePanel = new JPanel();
		appliedForcePanel.setLayout(null);
		appliedForcePanel.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		appliedForcePanel.setBounds(822, 672, 291, 178);
		frmInteractiveSimulationOf.getContentPane().add(appliedForcePanel);
		
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
		
		JPanel statusSimPanel = new JPanel();
		statusSimPanel.setLayout(null);
		statusSimPanel.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		statusSimPanel.setBounds(822, 560, 291, 101);
		frmInteractiveSimulationOf.getContentPane().add(statusSimPanel);
		
		JPanel statusPanel = new JPanel();
		statusPanel.setLayout(null);
		statusPanel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		statusPanel.setBounds(10, 11, 271, 79);
		statusSimPanel.add(statusPanel);
		
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
		
		JPanel objPanel = new JPanel();
		objPanel.setLayout(null);
		objPanel.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		objPanel.setBounds(10, 560, 383, 290);
		frmInteractiveSimulationOf.getContentPane().add(objPanel);
		
		JPanel choosePanel = new JPanel();
		choosePanel.setLayout(null);
		choosePanel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		choosePanel.setBounds(10, 82, 363, 200);
		objPanel.add(choosePanel);
		
		JLabel Cube = new JLabel("New label");
		Cube.setBounds(10, 39, 145, 150);
		choosePanel.add(Cube);
		Cube.setIcon(new ImageIcon(test.class.getResource("/assets/objects/cube.png")));
		
		JLabel Cylinder = new JLabel("New label");
		Cylinder.setBounds(185, 39, 170, 150);
		choosePanel.add(Cylinder);
		Cylinder.setIcon(new ImageIcon(test.class.getResource("/assets/objects/cylinder.png")));
		
		JLabel chooselb = new JLabel("Object ");
		chooselb.setHorizontalAlignment(SwingConstants.CENTER);
		chooselb.setFont(new Font("Tahoma", Font.BOLD, 13));
		chooselb.setBounds(10, 11, 363, 45);
		objPanel.add(chooselb);
	}
}
