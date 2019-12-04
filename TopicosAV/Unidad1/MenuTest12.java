package Unidad1;
/*
 *  * LUIS URIEL GARCIDUEÑAS FRAUSTRO
 * 4 de Septiembre de 2017 
 * configuracion de una interfaz o una ventana
 */
import java.awt.*;
public class MenuTest12
{
  public static void main(String...args)
 {
   Frame f =new Frame();
   f.setTitle("MenuTest");
   MenuBar mb=new MenuBar();
   Menu m1 =new Menu("Menu 1");
   m1.add(new MenuItem("Opcion 1"));
   m1.add(new MenuItem("Opcion 1"));
   Menu m2= new Menu("Menu 2");
   m2.add(new CheckboxMenuItem("Opcion 1",true));
   m2.add(new CheckboxMenuItem("Opcion 2"));
   mb.add(m1);
   mb.add(m2);
   f.setMenuBar(mb);
   f.setSize(200,150);
   f.setVisible(true);
}
}