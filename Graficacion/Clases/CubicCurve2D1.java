package Clases;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.CubicCurve2D;

import javax.swing.JApplet;

public class CubicCurve2D1 extends JApplet{
	
	public void paint(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		CubicCurve2D c= new CubicCurve2D.Double();
		c.setCurve(100,100,0,200,250,250,100,400);
		g2.draw(c);
	
		Font font=new Font("Serif",Font.PLAIN,24);
		g2.setFont(font);
		g2.drawString("Ejemplo de ", 20, 30);
		g2.drawString("CubicCurve2D.Curve", 20, 70);
	}

}
