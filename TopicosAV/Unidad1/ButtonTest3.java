package Unidad1;
/*
 * LUIS URIEL GARCIDUEÑAS FRAUSTRO
 * 4 de Septiembre de 2017 
 * 
 * Serviria como una opcion de una ventana emergente 
 * o una opcion
 */
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
public class ButtonTest3
{
 public static void main(String...args)
 {
    Frame f= new Frame();
    f.setTitle("ButtonTest");
    f.setSize(200,150);
    f.setLayout(new FlowLayout());
    Button b= new Button("ok");
    f.add(b);
    f.setVisible(true);
    
    
    
   
    
    }
}
