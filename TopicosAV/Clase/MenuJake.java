package Clase;

import javax.swing.*;

import Practicas1.Jake;

import java.awt.event.*;
import java.applet.Applet;

public class MenuJake extends Applet implements ActionListener {
	JMenuItem mi1, mi2, mi3, mi4, mi5;
	JMenuBar mb;

	public void init() {
		setSize(300, 300);
		mb = new JMenuBar();
		JMenu m1 = new JMenu("Menu 1");
		m1.add(mi1 = new JMenuItem("Jake"));

		mb.add(m1);

		mi1.addActionListener(this);

		add(mb);
	}

	Jake jake = new Jake();

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mi1) {
			add(jake).setBounds(0, 0, 500, 500);
			jake.show();

		}
	}
}
