package ProyectoU2;
import java.applet.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import java.awt.geom.QuadCurve2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

import java.awt.*;

import java.awt.geom.*;
import javax.swing.*;

import java.awt.Color;

import java.awt.geom.GeneralPath;
import java.awt.geom.QuadCurve2D;

import javax.swing.JApplet;
public class paloma extends JApplet {
	public void paint(Graphics g) {
		
		Graphics2D g2 = (Graphics2D)g;
		
		//GeneralPath path = new GeneralPath(GeneralPath.WIND_NON_ZERO);
		

		Color paloma = new Color(202, 225 ,255);
		GeneralPath path20 = new GeneralPath(GeneralPath.WIND_NON_ZERO);
		g2.setColor(paloma);
		g2.setStroke(new BasicStroke(1.0f));
		path20.moveTo(319,125);
		path20.curveTo(280,180,320,70,380,120);
		path20.curveTo(380,120,400,119,380,125);
		path20.curveTo(380,125,375,130,378,140);
		path20.curveTo(378,140,390,180,310,222);
		
		//ala ab
		path20.curveTo(310,222,260,272,230,280);
		path20.curveTo(230,280,235,260,260,240);
		path20.curveTo(260,240,235,260,230,265);
		path20.curveTo(230,270,210,260,255,220);
		path20.curveTo(255,220,245,235,230,230);
		path20.curveTo(230,230,233,225,255,210);
		path20.curveTo(255,210,220,220,260,195);
		
		//cola
		path20.curveTo(260,195,255,190,245,195);
		path20.curveTo(245,195,225,215,220,225);
		
		path20.curveTo(200,260,190,280,180,260);
		path20.curveTo(180,260,190,230,176,260);
		path20.curveTo(176,260,169,270,165,255);
		path20.curveTo(165,255,170,230,190,225);
		path20.curveTo(190,225,170,240,150,230);
		path20.curveTo(150,230,155,220,170,215);
		path20.curveTo(170,215,160,225,150,220);
		path20.curveTo(150,220,110,202,110,192);
		path20.curveTo(110,192,140,210,190,190);
		path20.curveTo(190,190,220,185,240,170);
		
		//ala sup
		path20.curveTo(240,170,235,175,225,170);
		path20.curveTo(225,170,215,160,225,145);
		path20.curveTo(225,145,205,150,215,125);
		path20.curveTo(215,125,195,130,190,120);
		path20.curveTo(190,120,192,105,220,103);
		path20.curveTo(220,103,150,90,215,83);
		path20.curveTo(215,83,140,63,220,65);
		path20.curveTo(220,65,250,75,280,90);
		
		path20.closePath();
		
		g2.draw(path20);
		
		g2.setColor(paloma);
		g2.fill(path20);
		
		//ojo
		g.setColor(Color.black);
		g.fillOval(350, 115, 10, 10);
		
		//rama
		Color rama = new Color(205 ,133 ,63);
		
		g.setColor(rama);
		
		Graphics2D g3 = (Graphics2D)g;
		CubicCurve2D c = new CubicCurve2D.Double();
		//c.setCurve(x1, y1, ctrlx1, ctrly1, ctrlx2, ctrly2, x2, y2);
		c.setCurve(392, 90, 382, 120, 402, 130, 392, 145);
		
		g3.draw(c);
		
		
		GeneralPath path21 = new GeneralPath(GeneralPath.WIND_NON_ZERO);
		Color hojas = new Color(34, 139, 34);
		
		g3.setColor(hojas);
		g3.setStroke(new BasicStroke(1.0f));
		path21.moveTo(390, 100);
		
		path21.curveTo(410,80,420,90,390,100);
        path21.closePath();
		
		g3.draw(path21);
		
		g3.setColor(hojas);
		g3.fill(path21);
		
		GeneralPath path22 = new GeneralPath(GeneralPath.WIND_NON_ZERO);
		g3.setStroke(new BasicStroke(1.0f));
		path22.moveTo(390, 120);
		
		path22.curveTo(410,100,420,110,390,120);
        path22.closePath();
		
		g3.draw(path22);
		g3.fill(path22);
		
		GeneralPath path23 = new GeneralPath(GeneralPath.WIND_NON_ZERO);
		g3.setStroke(new BasicStroke(1.0f));
		path23.moveTo(395, 140);
		
		path23.curveTo(415,120,425,130,395,140);
        path23.closePath();
		
		g3.draw(path23);
		g3.fill(path23);
		
		GeneralPath path24 = new GeneralPath(GeneralPath.WIND_NON_ZERO);
		g3.setStroke(new BasicStroke(1.0f));
		path24.moveTo(388, 95);
		
		path24.curveTo(368,80,358,90,388,95);
        path24.closePath();
		
		g3.draw(path24);
		g3.fill(path24);
		
		GeneralPath path25 = new GeneralPath(GeneralPath.WIND_NON_ZERO);
		g3.setStroke(new BasicStroke(1.0f));
		path25.moveTo(393, 140);
		
		path25.curveTo(373,120,372,130,393,140);
        path25.closePath();
		
		g3.draw(path25);
		g3.fill(path25);
		

		
		
		
		
		    
}
}
