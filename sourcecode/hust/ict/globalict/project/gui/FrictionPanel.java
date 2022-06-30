package hust.ict.globalict.project.gui;

import java.awt.Cursor;
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

public class FrictionPanel {
	
	private JTextField textField;
	private JTextField textField_1;
	
	public FrictionPanel(JFrame mainFrame) {
		JPanel frictionPanel = new JPanel();
		frictionPanel.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		frictionPanel.setBounds(1123, 560, 291, 290);
		mainFrame.getContentPane().add(frictionPanel);
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
	}

}
