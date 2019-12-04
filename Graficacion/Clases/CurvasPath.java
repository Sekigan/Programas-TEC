package Clases;

/*
* 1.2 version.
*/
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;
 
public class CurvasPath extends JApplet {
 
    public void paint(Graphics g) {
      Graphics2D g2 = (Graphics2D) g;
        g2.setPaint(Color.RED);
        g2.setStroke(new BasicStroke(4.0f));
        GeneralPath path = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        path.moveTo(220, 150);
        path.curveTo(240, 130, 280, 160, 300, 140);
        path.lineTo(300, 180);
        path.quadTo(260, 160, 220, 180);
        path.closePath();
        g2.fill(path);
    }
}