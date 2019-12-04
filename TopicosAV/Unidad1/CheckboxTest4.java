package Unidad1;
/*
 * LUIS URIEL GARCIDUEÑAS FRAUSTRO
 * 4 de Septiembre de 2017 
 * 
 * Una ventana emergente con opcion para confirmar 
 * algo 
 */
import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;
public class CheckboxTest4
{
    public static void main(String...args){
       Frame f=new Frame();
       f.setTitle("checkboxTest");
       f.setSize(200,150);
       f.setLayout(new FlowLayout());
       Checkbox c =new Checkbox("Mayor de 18 años");
       f.add(c);
       f.setVisible(true);
       
       
        
        
    }
}
