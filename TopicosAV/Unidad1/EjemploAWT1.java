package Unidad1;
/*
 * LUIS URIEL GARCIDUEÑAS FRAUSTRO
 * 4 de Septiembre de 2017 
 * 
 * Este programa sirve para hacer un boton 
 * con un fondo gris claro o el color que tu quieras
 */

import java.awt.*;
public class EjemploAWT1
{
     public static void main(String...args)
 {
   Frame frame =new Frame();
   frame.setLayout(null);
   frame.setBounds(0,0,400,300);
   frame.setTitle("ejemplo AWT");
   Panel panel= new Panel();
   panel.setLayout(null);
   panel.setBounds(50,40,250,220);
   panel.setBackground(Color.LIGHT_GRAY);
   
   Button boton=new Button("Aceptar");
   boton.setBounds(100,80,100,20);
   panel.add(boton);
   frame.add(panel);
   
   frame.setVisible(true);
}
}