package Fermin;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.*;
import javax.swing.JApplet;
public class Chase extends JApplet{
	public void paint (Graphics g) {
		
		Graphics2D g2 = (Graphics2D)g;
		
		
		//PATAS FONDO
        g2.setColor(new Color(140,105,60));
        int[] xpf = {183,179,159,159,214,213,276,278,253,253,
        		     290,300,305,291,291,339,320,282};
        int[] ypf = {314,389,392,429,429,337,337,379,385,415,
        		     415,339,385,392,418,418,292,295};
        g2.fillPolygon(xpf,ypf,18);
        g2.setColor(Color.BLACK);
        g2.drawPolygon(xpf,ypf,18);
        
        //CHALECO
        g2.setColor(Color.BLUE);
        g2.fill(new RoundRectangle2D.Double(176, 260, 126, 93,20,20));
        g2.setColor(Color.black);
        g2.draw(new RoundRectangle2D.Double(176, 260, 126, 93,20,20));
        
        
        
        //pata delantera
        g2.setColor(new Color(140,105,60));
        int [] xpd = {225,216,196,196,246,246};
        int [] ypd = {337,389,392,429,429,314};
        g2.fillPolygon(xpd,ypd,6);
        g2.setColor(Color.BLACK);
        g2.drawPolygon(xpd, ypd, 6);
        
        
        //COLA
        g2.setColor(new Color(140,105,60));
        g2.fill(new Ellipse2D.Double(310, 290, 60, 15));
        g2.setColor(Color.BLACK);
        g2.draw(new Ellipse2D.Double(310, 290, 60, 15));
		
		
		
		
		
		
		
		
		
		//mochila
		//COLOR AZUL OSCURO
        g2.setColor(new Color(20,13,77));
        int [] xm = {240,225,320,335};
        int [] ym = {240,280,305,265};
        g2.fillPolygon(xm, ym, 4);
        g2.setColor(Color.BLACK);
        g2.drawPolygon(xm, ym, 4);
        
        //compartimiento
        g2.setColor(Color.RED);
        int [] xm1 = {270,265,280,285};
        int [] ym1 = {260,270,277,267};
        g2.fillPolygon(xm1, ym1, 4);
        
        
        
        
		
		//CABEZA
		int [] xcab = {164,162,162,190,247,263,281,285,276,244};
        int [] ycab = {114,130,170,248,244,198,130,81,50,130};
        g2.drawPolygon(xcab, ycab, 10);
        
        //CAFE
        g2.setColor(new Color(140,105,60));
        g2.fillPolygon(xcab,ycab,10);
        
        //carita
        //CAFE CLARO
        g.setColor(new Color(166,112,49));
        
        //parche izquierdo
        g2.fill(new Ellipse2D.Double(162, 134, 25, 67));
        
        //cachete derecho
        g2.fill(new Ellipse2D.Double(191,183.3,70.5,55.5));
        
        //rectangulo cuello
        g2.fill(new Rectangle2D.Double(188, 231, 41, 15));
        
        //boca inferior elipse
        g2.fill(new Ellipse2D.Double(170,203,59,37));
        
        //rectangulo redondo boca superior
        g2.setColor(Color.black);
        g2.draw(new RoundRectangle2D.Double(150,179,73.5,48,30,30));
        g.setColor(new Color(166,112,49));
        g2.fill(new RoundRectangle2D.Double(150,179,73.5,48,30,30));
        
        //nariz y lineas de nariz 
        g2.setColor(Color.BLACK);
        g2.fill(new Ellipse2D.Double(147, 178, 40, 22));
        g2.draw(new QuadCurve2D.Double(160,190,190,237,190,225));
        
        
        //rectangulo redondo parche derecho
        g.setColor(new Color(166,112,49));
        g2.draw(new RoundRectangle2D.Double(192,130,55,68,20,20));
        g2.fill(new RoundRectangle2D.Double(192,130,55,68,20,20));
        
        //OIDO
      //ROSA bajito
        g.setColor(new Color(247,133,100));
        int []xoido = {256,258,276,281,273,267};
        int []yoido = {126,100,67,73,144,144};
        g2.fillPolygon(xoido,yoido,6);
        
        
        //puntitos nariz
        g2.setColor(Color.black);
        g2.fillOval(190,200,5,5);
        g2.fillOval(210,200,5,5);
        g2.fillOval(200,195,5,5);
        
        //cejas
        g2.fill(new Rectangle2D.Double(161, 140, 15, 5));
        g2.fill(new Rectangle2D.Double(200, 137, 20, 4));
        
        
        //GORRA
        g2.setColor(Color.BLUE);
        int [] xg = {161,159,162,143,165,196,249,259,211};
        int [] yg = {55,77,103,125,122,124,135,92,55};
        g2.fillPolygon(xg,yg, 9);
        
        
        
        //plaquita POWPATROL
        //azul clarito
        g2.setColor(new Color(23,115,163));
        int [] xpp= {170,182,194,189,175};
        int [] ypp= {72,96,72,63,63};
        g2.fillPolygon(xpp,ypp, 5);
        
        g2.setColor(Color.BLACK);
        g2.drawPolygon(xpp,ypp, 5);
        
        g2.setColor(Color.white);
        
        g2.fill(new Ellipse2D.Double(176, 76, 12, 8.7));
        g2.fill(new Ellipse2D.Double(174,68,5,7));
        g2.fill(new Ellipse2D.Double(185,68,5,7));
        g2.fill(new Ellipse2D.Double(179,66,6,8));
        
        //OJOS
        //izquierdo
        g2.fill(new Ellipse2D.Double(168, 148, 15, 30));
        g2.setColor(Color.BLACK);
        g2.draw(new Ellipse2D.Double(168, 148, 15, 30));
        
        //MARRON OJOS
        g.setColor(new Color(161,71,23));
        g2.fill(new Ellipse2D.Double(170, 155, 13, 23));
        
        g2.setColor(Color.black);
        g2.fill(new Ellipse2D.Double(173, 158, 9, 15));
        
        g2.setColor(Color.WHITE);
        g2.fill(new Ellipse2D.Double(178, 160, 1.5, 2.5));
        
        
        //DERECHO
        g2.fill(new Ellipse2D.Double(207, 144, 26, 34));
        g2.setColor(Color.BLACK);
        g2.draw(new Ellipse2D.Double(207, 144, 26, 34));
        
        //MARRON OJOS
        g.setColor(new Color(161,71,23));
        g2.fill(new Ellipse2D.Double(209,154,20,22));
        
        g2.setColor(Color.black);
        g2.fill(new Ellipse2D.Double(212,157,15,15));
        
        g2.setColor(Color.WHITE);
        g2.fill(new Ellipse2D.Double(220,160,3,3));
        
        
        //collar
        g2.setColor(Color.black);
        g2.fill(new Rectangle2D.Double(188, 244, 60, 17));
        
        
        
        //placa policia
        g2.setColor(new Color(23,115,163));
        int [] xp= {180,192,204,199,185};
        int [] yp= {267,291,267,258,258};
        g2.fillPolygon(xp,yp, 5);
        g2.setColor(Color.black);
        g2.drawPolygon(xp, yp, 5);
        //estrellita
        g2.setColor(Color.yellow);
        int [] xs= {192,189,187,189,187,192,197,195,198,192,192};
        int [] ys= {260,270,270,275,285,280,285,275,270,270,260};
        g2.fillPolygon(xs,ys,11);
        
	}
}
