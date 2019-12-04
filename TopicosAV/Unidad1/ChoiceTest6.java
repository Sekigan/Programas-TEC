package Unidad1;
/*
  * LUIS URIEL GARCIDUEÑAS FRAUSTRO
 * 4 de Septiembre de 2017 
 * seleccion multiple de una opcion
 */
import java.awt.*;
public class ChoiceTest6
{
  public static void main(String...args)
  {
    Frame f=new Frame();
    f.setTitle("ChoiceTest");
    f.setSize(200, 100);
    f.setLayout(new FlowLayout());
    Choice cbg =new Choice();
    cbg.add("Rojo");
    cbg.add("Amarillo");
    cbg.add("Blanco");
    f.add(cbg);
    f.setVisible(true);
    }
}
