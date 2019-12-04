package Practicas1;
/*
 * LUIS URIEL GARCIDUEÑAS FRAUSTRO
 * 19 DE SEPTIEMBRE 
 * "ANGRY BIRDS BOMB"
 */

import java.awt.geom.*;
import javax.swing.*;
import java.awt.*;
import java.applet.Applet;

public class Bomb extends Applet {
	public void paint(Graphics g) {
		g.setColor(Color.black);
		g.fillOval(90, 150, 310, 330);

		g.setColor(Color.DARK_GRAY);
		g.fillArc(164, 335, 235, 260, 29, 145);
		g.fillArc(145, 255, 235, 220, -15, -130);// arcos
		// g.drawArc(x, y, width, height, startAngle, arcAngle);

		g.setColor(Color.DARK_GRAY);
		g.fillOval(160, 200, 70, 65);// ovalo iz
		g.fillOval(300, 200, 60, 55);// ovalo der

		g.setColor(Color.white);
		g.fillOval(179, 210, 40, 35);// ovalo ojo izq
		g.fillOval(308, 208, 38, 33);// ovalo ojo der

		g.setColor(Color.black);
		g.fillOval(195, 215, 18, 18);// ojo izq
		g.fillOval(317, 213, 18, 18);// ojo der

		g.setColor(Color.white);
		g.fillOval(260, 168, 39, 33);// ovalo

		// pico superior
		g.setColor(Color.YELLOW);
		int x[] = { 275, 255, 360 };
		int y[] = { 225, 255, 257 };
		g.fillPolygon(x, y, 3);

		// pico inferior
		g.setColor(Color.YELLOW);
		int x1[] = { 240, 260, 310, 340 };
		int y1[] = { 270, 315, 315, 265 };
		g.fillPolygon(x1, y1, 4);

		// pluma
		g.setColor(Color.black);
		int x2[] = { 260, 270, 315, 280 };
		int y2[] = { 150, 40, 65, 160 };
		g.fillPolygon(x2, y2, x2.length);

		// pluma cuadro
		g.setColor(Color.orange);
		int x3[] = { 270, 269, 314, 300 };
		int y3[] = { 80, 45, 70, 90 };
		g.fillPolygon(x3, y3, 4);

		g.setColor(Color.orange);// cejaizq
		int xc[] = { 130, 145, 250, 240 };
		int yc[] = { 195, 185, 205, 215 };
		g.fillPolygon(xc, yc, xc.length);

		g.setColor(Color.orange);// cejader
		int xc1[] = { 300, 380, 380, 310 };
		int yc1[] = { 180, 175, 195, 205 };
		g.fillPolygon(xc1, yc1, xc1.length);

	}
}
