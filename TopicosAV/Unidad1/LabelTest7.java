package Unidad1;
/* * LUIS URIEL GARCIDUEÑAS FRAUSTRO
 * 4 de Septiembre de 2017 
 * Podria servir como correccion o instruccion
 */
import java.awt.*;
public class LabelTest7
{
    public static void main (String...args)
    {
     Frame f=new Frame();
     f.setSize(200,150);
     f.setLayout(new FlowLayout());
     Label l1= new Label("una etiqueta");
     Label l2 =new Label();
     l2.setText("otra etiqueta");
     f.add(l1);
     f.add(l2);
     f.setVisible(true); 
        
    }
}
