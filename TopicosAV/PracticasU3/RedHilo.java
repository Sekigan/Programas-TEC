package PracticasU3;

import java.applet.Applet;
import java.awt.Graphics;


public class RedHilo extends Applet implements Runnable {
	public int x = 100;
	Thread hilo;
	Red r = new Red();

	public void init() {
		hilo = new Thread(this);
		hilo.start();
		resize(800, 700);
		
	}

	public void paint(Graphics g) {
		r.paint(g,x);
		x=x+20;
		
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
