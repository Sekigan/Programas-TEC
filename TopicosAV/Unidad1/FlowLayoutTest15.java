package Unidad1;

import java.awt.*;

/* 
 * LUIS URIEL GARCIDUEÑAS FRAUSTRO
 * 4 de Septiembre de 2017
 * 3 botones para seleccionar
 */
public class FlowLayoutTest15
{
   public static void main(String...args)
 {
   Frame f =new Frame();
   f.setTitle("FlowLayoutTest");
   f.setSize(300,150);
   f.setLayout(new FlowLayout());
   Button b1=new Button("Button 1");
   f.add(b1);
   Button b2=new Button("Button 2");
   f.add(b2);
   Button b3=new Button("Button 3");
   f.add(b3);
   f.setVisible(true);
   
   
   
}
}