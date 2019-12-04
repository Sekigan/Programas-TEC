package PractivaU2;

import java.applet.Applet;
import java.awt.Choice;
import java.awt.Graphics;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import Practicas1.Bomb;
import Practicas1.Chuk;
import Practicas1.Jake;
import Practicas1.Red;
import Practicas1.Stella;

@SuppressWarnings("serial")
public class Dibujos extends Applet implements ItemListener {
	private int seleccion = 0;
	Chuk chuck = new Chuk();
	Red red = new Red();
	Bomb bomb = new Bomb();
	Jake jake = new Jake();
	Stella stela = new Stella();
	Choice c1;

	public void init() {
		c1 = new Choice();
		c1.add("Chuck");
		c1.add("Red");
		c1.add("Bomb");
		c1.add("Jake");
		c1.add("Stella");
		add(c1);
		c1.addItemListener(this);
	}

	

	public void paint(Graphics g) {
		switch (seleccion) {
		case 1:
			chuck.paint(g);
			break;
		case 2:
			red.paint(g);
			break;

		case 3:
			bomb.paint(g);
			break;
		case 4:
			jake.paint(g);
			break;

		case 5:
			stela.paint(g);
			break;
		}
	}

	public void itemStateChanged(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED) {
			seleccion = c1.getSelectedIndex() + 1;
		}

		repaint();

	}

}
