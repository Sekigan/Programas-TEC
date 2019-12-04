package PracticasU3;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;
/*
 * LUIS URIEL GARCIDUEÑAS FRAUSTRO
 * 19 DE SEPTIEMBRE 
 * "ANGRY BIRDS JAKE"
 */
public class Jake extends JApplet {

	public void paint(Graphics g,int x) {
		Graphics2D g2 = (Graphics2D) g;
		QuadCurve2D shape = new QuadCurve2D.Double();

		// cuerpo
		g2.setStroke(new BasicStroke(3.0f));
		g2.setPaint(Color.blue);
		g2.fill(new Arc2D.Double(150, 200, 246, 253, 90, 360, Arc2D.OPEN));
		g2.setPaint(Color.black);
		g2.draw(new Arc2D.Double(150, 200, 246, 253, 90, 360, Arc2D.OPEN));

		// pelo
		g2.setStroke(new BasicStroke(3.0f));
		g2.setPaint(Color.blue);
		shape.setCurve(259, 205, 200, 135, 320, 210);
		g2.fill(shape);
		g2.setPaint(Color.black);
		shape.setCurve(259, 205, 200, 135, 320, 210);
		g2.draw(shape);
		g2.setPaint(Color.blue);
		shape.setCurve(210, 220, 170, 152, 257, 200);
		g2.fill(shape);
		g2.setPaint(Color.black);
		shape.setCurve(210, 220, 170, 152, 257, 200);
		g2.draw(shape);

		// ojos
		g2.setPaint(Color.white);
		g2.fill(new Arc2D.Double(159, 260, 63, 63, 90, 360, Arc2D.OPEN));
		g2.setPaint(Color.white);
		g2.fill(new Arc2D.Double(227, 260, 64, 66, 90, 360, Arc2D.OPEN));
		g2.setPaint(Color.black);
		g2.draw(new Arc2D.Double(159, 260, 63, 63, 90, 360, Arc2D.OPEN));
		g2.setPaint(Color.black);
		g2.draw(new Arc2D.Double(227, 260, 64, 66, 90, 360, Arc2D.OPEN));

		g2.setPaint(Color.black);
		g2.fill(new Arc2D.Double(166+x, 284, 20, 20, 90, 360, Arc2D.OPEN));
		g2.setPaint(Color.black);
		g2.fill(new Arc2D.Double(237+x, 282, 20, 20, 90, 360, Arc2D.OPEN));

		g2.setPaint(Color.orange);
		shape.setCurve(229, 307, 290, 361, 291, 298);
		g2.fill(shape);
		g2.setStroke(new BasicStroke(3.0f));
		g2.setPaint(Color.black);
		shape.setCurve(229, 307, 290, 361, 291, 298);
		g2.draw(shape);
		g2.draw(new Line2D.Double(229, 307, 291, 298));
		// pico
		g2.setPaint(Color.orange);
		g2.setStroke(new BasicStroke(4.0f));
		GeneralPath path = new GeneralPath(GeneralPath.WIND_NON_ZERO);
		path.moveTo(130, 353);
		path.lineTo(224, 298);
		path.lineTo(280, 347);

		path.moveTo(202, 351);
		path.lineTo(180, 397);
		path.lineTo(180, 427);
		path.lineTo(265, 400);
		path.lineTo(280, 347);

		path.closePath();
		g2.fill(path);

		g2.setPaint(Color.orange);
		g2.setStroke(new BasicStroke(4.0f));
		GeneralPath path3 = new GeneralPath(GeneralPath.WIND_NON_ZERO);
		path3.moveTo(165, 309);
		path3.lineTo(177, 326);
		path3.lineTo(202, 309);
		path3.closePath();
		g2.fill(path3);

		g2.setStroke(new BasicStroke(3.0f));
		g2.setPaint(Color.black);
		g2.draw(new Line2D.Double(130, 353, 280, 347));
		g2.draw(new Line2D.Double(130, 353, 224, 298));
		g2.draw(new Line2D.Double(224, 298, 280, 347));
		g2.draw(new Line2D.Double(202, 351, 180, 397));
		g2.draw(new Line2D.Double(180, 397, 180, 427));
		g2.draw(new Line2D.Double(180, 427, 265, 400));
		g2.draw(new Line2D.Double(265, 400, 280, 347));
		g2.draw(new Line2D.Double(165, 309, 177, 326));
		g2.draw(new Line2D.Double(165, 309, 202, 309));

		// boca
		g2.setPaint(Color.black);
		g2.setStroke(new BasicStroke(4.0f));
		GeneralPath path2 = new GeneralPath(GeneralPath.WIND_NON_ZERO);

		path2.moveTo(212, 351);
		path2.lineTo(195, 392);
		path2.lineTo(191, 412);
		path2.lineTo(249, 386);
		path2.lineTo(270, 347);

		path2.closePath();
		g2.fill(path2);

		// lengua
		g2.setPaint(Color.pink);
		g2.fill(new Arc2D.Double(194, 377, 68, 82, 50, 121, Arc2D.OPEN));
		g2.setStroke(new BasicStroke(3.0f));
		g2.setPaint(Color.black);
		g2.draw(new Line2D.Double(193, 410, 248, 387));

		// cola
		g2.setPaint(Color.black);
		g2.setStroke(new BasicStroke(4.0f));
		GeneralPath path4 = new GeneralPath(GeneralPath.WIND_NON_ZERO);

		path4.moveTo(390, 359);
		path4.lineTo(390, 363);
		path4.lineTo(431, 361);
		path4.lineTo(426, 338);

		path.moveTo(390, 363);
		path.lineTo(387, 369);
		path.lineTo(419, 385);
		path.lineTo(427, 370);

		path.closePath();
		g2.fill(path4);

	}
}
