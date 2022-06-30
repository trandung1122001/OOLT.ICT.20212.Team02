package hust.ict.globalict.project.gui;

import java.awt.Font;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

public class ObjectShapePanel {

	JPanel objectPramPanel = new JPanel();
	JLabel selected = new JLabel("");

	public ObjectShapePanel(JFrame mainFrame) {

		mainFrame.getContentPane().add(selected);

		objectPramPanel.setLayout(null);
		objectPramPanel.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		objectPramPanel.setBounds(900, 300, 208, 96);
		objectPramPanel.setVisible(false);
		mainFrame.add(objectPramPanel);

		JPanel objectPanel = new JPanel();
		objectPanel.setLayout(null);
		objectPanel.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		objectPanel.setBounds(10, 560, 383, 290);
		mainFrame.getContentPane().add(objectPanel);

		JPanel choosePanel = new JPanel();
		choosePanel.setLayout(null);
		choosePanel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		choosePanel.setBounds(10, 82, 363, 200);
		objectPanel.add(choosePanel);

		JLabel chooselb = new JLabel("Object ");
		chooselb.setHorizontalAlignment(SwingConstants.CENTER);
		chooselb.setFont(new Font("Tahoma", Font.BOLD, 13));
		chooselb.setBounds(10, 11, 363, 45);
		objectPanel.add(chooselb);

		JLabel Cube = new JLabel("");
		Cube.setBounds(10, 39, 145, 150);
		Cube.setToolTipText("Cube Object");
		choosePanel.add(Cube);
		Cube.setIcon(new ImageIcon(MainSimalationScreen.class.getResource("/assets/objects/cube.png")));

		JLabel Cylinder = new JLabel("");
		Cylinder.setToolTipText("Cylinder Object");
		Cylinder.setBounds(185, 39, 170, 150);
		choosePanel.add(Cylinder);
		Cylinder.setIcon(new ImageIcon(MainSimalationScreen.class.getResource("/assets/objects/cylinder.png")));

		Cube.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Point offset = mainFrame.getLocationOnScreen();
				Point pos = new Point(e.getLocationOnScreen().x - offset.x - 50,
						e.getLocationOnScreen().y - offset.y - 50);
				if (pos.y > 200 && pos.y < 450 && pos.x > 450 && pos.x < 750) {
					selected.setBounds(613, 308, 200, 200);
					// selected.setBounds(0,0,0,0);
				} else {
					selected.setBounds(0, 0, 0, 0);
				}

			}
		});
		Cube.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				objectPramPanel.setVisible(false);
				selected.setIcon(new ImageIcon(MainSimalationScreen.class.getResource("/assets/objects/square.png")));
				Point offset = mainFrame.getLocationOnScreen();
				Point pos = new Point(e.getLocationOnScreen().x - offset.x - 50,
						e.getLocationOnScreen().y - offset.y - 50);
				selected.setBounds(pos.x, pos.y, 200, 200);
			}
		});

		Cylinder.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e) {
				Point offset = mainFrame.getLocationOnScreen();
				Point pos = new Point(e.getLocationOnScreen().x - offset.x - 50,
						e.getLocationOnScreen().y - offset.y - 50);
				if (pos.y > 200 && pos.y < 450 && pos.x > 450 && pos.x < 750) {
					selected.setBounds(613, 308, 200, 200);
					// selected.setBounds(0,0,0,0);
				} else {
					selected.setBounds(0, 0, 0, 0);
				}
			}
		});
		Cylinder.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				objectPramPanel.setVisible(false);
				selected.setIcon(new ImageIcon(MainSimalationScreen.class.getResource("/assets/objects/round.png")));
				Point offset = mainFrame.getLocationOnScreen();
				Point pos = new Point(e.getLocationOnScreen().x - offset.x - 50,
						e.getLocationOnScreen().y - offset.y - 50);
				selected.setBounds(pos.x, pos.y, 200, 200);
			}
		});

		CreateObjectPramPanel(mainFrame);
	}

	void CreateObjectPramPanel(JFrame mainFrame) {
		JTextField pramT1 = new JTextField();
		pramT1.setColumns(4);
		pramT1.setBounds(114, 11, 85, 30);
		objectPramPanel.add(pramT1);

		JLabel param1 = new JLabel("Mass");
		param1.setLabelFor(pramT1);
		param1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		param1.setBounds(10, 16, 94, 19);
		objectPramPanel.add(param1);

		JTextField pramT2 = new JTextField();
		pramT2.setColumns(4);
		pramT2.setBounds(114, 52, 85, 30);
		objectPramPanel.add(pramT2);

		JLabel param2 = new JLabel("Side length");
		param2.setLabelFor(pramT2);
		param2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		param2.setBounds(10, 57, 94, 19);
		objectPramPanel.add(param2);

		selected.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e) {
				objectPramPanel.setVisible(!objectPramPanel.isVisible());
			}
		});
	}

}
