package Unidad1;

import java.awt.*;
/* 
 * LUIS URIEL GARCIDUEÑAS FRAUSTRO
 * 4 de Septiembre de 2017
 * Boton de seleccion grande 
 */
public class CardLayoutTest17
{
    public static void main(String...args)
 {
   Frame f =new Frame();
   f.setTitle("CardLayoutTest");
   f.setSize(300,150);
   CardLayout cl=new CardLayout();
   f.setLayout(cl);
   Button b1=new Button("Button 1");
   f.add(b1,"uno");
   Button b2=new Button("Button 2");
   f.add(b2,"dos");
   Button b3=new Button("Button 3");
   f.add(b3,"tres");
   f.setVisible(true);
   cl.show(f,"dos");
   //otras posibilidades : cl.first(f),cl.last(f) y cl.next(f);
   
   
   
   
   
}
}
   