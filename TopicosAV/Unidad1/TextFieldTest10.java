package Unidad1;
/*
 *  * LUIS URIEL GARCIDUEÑAS FRAUSTRO
 * 4 de Septiembre de 2017 
 *Inserccion de datos simples
 */

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
public class TextFieldTest10
{
   public static void main(String...args)
 {
   Frame f =new Frame();
   f.setTitle("TextFieldTest");
   f.setSize(200,150);
   f.setLayout(new FlowLayout());
   TextField tf=new TextField("Escribe aqui....");
   f.add(tf);
   f.setVisible(true);
}
}