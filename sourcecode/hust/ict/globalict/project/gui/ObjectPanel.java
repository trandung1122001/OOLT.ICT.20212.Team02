package hust.ict.globalict.project.gui;

import javax.swing.JPanel;

import hust.ict.globalict.project.controller.SimulationController;
import hust.ict.globalict.project.utils.Constants.Shape;

import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class ObjectPanel extends JPanel {

	public ObjectPanel(SimulationController simCtrl, JFrame frame, ObjectSelectedPanel objSelectedPanel, ObjectParamPanel paramPanel) {
		setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		setLayout(null);
		setBounds(10, 573, 383, 277);
		ImageIcon square = new ImageIcon(ObjectSelectedPanel.class.getResource("/assets/objects/square.png"));
		ImageIcon round = new ImageIcon(ObjectSelectedPanel.class.getResource("/assets/objects/round.png"));
		ImageIcon cube = new ImageIcon(ObjectPanel.class.getResource("/assets/objects/cube.png"));
		ImageIcon cylinder = new ImageIcon(ObjectPanel.class.getResource("/assets/objects/cylinder.png"));
		JPanel choosePanel = new JPanel();
		choosePanel.setLayout(null);
		choosePanel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		choosePanel.setBounds(11, 56, 363, 200);
		add(choosePanel);

		JLabel Cube = new JLabel();
		Cube.setIcon(cube);
		Cube.setToolTipText("Cube Object");
		Cube.setBounds(10, 25, 145, 150);
		choosePanel.add(Cube);

		JLabel Cylinder = new JLabel();
		Cylinder.setIcon(cylinder);
		Cylinder.setToolTipText("Cylinder Object");
		Cylinder.setBounds(183, 25, 170, 150);
		choosePanel.add(Cylinder);

		Cube.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e) {
				Point pos = new Point(e.getLocationOnScreen().x - 200, e.getLocationOnScreen().y - 200);
				if (pos.y > 200 && pos.y < 450 && pos.x > 450 && pos.x < 750) {
					objSelectedPanel.setBounds(613, 308, 200, 200);
					objSelectedPanel.setIcon(square);
					paramPanel.setTitle("Mass (kg)", "Sidelength (m)");
					simCtrl.updateObjShape(Shape.CUBE);
				} else {
					objSelectedPanel.setBounds(0, 0, 0, 0);
				}

			}

		});
		Cube.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) {
				paramPanel.setVisible(false);
				simCtrl.resetSim();
				objSelectedPanel.setIcon(square);
				Point pos = new Point(e.getLocationOnScreen().x - 200, e.getLocationOnScreen().y - 200);
				objSelectedPanel.setBounds(pos.x, pos.y, 200, 200);
			}
		});
		
		Cylinder.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e) {
				Point pos = new Point(e.getLocationOnScreen().x - 200, e.getLocationOnScreen().y - 200);
				if (pos.y > 200 && pos.y < 450 && pos.x > 450 && pos.x < 750) {
					objSelectedPanel.setBounds(613, 308, 200, 200);
					objSelectedPanel.setIcon(round);
					paramPanel.setTitle("Mass (kg)", "Radius (m)");
					simCtrl.updateObjShape(Shape.CYLINDER);
				} else {
					objSelectedPanel.setBounds(0, 0, 0, 0);
				}

			}

		});
		Cylinder.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) {
				paramPanel.setVisible(false);
				objSelectedPanel.setIcon(round);
				Point pos = new Point(e.getLocationOnScreen().x - 200, e.getLocationOnScreen().y - 200);
				objSelectedPanel.setBounds(pos.x, pos.y, 200, 200);
			}
		});

		JLabel chooselb = new JLabel("Object ");
		chooselb.setHorizontalAlignment(SwingConstants.CENTER);
		chooselb.setFont(new Font("Tahoma", Font.BOLD, 15));
		chooselb.setBounds(11, 11, 363, 45);
		add(chooselb);

	}
}
