package Clases;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;

import javax.swing.JApplet;

public class Pentagono extends JApplet {
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setPaint(Color.RED);
		g2.setStroke(new BasicStroke(7.0f));
		GeneralPath path = new GeneralPath(GeneralPath.WIND_NON_ZERO);
		path.moveTo(300, 100);
		path.lineTo(400, 150);
		path.lineTo(400, 300);
		path.lineTo(200, 300);
		path.lineTo(200, 150);
		path.closePath();
		g2.draw(path);

	}

}
