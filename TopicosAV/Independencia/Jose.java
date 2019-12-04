package Independencia;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Jose extends Applet {

	public void init() {

	}

	public void paint(Graphics g) {

		setBackground(new Color(240, 230, 140));
		// trompeta
		g.setColor(Color.black);
		g.drawOval(400, 450, 20, 50);
		g.drawLine(420, 460, 500, 460);
		g.drawLine(420, 480, 500, 480);
		g.drawOval(520, 435, 50, 80);
		g.drawOval(530, 445, 30, 60);
		g.drawArc(450, 480, 80, 70, 10, 70);
		g.drawArc(450, 391, 90, 69, 270, 70);
		g.drawArc(430, 445, 60, 70, 180, 180);
		g.drawArc(435, 450, 50, 60, 180, 180);
		g.drawRect(470, 445, 7, 15);
		g.drawRect(460, 445, 7, 15);
		g.drawRect(450, 445, 7, 15);

		// cactus
		g.setColor(new Color(107, 142, 35));
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
		
		 

		/*
		 * JOSE
		 */ g.setColor(Color.BLACK);
		g.fillOval(175, 316, 260, 180);

		g.setColor(Color.white);
		g.fillOval(218, 330, 213, 160);
		g.fillOval(210, 390, 20, 15);
		g.setColor(Color.black);

		g.fillRect(300, 380, 30, 10);
		g.fillRect(380, 380, 30, 10);
		g.fillOval(310, 390, 10, 30);
		g.fillOval(390, 390, 10, 30);
		g.drawArc(360, 425, 20, 10, 270, 180);
		int x1[] = { 181, 193, 393 };// sombrero
		int y1[] = { 330, 7, 266 };
		g.fillPolygon(x1, y1, x1.length);
		// Sombrero cuadro
		g.setColor(Color.WHITE);
		int x4[] = { 183, 362, 386, 184 };
		int y4[] = { 286, 231, 266, 318 };
		g.fillPolygon(x4, y4, x4.length);
		// sombrero bajo
		g.setColor(Color.black);
		int x5[] = { 33, 80, 117, 518, 566, 570 };
		int y5[] = { 380, 422, 426, 292, 272, 196 };
		g.fillPolygon(x5, y5, x5.length);

		// Poncho
		g.setColor(Color.BLACK);
		int x3[] = { 356, 449, 310, 260, 266, 197, 148, 191, 260 };
		int y3[] = { 490, 685, 770, 720, 679, 642, 653, 578, 490 };
		g.fillPolygon(x3, y3, x3.length);

		g.setColor(Color.WHITE);
		g.fillRect(265, 500, 100, 160);
		// triangulo poncho
		g.setColor(Color.DARK_GRAY);
		int x2[] = { 265, 315, 365 };
		int y2[] = { 490, 540, 490 };
		g.fillPolygon(x2, y2, 3);
		// wea roja
		g.setColor(Color.red);
		int x6[] = { 237, 280, 276, 302, 302, 333, 371, 355, 377, 356, 373, 356, 310, 270, 236 };
		int y6[] = { 522, 529, 564, 554, 589, 584, 593, 560, 562, 531, 540, 495, 536, 490, 490 };
		g.fillPolygon(x6, y6, x6.length);

		// botones
		g.setColor(Color.yellow);
		g.fillOval(305, 516, 10, 10);
		g.fillOval(315, 516, 10, 10);
		g.fillOval(310, 556, 10, 10);
		g.fillOval(310, 575, 10, 10);
		g.fillOval(310, 595, 10, 10);
		g.fillOval(310, 615, 10, 10);

		g.setColor(Color.DARK_GRAY);
		g.fillOval(20, 360, 50, 50);
		g.fillOval(95, 330, 50, 50);
		g.fillOval(170, 300, 50, 50);
		g.fillOval(245, 270, 50, 50);
		g.fillOval(320, 240, 50, 50);
		g.fillOval(395, 215, 50, 50);
		g.fillOval(470, 190, 50, 50);
		g.fillOval(545, 165, 50, 50);
		
		
		 

	}

}
