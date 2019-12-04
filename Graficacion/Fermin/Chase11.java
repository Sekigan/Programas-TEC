package Fermin;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;;

public class Chase11 extends JApplet implements ActionListener {
	
	private JRadioButton t,r,e,s;
	
	private Chase1 miDibujo;

	public void init() {
		Container c = getContentPane();
		JPanel panelDeBotones = new JPanel();
	    
		t= new JRadioButton ("Trasladar");
	        panelDeBotones.add(t);
	        t.addActionListener(this);
	        
	        r = new JRadioButton("Rotar");
	        panelDeBotones.add(r);
	        r.addActionListener(this);
	        
	        e = new JRadioButton("Escalar");
	        panelDeBotones.add(e);
	        e.addActionListener(this);
	        
	        s = new JRadioButton("Sesgar");
	        panelDeBotones.add(s);
	        s.addActionListener(this);
	        
	   

		c.add(panelDeBotones, BorderLayout.NORTH);

		
		miDibujo = new Chase1(100, 100, 50);
		c.add(miDibujo, BorderLayout.CENTER);
	}

	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == t)
			miDibujo.trasladar(5);
		if (event.getSource() ==r)
			miDibujo.rotar(5);
		if (event.getSource() == e)
			miDibujo.escalar(0.9);
		if (event.getSource() == s)
			miDibujo.sesgar(0.5);
		 

		miDibujo.mostrar();
	}
}
