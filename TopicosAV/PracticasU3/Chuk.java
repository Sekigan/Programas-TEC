package PracticasU3;
/*
 * LUIS URIEL GARCIDUEÑAS FRAUSTRO
 * 19 DE SEPTIEMBRE 
 * "ANGRY BIRDS CHUK"
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.geom.Arc2D;

import javax.swing.JApplet;

public class Chuk extends JApplet {
	Color OrangeDark = new Color(255,140,0);	  
    public void paint(Graphics g,int y) {
    	
    	g.setColor(Color.yellow);//cuerpo
    	int xp[]={90,250,450};
    	int yp[]={400+y,150+y,400+y};
    	g.fillPolygon(xp,yp,3);
    	g.setColor(Color.black);
    	g.drawPolygon(xp,yp,3);
    	
    	g.setColor(Color.white);
    	g.fillArc(218, 275+y, 60, 60, 0, -180);//ojoBlancoIZQ
    	g.fillArc(320, 275+y, 60, 60, 0, -180);//OjoBlancoDER
    	
    	g.setColor(Color.BLACK);
    	g.fillOval(240, 305+y, 20, 15);//OjoIZQ
    	g.fillOval(340, 305+y, 20, 15);//OjoDer
    	
    	g.setColor(Color.ORANGE);//cejaizq
    	int xc[]={180,285,285,180};
    	int yc[]={285+y,295+y,310+y,305+y};
    	g.fillPolygon(xc, yc, 4);
    	int xc1[]={319,395,398,319};//cejader
    	int yc1[]={295+y,285+y,305+y,310+y};
    	g.fillPolygon(xc1, yc1, 4);
    	
    	g.setColor(Color.WHITE);//arco
    	g.fillArc(140, 365+y, 250, 70, 0, 180);
    	
    	
    	g.setColor(OrangeDark);//picoSUP
    	int px[]={250,305,390};
    	int py[]={350+y,310+y,360+y};
    	g.fillPolygon(px, py, 3);
    	int px1[]={255,305,345};
    	int py1[]={350+y,375+y,358+y};
    	g.fillPolygon(px1, py1, 3);//picoINF
    	g.setColor(Color.black);
    	g.drawPolygon(px, py, 3);
    	g.drawPolygon(px1, py1, 3);
    	
    	//Pelos
    	int p[]={265,280,245,270,270,260,190,240,255,235,199,227,240,215,200,220,230,255};
    	int i[]={175+y,110+y,60+y ,100+y,130+y,110+y,93+y ,120+y,130+y,115+y,144+y,128+y,150+y,155+y,170+y,165+y,169+y,155+y};
    	g.fillPolygon(p, i, p.length);
    	
    	//cola1
    	int c1[]={140,115, 75,105,135};
    	int v1[]={325+y,305+y,290+y,310+y,330+y};
    	g.fillPolygon(c1, v1, c1.length);
    	//cola2
    	int c2[]={133,75,40,75,122};
    	int v2[]={335+y,325+y,337+y,330+y,350+y};
    	g.fillPolygon(c2, v2, c2.length);
    	//cola3
    	int c3[]={122,80 ,60 ,75 ,111};
    	int v3[]={350+y,345+y,350+y,360+y,365+y};
    	g.fillPolygon(c3, v3, c3.length);
    	
        
    	
    	
    	
        
         
}
}