package Clase;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBoxRed extends Applet implements ActionListener {
	private Button b1, b2, b3;
	int seleccion = 0;

	public void init() {
		b1 = new Button("Cuerpo Amarillo");
		add(b1);
		b1.addActionListener(this);
		b2= new Button("cuerpo negro");
		add(b2);
		b2.addActionListener(this);
		b3 = new Button("Cuerpo azul");
		add(b3);
		b3.addActionListener(this);
	}

	public void paint(Graphics g) {
		g.setColor(Color.red);
		if (seleccion == 1) {
			g.setColor(Color.YELLOW);
		}
		if (seleccion == 2) {
			g.setColor(Color.BLACK);
		}
		if (seleccion == 3) {
			g.setColor(Color.BLUE);
		}
		g.setColor(Color.red);
		g.fillOval(100, 150, 310, 280);// Cuerpo

		g.setColor(Color.gray);
		g.fillOval(160, 280, 30, 40);// OVALO 1
		g.fillOval(200, 260, 30, 50);
		g.fillOval(248, 240, 50, 65);// Ovalo ojos
		g.fillOval(345, 240, 45, 50);

		g.setColor(Color.white);
		g.fillOval(255, 245, 70, 50);// ojoteizq
		g.fillOval(320, 245, 60, 40);// ojoteder

		g.setColor(Color.BLACK);
		g.fillOval(285, 260, 20, 20);// ojoizq
		g.fillOval(345, 260, 20, 20);// ojoder

		g.setColor(Color.darkGray);
		g.fillArc(160, 320, 203, 200, 15, 147);// arco
		g.fillArc(160, 330, 201, 100, -15, -154);

		g.setColor(Color.yellow);
		int x[] = { 270, 325, 390 };// Pico Superior
		int y[] = { 320, 275, 330 };
		g.fillPolygon(x, y, x.length);
		int x1[] = { 270, 370, 320 };// Pico Inferior
		int y1[] = { 320, 330, 370 };
		g.fillPolygon(x1, y1, 3);

		g.setColor(Color.black);// cejas
		int cx[] = { 250, 330, 400, 410, 330, 240 };
		int cy[] = { 220, 245, 220, 250, 260, 250 };
		g.fillPolygon(cx, cy, cx.length);

		int qx[] = { 110, 85, 100, 115 };// 1ra Cola
		int qy[] = { 240, 210, 205, 230 };
		g.fillPolygon(qx, qy, 4);

		int qx2[] = { 110, 70, 60, 110 };// 2da Cola
		int qy2[] = { 240, 220, 245, 260 };
		g.fillPolygon(qx2, qy2, qx2.length);

		int qx3[] = { 110, 80, 85, 110 };// 3ra cola
		int qy3[] = { 260, 280, 260, 255 };
		g.fillPolygon(qx3, qy3, qx3.length);

		g.setColor(Color.red);// cabello 1
		g.fillOval(160, 130, 90, 40);
		g.fillArc(190, 110, 100, 80, 160, -290);
	}

	

	
	public void actionPerformed(ActionEvent event) {
		if (event.getSource()== b1)
			seleccion = 1;
		if (event.getSource() == b2)
			seleccion = 2;
		if (event.getSource() == b3)
			seleccion = 3;
		repaint();	
	}

}
