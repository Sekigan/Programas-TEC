package PracticasU3;

import java.applet.Applet;
import java.awt.Graphics;

public class StellaHilo extends Applet implements Runnable {
	public int y ;
	Thread hilo;
	Stella s = new Stella();

	public void init() {
		hilo = new Thread(this);
		hilo.start();
		resize(800, 700);

	}

	public void paint(Graphics g) {
		s.paint(g, y);
		y = y - 3;

	}

	@SuppressWarnings("static-access")
	public void run() {
		while (true) {
			repaint();
			try {
				hilo.sleep(500);
			} catch (InterruptedException e) {

			}
		}
	}
}
