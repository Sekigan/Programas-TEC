package Practicas1;
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
    public void paint(Graphics g) {
    	
    	g.setColor(Color.yellow);//cuerpo
    	int xp[]={90,250,450};
    	int yp[]={400,150,400};
    	g.fillPolygon(xp,yp,3);
    	g.setColor(Color.black);
    	g.drawPolygon(xp,yp,3);
    	
    	g.setColor(Color.white);
    	g.fillArc(218, 275, 60, 60, 0, -180);//ojoBlancoIZQ
    	g.fillArc(320, 275, 60, 60, 0, -180);//OjoBlancoDER
    	
    	g.setColor(Color.BLACK);
    	g.fillOval(240, 305, 20, 15);//OjoIZQ
    	g.fillOval(340, 305, 20, 15);//OjoDer
    	
    	g.setColor(Color.ORANGE);//cejaizq
    	int xc[]={180,285,285,180};
    	int yc[]={285,295,310,305};
    	g.fillPolygon(xc, yc, 4);
    	int xc1[]={319,395,398,319};//cejader
    	int yc1[]={295,285,305,310};
    	g.fillPolygon(xc1, yc1, 4);
    	
    	g.setColor(Color.WHITE);//arco
    	g.fillArc(140, 365, 250, 70, 0, 180);
    	
    	
    	g.setColor(OrangeDark);//picoSUP
    	int px[]={250,305,390};
    	int py[]={350,310,360};
    	g.fillPolygon(px, py, 3);
    	int px1[]={255,305,345};
    	int py1[]={350,375,358};
    	g.fillPolygon(px1, py1, 3);//picoINF
    	g.setColor(Color.black);
    	g.drawPolygon(px, py, 3);
    	g.drawPolygon(px1, py1, 3);
    	
    	//Pelos
    	int p[]={265,280,245,270,270,260,190,240,255,235,199,227,240,215,200,220,230,255};
    	int i[]={175,110,60 ,100,130,110,93 ,120,130,115,144,128,150,155,170,165,169,155};
    	g.fillPolygon(p, i, p.length);
    	
    	//cola1
    	int c1[]={140,115, 75,105,135};
    	int v1[]={325,305,290,310,330};
    	g.fillPolygon(c1, v1, c1.length);
    	//cola2
    	int c2[]={133,75,40,75,122};
    	int v2[]={335,325,337,330,350};
    	g.fillPolygon(c2, v2, c2.length);
    	//cola3
    	int c3[]={122,80 ,60 ,75 ,111};
    	int v3[]={350,345,350,360,365};
    	g.fillPolygon(c3, v3, c3.length);
    	
        
    	
    	
    	
        
         
}
}