package ProyectoU2;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.awt.geom.Arc2D.Double;

import javax.swing.*;


	public class casco extends JApplet {

		public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g; 
		QuadCurve2D shape = new QuadCurve2D.Double();

	
		
		//abajo
		g2.setPaint(Color.cyan);
		shape.setCurve(200,350,250,400,300,350);  
		g2.fill(shape);    
		
		g2.setPaint(Color.cyan);
		shape.setCurve(200,350,220,400,300,350);  
		g2.fill(shape);    
		
		g2.setPaint(Color.cyan);
		shape.setCurve(200,350,225,400,300,350);  
		g2.fill(shape); 
		
		g2.setPaint(Color.cyan);
		shape.setCurve(200,350,230,400,300,350);  
		g2.fill(shape); 
		
		g2.setPaint(Color.cyan);
		shape.setCurve(200,350,240,400,300,350);  
		g2.fill(shape); 
		
		
		
		//arriba
		g2.setPaint(Color.cyan);
		shape.setCurve(200,350,220,170,400,350);  
		g2.fill(shape);   
		
		g2.setPaint(Color.cyan);
		shape.setCurve(200,350,250,170,400,350);  
		g2.fill(shape);   
		
		g2.setPaint(Color.cyan);
		shape.setCurve(200,350,260,170,400,350);  
		g2.fill(shape);  
		
		g2.setPaint(Color.cyan);
		shape.setCurve(200,350,270,170,400,350);  
		g2.fill(shape); 
		
		
		//letras
				g2.setPaint(Color.white);
				Font font = new Font("Serif", Font.LAYOUT_LEFT_TO_RIGHT, 70);
				g2.setFont(font);
				g2.drawString("UN", 223, 329);
		
		
		}
		}
