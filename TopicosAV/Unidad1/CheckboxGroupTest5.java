package Unidad1;
/*
 *  * LUIS URIEL GARCIDUEÑAS FRAUSTRO
 * 4 de Septiembre de 2017 
 * ventana emergente con opcion multiple
 */
import java.awt.*;
public class CheckboxGroupTest5
{
 public static void main(String...args)
 {
   Frame f=new Frame();
       f.setTitle("checkboxGroupTest");
       f.setSize(200,150);
       f.setLayout(new FlowLayout());
       CheckboxGroup cbg =new CheckboxGroup();
       Checkbox c1 =new Checkbox("hombre",cbg,true);
       Checkbox c2 =new Checkbox("mujer",cbg,false);
       f.add(c1);
       f.add(c2);
       f.setVisible(true);
     
 
    
    }
}
