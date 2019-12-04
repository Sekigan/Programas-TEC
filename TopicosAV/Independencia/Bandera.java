package Independencia;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Bandera extends Applet{
	
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);

	Image imagenInterna = new ImageIcon(getClass().getResource("images.jpg")).getImage();
	g.drawImage(imagenInterna, 520, 100, 210, 195, null);
	
		  
	}
}
