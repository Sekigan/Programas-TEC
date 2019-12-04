package Clase;

import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import Practicas1.Chuk;
import Practicas1.Red;

import java.awt.*;

public class ChoiceChuck extends Applet implements ItemListener {

	private int seleccion = 0;
	Chuk chuck = new Chuk();
	Red red = new Red();
	Choice c1;

	public void init() {
		c1 = new Choice();
		c1.add("Chuck");
		c1.add("Red");
		add(c1);
		c1.addItemListener(this);
	}

	Color OrangeDark = new Color(255, 140, 0);

	public void paint(Graphics g) {
		switch (seleccion) {
		case 1:
			chuck.paint(g);
			break;
		case 2:
			red.paint(g);
			break;
		}
	}

	
	public void itemStateChanged(ItemEvent e) {
		 if(e.getStateChange() == ItemEvent.SELECTED)
	        {
	            seleccion= c1.getSelectedIndex()+1;
	        }
	        
	        repaint();
		
	}
}