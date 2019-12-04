package Clases;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;

import javax.swing.JApplet;

public class Estrella extends JApplet {

public void paint(Graphics g) {
	Graphics2D g2=(Graphics2D)g;
	g2.setPaint(Color.RED);
	g2.setStroke(new BasicStroke(70.f));
	GeneralPath path = new GeneralPath(GeneralPath.WIND_NON_ZERO);
	path.moveTo(200, 50);
	path.lineTo(270, 300);
	path.lineTo(100, 120);
	path.lineTo(300, 120);
	path.lineTo(130, 300);
	path.closePath();
	g2.draw(path);
}
}
