package Fermin;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.JPanel;

import Practicas1.Piplup;

public class Chase1 extends JPanel{
	private int altoyancho;
    private  int xCoord, yCoord;
    Chase ch=new Chase();
    AffineTransform at = new AffineTransform();
    
    public Chase1(int aa, int xInicial, int yInicial) 
    {
        altoyancho = aa;
        xCoord = xInicial;
        yCoord = yInicial;
    }
    
    public void trasladar (int x) 
    {
        at.translate(x,0);
    }
    
    public void rotar (int x) 
    {
        at.rotate(Math.toRadians(x),180,180);
    }
    
    public void escalar (double x) 
    {
        at.scale(x, x);
    }
    
    public void sesgar (double x) 
    {
        at.shear(x, 0.0);
    }
          
    public void paint(Graphics g) {
        super.paintComponent(g);    
        Graphics2D g2 = (Graphics2D) g;
        g2.setPaint(Color.red);
        g2.setTransform(at);
        ch.paint(g2);
        
    }
    
    public void mostrar() {
        repaint();
    }


}
