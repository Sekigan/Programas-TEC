package PracticasU3;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;


public class JakeHilo extends Applet implements Runnable {
		
	public int x;
	int segundos=0;
	
	Thread hilo;
	Jake j = new Jake();

	public void init() {
		hilo = new Thread(this);
		hilo.start();
		resize(800, 700);
		
	}

	public void paint(Graphics g) {
		j.paint(g,x);
		x=x+2;
		
	}

	@SuppressWarnings("static-access")
	public void run() {
		while(true){
			repaint();
			
			try{
				hilo.sleep(500);
			}catch(InterruptedException e){
				
			}
		}
	}
}
