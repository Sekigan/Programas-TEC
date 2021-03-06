package Clase;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Scrollbar;
import java.awt.event.*;

public class StellaScroll extends Applet implements AdjustmentListener{
	private Scrollbar barra;
	
	private int barraValor=0;

	
	public void init(){
		
		barra=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,281);
		add(barra);
		barra.addAdjustmentListener(this);
		
		
	}
	
	public void paint(Graphics g) {
	g.drawString("El valor actual es ="+barraValor, 100, 100);	
	
	g.setColor(Color.pink);
	g.drawOval(160, 160, 310, 280);
	
	g.fillOval(160, 160, 310,barraValor);
	// ojos
	g.setColor(Color.white);
	g.fillOval(270, 250, 80, 90);
	g.fillOval(385, 270, 60, 90);
	// ojitos
	g.setColor(Color.BLUE);
	g.fillOval(280, 300, 30, 40);
	g.fillOval(390, 330, 20, 30);
	g.setColor(Color.white);
	g.fillOval(295, 309, 12, 12);
	g.fillOval(397, 335, 10, 10);

	// cejas
	g.setColor(Color.BLACK);
	g.drawArc(280, 190, 40, 15, 0, 180);
	g.drawArc(410, 240, 40, 60, 0, 90);

	// pico
	g.setColor(Color.YELLOW);
	g.fillArc(312, 360, 68, 80, 10, 130);

	int[] x1 = { 325, 330, 350 };
	int[] y1 = { 370, 400, 395 };
	g.fillPolygon(x1, y1, x1.length);

	g.setColor(Color.pink);
	
	int[] x2 = { 310, 330, 375, 425, 415, 360, 330 };
	int[] y2 = { 170, 90, 60, 60, 110, 140, 180 };
	g.fillPolygon(x2, y2, x2.length);
	
	

	int x3[] = { 330, 380, 410, 460, 475, 470, 430, 400, 340 };
	int[] y3 = { 170, 120, 110, 140, 170, 200, 190, 170, 170 };
	g.fillPolygon(x3, y3, x3.length);
	 
	g.setColor(Color.BLACK);
	g.drawArc(312, 360, 68, 80, 10, 130);
	
	}
	
	public void adjustmentValueChanged(AdjustmentEvent e) {
	barraValor=barra.getValue();
		repaint();
	}

}
