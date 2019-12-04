package EjemplosEventos1;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import javax.swing.event.*;

import Practicas1.Pikachu;

public class Rect extends JPanel  {
    private Color  colorRect;
    Pikachu pika = new Pikachu();
    public Rect(Color color) 
    {
        colorRect = Color.green;
    }
    
    public void cambiarColor (Color color) 
    {
        colorRect = color;
    }
          
    public void paint(Graphics g) {
        super.paintComponent(g);    
        pika.paint(g);
    }
    
    public void mostrar() {
        repaint();
    }
}
