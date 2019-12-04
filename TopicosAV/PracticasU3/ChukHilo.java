package PracticasU3;

import java.applet.Applet;
import java.awt.Graphics;

public class ChukHilo extends Applet implements Runnable {
	public int y= 100;
	Thread hilo;
	Chuk c = new Chuk();

	public void init() {
		hilo = new Thread(this);
		hilo.start();
		resize(800, 700);
		
	}

	public void paint(Graphics g) {
		c.paint(g,y);
		y=y+20;
		
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
