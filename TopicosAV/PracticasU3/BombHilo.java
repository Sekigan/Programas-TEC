package PracticasU3;

import java.applet.Applet;
import java.awt.Graphics;

public class BombHilo extends Applet implements Runnable {
	public int y, y1;

	Thread hilo;
	Bomb b = new Bomb();

	public void init() {
		hilo = new Thread(this);
		hilo.start();
		resize(800, 700);

	}

	public void paint(Graphics g) {
		b.paint(g, y, y1);
		y = y + 2;
		y1 = y1 - 2;

	}

	@SuppressWarnings("static-access")
	public void run() {
		while (true) {
			repaint();
			try {
				hilo.sleep(100);
			} catch (InterruptedException e) {

			}
		}
	}

}
