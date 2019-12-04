package Clase;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;


public class RedCheck extends Applet implements ItemListener{

	private Checkbox check;
	private int selec = 0;
	
	public void init(){
		check = new Checkbox("azul");
		
		add(check);
		
		check.addItemListener(this);
	}

	public void paint(Graphics g) {
		
         //Cuerpo
		g.setColor(Color.black);
		
		g.drawOval(100, 150, 310, 280);
		g.setColor(Color.red);
		if(selec == 1){
			g.setColor(Color.blue);
		}
		g.fillOval(100, 150, 310, 280);
		
		

		//OVALO 1
		g.setColor(Color.gray);
		g.fillOval(160, 280, 30, 40);
		g.fillOval(200, 260, 30, 50);
		//g.setColor(Color.green);
		
		//Ovalo ojos
		//g.fillOval(248, 240, 50, 65); 
		//g.fillOval(345, 240, 45, 50);
		g.setColor(Color.black);
		g.drawOval(255, 245, 70, 50);
		g.drawOval(320, 245, 60, 50);
		
        //Ojo izq,y derecho		
		g.setColor(Color.white);
		g.fillOval(255, 245, 70, 50);
		g.fillOval(320, 245, 60, 50);

		g.setColor(Color.BLACK);
		g.fillOval(285, 260, 20, 23);
		g.fillOval(345, 260, 20, 23);
		
		//Arco en abdomen
		g.setColor(Color.gray);
		g.fillArc(160, 320, 203, 200, 15, 147);
		g.fillArc(160, 330, 201, 100, -15, -154);
		
		// Pico Superior
		g.setColor(Color.yellow);
		int x[] = { 270, 325, 390 };
		int y[] = { 320, 275, 330 };
		g.fillPolygon(x, y, x.length);
		g.setColor(Color.black);
		g.drawPolygon(x,y,3);
		
		// Pico Inferior
		g.setColor(Color.yellow);
		int x1[] = { 270, 370, 320 };
		int y1[] = { 320, 330, 370 };
		g.fillPolygon(x1, y1, 3);
		g.setColor(Color.black);
		g.drawPolygon(x1,y1,3);
		
		// cejas
		g.setColor(Color.black);
		int cx[] = { 250, 330, 400, 410, 330, 240 };
		int cy[] = { 220, 245, 220, 250, 260, 250 };
		g.fillPolygon(cx, cy, cx.length);
		
		//Cola 1
		int qx[]={110,85,100,115};
		int qy[]={240,210,205,230};
		g.fillPolygon(qx, qy, 4);
		
		//Cola2
		int qx2[] = { 110, 70, 60, 110 };
		int qy2[] = { 240, 220, 245, 260 };
		g.fillPolygon(qx2, qy2, qx2.length);
		
        //	Cola 3
		int qx3[] = { 110, 80, 85, 110 };
		int qy3[] = { 260, 280, 260, 255 };
		g.fillPolygon(qx3, qy3, qx3.length);
		
		//g.setColor(Color.black);
		//g.drawOval(160, 130, 90, 40);
        //g.drawArc(190, 110, 100, 80, 110, 230);		
	    g.setColor(Color.red);//cabello 1
		//g.fillOval(160, 130, 90, 40);
		g.fillArc(190, 110, 100, 80, 130, 330);		
	}

	@Override
	public void itemStateChanged(ItemEvent act) {
		selec = 0;
		if(act.getSource() == check){
			selec = 1;
		}
		repaint();
	}

		
	}

	

