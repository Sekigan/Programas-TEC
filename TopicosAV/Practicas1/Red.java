package Practicas1;
/*
 * LUIS URIEL GARCIDUEÑAS FRAUSTRO
 * 19 DE SEPTIEMBRE 
 * "ANGRY BIRDS RED"
 */
import java.applet.Applet;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Red extends Applet {

	public void paint(Graphics g, int x) {
		g.setColor(Color.red);
		g.fillOval(100+x, 150, 310, 280);// Cuerpo


		g.setColor(Color.gray);
		g.fillOval(160+x, 280, 30, 40);//OVALO 1
		g.fillOval(200+x, 260, 30, 50);
		g.fillOval(248+x, 240, 50, 65);//Ovalo ojos
		g.fillOval(345+x, 240, 45, 50);
		
		g.setColor(Color.white);
		g.fillOval(255+x, 245, 70, 50);// ojoteizq
		g.fillOval(320+x, 245, 60, 40);// ojoteder

		g.setColor(Color.BLACK);
		g.fillOval(285+x, 260, 20, 20);// ojoizq
		g.fillOval(345+x, 260, 20, 20);// ojoder
		
		g.setColor(Color.darkGray);
		g.fillArc(160+x, 320, 203, 200, 15, 147);// arco
		g.fillArc(160+x, 330, 201, 100, -15, -154);
		
		
		g.setColor(Color.yellow);
		int xx[] = { 270+x, 325+x, 390+x };// Pico Superior
		int y[] = { 320, 275, 330 };
		g.fillPolygon(xx, y, xx.length);
		int x1[] = { 270+x, 370+x, 320+x };// Pico Inferior
		int y1[] = { 320, 330, 370 };
		g.fillPolygon(x1, y1, 3);

		g.setColor(Color.black);// cejas
		int cx[] = { 250+x, 330+x, 400+x, 410+x, 330+x, 240+x };
		int cy[] = { 220, 245, 220, 250, 260, 250 };
		g.fillPolygon(cx, cy, cx.length);

		int qx[]={110+x,85+x,100+x,115+x};//1ra Cola
		int qy[]={240,210,205,230};
		g.fillPolygon(qx, qy, 4);
		
		
		int qx2[] = { 110+x, 70+x, 60+x, 110+x };// 2da Cola
		int qy2[] = { 240, 220, 245, 260 };
		g.fillPolygon(qx2, qy2, qx2.length);

		int qx3[] = { 110+x, 80+x, 85+x, 110+x };// 3ra cola
		int qy3[] = { 260, 280, 260, 255 };
		g.fillPolygon(qx3, qy3, qx3.length);
		
		g.setColor(Color.red);//cabello 1
		g.fillOval(160+x, 130, 90, 40);
		g.fillArc(190+x, 110, 100, 80, 160, -290);		
	}

}