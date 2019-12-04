package ProyectoU2;

import java.applet.Applet;
import java.awt.*;
import java.awt.geom.*;

public class Onu extends Applet {
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		QuadCurve2D shape = new QuadCurve2D.Double();

		Font font = new Font("Serif", Font.ITALIC, 110);
		g2.setFont(font);
		g2.drawString("UNESCO", 470, 350);

		g.drawRect(480, 240, 400, 20);
		g.drawRect(495, 210, 370, 20);
		g.drawRect(510, 180, 340, 20);

		// g.drawRect(460, 260, 15, 120);

		g.drawRect(480, 360, 400, 20);
		g.drawRect(465, 390, 430, 20);
		g.drawRect(450, 420, 460, 20);

	}

}
