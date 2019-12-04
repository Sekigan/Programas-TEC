package Clases;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.QuadCurve2D;

import javax.swing.JApplet;

public class CurvaQuad extends JApplet {
	public void paint(Graphics g) {
		QuadCurve2D shape = new QuadCurve2D.Double();
		shape.setCurve(250, 100, 350, 150, 250, 250);
		Graphics2D g2 = (Graphics2D) g;
		g2.draw(shape);

		Font font = new Font("Serif", Font.PLAIN, 24);
		g2.setFont(font);
		g2.drawString("Ejemplo de", 20, 30);
		g2.drawString("QuadCurve2D.Curve", 20, 70);
	}

}
