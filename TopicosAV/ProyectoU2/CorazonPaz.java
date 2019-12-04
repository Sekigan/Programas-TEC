package ProyectoU2;

import java.applet.Applet;
import java.awt.*;
import java.awt.geom.*;

@SuppressWarnings("serial")
public class CorazonPaz extends Applet {

	public void paint(Graphics g) {
		setBackground(new Color(112,219,219));
		
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(20.0f));
		
				
		
		Font font = new Font("Serif", Font.ITALIC, 80);
		g2.setFont(font);
		g2.drawString("Organizacion", 420, 100);
		g2.drawString("de Naciones las", 450, 170);
		g2.drawString("Unidas", 490, 170+70);
		
		GeneralPath path = new GeneralPath(GeneralPath.WIND_NON_ZERO);
		path.moveTo(300, 130);
		path.curveTo(300, 130, 600, 50, 300, 400);
		path.curveTo(100, 130, 170, 110, 300, 130);
		path.lineTo(300, 250);
		path.closePath();
		path.moveTo(300, 240);
		path.lineTo(220, 300);
		path.closePath();
		path.moveTo(300, 240);
		path.lineTo(390, 300);
		path.closePath();
		g2.draw(path);
		
		

		
		
	}
}
