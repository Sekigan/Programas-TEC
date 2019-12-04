package EjerciciosUnidad3;

import java.applet.Applet;
import java.awt.Graphics;

import javax.swing.JApplet;
import javax.swing.JLabel;

public class Reloj extends JApplet implements Runnable {
	int segundos = 0;
	int minutos = 0;
	int horas = 0;
	Thread hilo;

	@Override
	public void init() {
		hilo = new Thread(this);
		hilo.start();

	}

	@SuppressWarnings("static-access")
	public void run() {
		while (true) {
			segundos++;
			if (segundos > 60) {
				segundos = 0;

			}
			repaint();
			if (segundos == 60) {
				minutos++;
				if (minutos > 60) {
					minutos = 0;

				}
				repaint();
			}
			if (minutos == 60) {
				horas++;
				if (horas > 24) {
					horas = 0;

				}
				repaint();
				
			}
			try {
				hilo.sleep(1);
			} catch (InterruptedException e) {
			}
		}
	}

	@Override
	public void paint(Graphics g) {
        

        

       
       

        

	}
}