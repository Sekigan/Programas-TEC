package Clase;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.applet.Applet;
import java.awt.*;
import Practicas1.Bomb;
import Practicas1.Chuk;
import Practicas1.Red;

public class BombaLista extends Applet implements ItemListener
{

    private int x=100, y=100, seleccion, eleccion;
        
    List lista;
    Bomb bomb = new Bomb();
    Red red= new Red();
    Chuk chuck= new Chuk();

    public void init()
    {

        lista = new List(3);
        lista.add("Bomba");
        lista.add("Red");
        lista.add("Chuk");
        
        add(lista);
        
        lista.addItemListener(this);
        
           }
     
    public void paint(Graphics g) 
    {       

        switch(eleccion){
            case 1:
            bomb.paint(g);
            break;
            case 2:
            red.paint(g);
            break;
            case 3:
            chuck.paint(g);
            break;
        }
    }   
 
    public void itemStateChanged(ItemEvent e)
    {
        if(e.getStateChange() == ItemEvent.SELECTED)
        {
            eleccion = lista.getSelectedIndex()+1;
        }
        
        repaint();
    }
}


