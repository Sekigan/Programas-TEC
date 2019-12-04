package Independencia;

import java.applet.Applet;
import java.awt.BasicStroke;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Mexico extends Applet implements ItemListener {
	private Checkbox check;
	private int x, y, selec = 0;
	private int seleccion = 0;
	Choice c1;
	Jose jose = new Jose();
	Bandera aguila = new Bandera();

	public void init() {

		check = new Checkbox("Desaparecer Dibujos con sorpresa :)");
		add(check);
		check.addItemListener(this);
		c1 = new Choice();
		c1.add("Mexico");
		c1.add("Jose");
		add(c1);
		c1.addItemListener(this);

	}

	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(3.0f));

		setBackground(Color.yellow);

		// margen horizontal
		g.setColor(Color.green);
		g.fillRect(0, 0, 100, 20);
		g.fillRect(600, 0, 100, 20);
		g.fillRect(1200, 0, 100, 20);
		g.fillRect(300, 0, 100, 20);
		g.fillRect(900, 0, 100, 20);

		g.setColor(Color.red);
		g.fillRect(200, 0, 100, 20);
		g.fillRect(800, 0, 100, 20);
		g.fillRect(500, 0, 100, 20);
		g.fillRect(1100, 0, 100, 20);

		g.setColor(Color.white);
		g.fillRect(400, 0, 100, 20);
		g.fillRect(1000, 0, 100, 20);
		g.fillRect(100, 0, 100, 20);
		g.fillRect(700, 0, 100, 20);
		g.fillRect(1300, 0, 100, 20);

		// margen horizontal abajo
		g.setColor(Color.green);
		g.fillRect(0, 600, 100, 20);
		g.fillRect(200, 600, 100, 20);
		g.fillRect(400, 600, 100, 20);
		g.fillRect(600, 600, 100, 20);
		g.fillRect(800, 600, 100, 20);
		g.fillRect(1000, 600, 100, 20);
		g.fillRect(1200, 600, 100, 20);

		g.setColor(Color.red);
		g.fillRect(100, 600, 100, 20);
		g.fillRect(300, 600, 100, 20);
		g.fillRect(500, 600, 100, 20);
		g.fillRect(700, 600, 100, 20);
		g.fillRect(900, 600, 100, 20);
		g.fillRect(1100, 600, 100, 20);
		g.fillRect(1300, 600, 100, 20);
		// margen vertical
		g.setColor(Color.red);
		g.fillRect(0, 20, 20, 100);
		g.fillRect(0, 220, 20, 100);
		g.fillRect(0, 420, 20, 100);

		g.setColor(Color.green);
		g.fillRect(0, 120, 20, 100);
		g.fillRect(0, 320, 20, 100);
		g.fillRect(0, 520, 20, 100);
		//
		g.setColor(Color.red);
		g.fillRect(1350, 20, 20, 100);
		g.fillRect(1350, 220, 20, 100);
		g.fillRect(1350, 420, 20, 100);

		g.setColor(Color.green);
		g.fillRect(1350, 120, 20, 100);
		g.fillRect(1350, 320, 20, 100);
		g.fillRect(1350, 520, 20, 100);

		// bandera

		g.setColor(Color.green);
		g.fillRect(400, 100, 120, 195);
		g.setColor(Color.white);
		g.fillRect(570, 100, 150, 195);
		aguila.paint(g);
		g.setColor(Color.red);
		g.fillRect(720, 100, 120, 195);

		// barras
		 g.setColor(Color.black);
	       g.fillRect(30,0,10,2);
	       
	       //trompeta
	        
	       g.setColor(Color.black);
	       if (selec == 1) {
				g.setColor(Color.YELLOW);
			}
	       g.drawOval(200,150,20,50);
	       g.drawLine(220,160,300,160);
	       g.drawLine(220,180,300,180);
	       g.drawOval(320,135,50,80); 
	       g.drawOval(330,145,30,60); 
	       g.drawArc(250,180,80,70,10,70);
	       g.drawArc(250,92,90,69,270,70);
	       g.drawArc(230,145,60,70,180,180);
	       g.drawArc(235,150,50,60,180,180);
	       g.drawRect(270,145,7,15);
	       g.drawRect(260,145,7,15);
	       g.drawRect(250,145,7,15);
	       
	       //espada
	       //Mango de espada
	        g.setColor(Color.black);
	        if (selec == 1) {
				g.setColor(Color.YELLOW);
			}
	        g.drawOval(262,485,10,10);
	        g.drawArc(257,480,20,20,43,313);
	        g.drawLine(274,483,300,472);
	        g.drawLine(278,490,304,480);
	        g.drawLine(298,458,310,498);
	        g.drawArc(297,450,10,10,10,200);
	        g.drawArc(310,492,10,10,190,190);
	        g.drawLine(308,455,320,498);
	        //hoja
	        g.setColor(Color.black);
	        if (selec == 1) {
				g.setColor(Color.YELLOW);
			}
	        g.drawLine(311,468,480,390);
	        g.drawLine(315,477,490,422);
	        g.drawLine(480,390,515,393);
	        g.drawLine(490,421,515,393); 
	        
	        //hacha
	        if (selec == 1) {
				g.setColor(Color.YELLOW);
			}
	        g.drawOval(850,355,10,200);
	        g.drawArc(858,345,80,35,180,180);
	        g.drawArc(860,415,77,35,0,180);
	        g.drawLine(938,365,938,435);
	        
	        //campana
	        //Cuerpo
	        g.setColor(Color.black);
	        if (selec == 1) {
				g.setColor(Color.YELLOW);
			}
	         
	        g.drawOval(995,270,200,50);
	        g.drawLine(995,290,1020,250);
	        g.drawLine(1195,290,1175,250);
	        g.drawLine(1020,250,1050,135);
	        g.drawLine(1175,250,1150,135);
	        g.drawArc(1050,110,100,50,1,180);
	        //Badajo
	        g.drawArc(1080,290,30,20,120,300);
	        g.drawLine(1088,292,1088,270);
	        g.drawLine(1103,292,1103,270);
	        
	        //Asa
	        if (selec == 1) {
				g.setColor(Color.YELLOW);
			}
	        g.drawLine(1080,110,1080,90);
	        g.drawLine(1120,110,1120,90);
	        g.drawLine(1080,90,1040,105);
	        g.drawLine(1120,90,1160,105);
	        g.drawLine(1040,105,1040,60);
	        g.drawLine(1160,105,1160,60);
	        g.drawLine(1040,60,1080,75);
	        g.drawLine(1160,60,1120,75);
	        g.drawLine(1080,75,1070,37);
	        g.drawLine(1120,75,1130,37);
	        g.drawLine(1070,37,1130,37);
	        //Arcos
	        if (selec == 1) {
				g.setColor(Color.YELLOW);
			}
	        g.drawArc(1002,260,188,40,1,180);
	        g.drawArc(1030,190,136,40,1,180);
	        g.drawArc(1033,180,131,40,1,180);
	        
				g.setColor(new Color(107, 142, 35));
		if (selec == 1) {
			g.setColor(Color.YELLOW);
		}

		// cactus

		g.fillRect(661, 339, 35, 209);
		g.fillOval(661, 329, 35, 35);
		g.fillRect(695, 431, 20, 32);
		int[] xca = { 703, 711, 728, 711 };
		int[] yca = { 434, 409, 435, 466 };
		g.fillPolygon(xca, yca, xca.length);
		g.fillRect(711, 385, 17, 55);
		g.fillOval(711, 365, 17, 32);

		g.fillRect(644, 471, 31, 22);
		int[] xca2 = { 644, 642, 611, 644 };
		int[] yca2 = { 471, 457, 465, 491 };
		g.fillPolygon(xca2, yca2, xca2.length);
		g.fillRect(611, 435, 33, 29);
		g.fillOval(611, 415, 33, 32);
		switch (seleccion) {

		case 1:
			jose.paint(g);
			break;
		}
		g.setColor(Color.black);
		g.drawString(" VIVA MEXICO!!! ", 550, 330);

	}

	public void itemStateChanged(ItemEvent e) {
		selec = 0;
		if (e.getSource() == check) {
			selec = 1;
		}

		if (e.getStateChange() == ItemEvent.SELECTED) {
			seleccion = c1.getSelectedIndex() + 1;
		}
		repaint();

	}
}
