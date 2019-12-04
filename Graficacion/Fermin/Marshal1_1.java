package Fermin;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.applet.Applet;

public class Marshal1_1 extends JApplet implements ListSelectionListener{
	
	String list[]={"Trasladar","Rotar","Escalar","Sesgar"};
	private JList l=new JList(list);
	private Marshal1 mar;
	public void init(){
		Container c= getContentPane();
		JPanel panelDeBotones=new JPanel();
		
		panelDeBotones.add(l);
		l.addListSelectionListener(this);
		
		c.add(panelDeBotones, BorderLayout.NORTH);
		mar = new Marshal1(100,50,50);
		c.add(mar,BorderLayout.CENTER);
	}
	@Override
	public void valueChanged(ListSelectionEvent arg0) {
		// TODO Auto-generated method stub
		if (l.getSelectedIndex() == 0)
			mar.trasladar(5);
		if (l.getSelectedIndex() == 1)
			mar.rotar(5);
		if (l.getSelectedIndex() == 2)
			mar.escalar(0.9);
		if (l.getSelectedIndex() == 3)
			mar.sesgar(0.5);
		mar.mostrar();
		
	}
	

}

