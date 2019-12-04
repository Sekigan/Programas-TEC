package Unidad1;
/* 
 * LUIS URIEL GARCIDUEÑAS FRAUSTRO
 * 4 de Septiembre de 2017
 * Botones para 6 selecciones 
 */
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
public class GridLayoutTest18
{
    public static void main(String...args)
 {
   Frame f =new Frame();
   f.setTitle("GridLayoutTest");
   f.setSize(300,150);
   f.setLayout(new GridLayout(2,3,2,2));
   f.add(new Button("Button 1"));
   f.add(new Button("Button 2"));
   f.add(new Button("Button 3"));
   f.add(new Button("Button 4"));
   f.add(new Button("Button 5"));
   f.add(new Button("Button 6"));
   f.setVisible(true);
}
}

   