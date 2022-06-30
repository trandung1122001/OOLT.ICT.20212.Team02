package hust.ict.globalict.project.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import javax.swing.JScrollPane;
import javax.swing.JLayeredPane;
import javax.swing.border.TitledBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JSplitPane;
import java.awt.GridLayout;
import net.miginfocom.swing.MigLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JMenuBar;
import java.awt.CardLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.Component;
import javax.swing.border.MatteBorder;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.border.SoftBevelBorder;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JProgressBar;
import javax.swing.JPopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Canvas;
import javax.swing.JSlider;
import java.awt.Font;
import java.awt.TextField;
import javax.swing.JFormattedTextField;
import javax.swing.DropMode;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class MainSimulationScreen extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainSimulationScreen frame = new MainSimulationScreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainSimulationScreen() {
		setTitle("Interactive simulation of the composition of forces");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 860, 722);
		contentPane = new JPanel();
		contentPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel MainSimulationScreen = new JPanel();
		MainSimulationScreen.setBorder(null);
		contentPane.add(MainSimulationScreen, BorderLayout.CENTER);
		MainSimulationScreen.setLayout(new BorderLayout(5, 5));
		
		JPanel topPanel = new JPanel();
		topPanel.setBorder(null);
		MainSimulationScreen.add(topPanel, BorderLayout.NORTH);
		topPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel speedAndAccelerationDisplay = new JPanel();
		speedAndAccelerationDisplay.setBorder(null);
		topPanel.add(speedAndAccelerationDisplay, BorderLayout.WEST);
		speedAndAccelerationDisplay.setLayout(new GridLayout(2, 2, 10, 10));
		
		JPanel SAborder = new JPanel();
		SAborder.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		speedAndAccelerationDisplay.add(SAborder);
		SAborder.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel accelerationLb = new JLabel("Angular Acceleration = 100 km/s2");
		accelerationLb.setFont(new Font("Tahoma", Font.PLAIN, 13));
		SAborder.add(accelerationLb);
		accelerationLb.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel speedLb = new JLabel("AngularSpeed = 100 km/s");
		speedLb.setFont(new Font("Tahoma", Font.PLAIN, 13));
		SAborder.add(speedLb);
		speedLb.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel inforDetailPanel = new JPanel();
		inforDetailPanel.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		topPanel.add(inforDetailPanel, BorderLayout.EAST);
		inforDetailPanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JCheckBox forceCB = new JCheckBox("Force");
		forceCB.setFont(new Font("Tahoma", Font.PLAIN, 13));
		forceCB.setHorizontalAlignment(SwingConstants.LEFT);
		forceCB.setSelected(true);
		inforDetailPanel.add(forceCB);
		
		JCheckBox sumOfForcesCB = new JCheckBox("Sum of Forces");
		sumOfForcesCB.setFont(new Font("Tahoma", Font.PLAIN, 13));
		sumOfForcesCB.setHorizontalAlignment(SwingConstants.LEFT);
		inforDetailPanel.add(sumOfForcesCB);
		
		JCheckBox valueOfForcesCB = new JCheckBox("Value Of Forces");
		valueOfForcesCB.setFont(new Font("Tahoma", Font.PLAIN, 13));
		valueOfForcesCB.setHorizontalAlignment(SwingConstants.LEFT);
		inforDetailPanel.add(valueOfForcesCB);
		
		JCheckBox massCB = new JCheckBox("Mass");
		massCB.setFont(new Font("Tahoma", Font.PLAIN, 13));
		inforDetailPanel.add(massCB);
		
		JCheckBox speedCB = new JCheckBox("Speed");
		speedCB.setFont(new Font("Tahoma", Font.PLAIN, 13));
		inforDetailPanel.add(speedCB);
		
		JCheckBox accelerationCB = new JCheckBox("Acceleration");
		accelerationCB.setFont(new Font("Tahoma", Font.PLAIN, 13));
		inforDetailPanel.add(accelerationCB);
		
		JPanel statePanel = new JPanel();
		statePanel.setBorder(null);
		FlowLayout fl_statePanel = (FlowLayout) statePanel.getLayout();
		fl_statePanel.setVgap(20);
		fl_statePanel.setHgap(15);
		topPanel.add(statePanel, BorderLayout.CENTER);
		
		JPanel stateBorder = new JPanel();
		stateBorder.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		FlowLayout flowLayout_1 = (FlowLayout) stateBorder.getLayout();
		flowLayout_1.setVgap(10);
		flowLayout_1.setHgap(10);
		statePanel.add(stateBorder);
		
		JButton resetBtn = new JButton("Reset");
		resetBtn.setFont(new Font("Tahoma", Font.PLAIN, 13));
		stateBorder.add(resetBtn);
		
		JButton pauseBtn = new JButton("Pause");
		pauseBtn.setFont(new Font("Tahoma", Font.PLAIN, 13));
		stateBorder.add(pauseBtn);
		
		JPanel botPanel = new JPanel();
		botPanel.setBorder(null);
		contentPane.add(botPanel, BorderLayout.SOUTH);
		botPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel objShapePanel = new JPanel();
		objShapePanel.setBorder(null);
		botPanel.add(objShapePanel, BorderLayout.WEST);
		objShapePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		
		Panel panel = new Panel();
		panel.setBackground(Color.YELLOW);
		objShapePanel.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 100));
		
		Panel panel_1 = new Panel();
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setVgap(100);
		flowLayout.setHgap(100);
		panel_1.setBackground(Color.RED);
		objShapePanel.add(panel_1);
		
		JPanel surfacePanel = new JPanel();
		
		JPanel label = new JPanel();
		surfacePanel.add(label);
		
		JLabel lblNewLabel = new JLabel("FRICTION");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label.add(lblNewLabel);
		
		surfacePanel.setBorder(null);
		botPanel.add(surfacePanel, BorderLayout.EAST);
		surfacePanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel staticCoeff = new JPanel();
		surfacePanel.add(staticCoeff);
		
		JSlider staticSld = new JSlider();
		staticSld.setSnapToTicks(true);
		staticSld.setPaintLabels(true);
		staticSld.setPaintTicks(true);
		staticSld.setValue(0);
		staticSld.setMinorTickSpacing(10);
		staticSld.setMinimum(-100);
		surfacePanel.add(staticSld);
		
		JPanel kineticCoeff = new JPanel();
		surfacePanel.add(kineticCoeff);
		
		JSlider kineticSld = new JSlider();
		kineticSld.setPaintLabels(true);
		kineticSld.setSnapToTicks(true);
		kineticSld.setPaintTicks(true);
		kineticSld.setValue(0);
		kineticSld.setMinorTickSpacing(10);
		kineticSld.setMinimum(-100);
		surfacePanel.add(kineticSld);
		
		JPanel appliedForcePanel = new JPanel();
		appliedForcePanel.setBorder(null);
		botPanel.add(appliedForcePanel, BorderLayout.CENTER);
		appliedForcePanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel label_2 = new JPanel();
		appliedForcePanel.add(label_2);
		
		JLabel lblNewLabel_2 = new JLabel("FRICTION");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_2.add(lblNewLabel_2);
		
		JPanel staticCoeff_2 = new JPanel();
		appliedForcePanel.add(staticCoeff_2);
		
		JSlider staticSld_2 = new JSlider();
		staticSld_2.setValue(0);
		staticSld_2.setSnapToTicks(true);
		staticSld_2.setPaintTicks(true);
		staticSld_2.setPaintLabels(true);
		staticSld_2.setMinorTickSpacing(10);
		staticSld_2.setMinimum(-100);
		appliedForcePanel.add(staticSld_2);
		
		JPanel kineticCoeff_2 = new JPanel();
		appliedForcePanel.add(kineticCoeff_2);
		
		JPanel panel_2 = new JPanel();
		appliedForcePanel.add(panel_2);
	}
}
