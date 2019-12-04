package Unidad1;
/*
 *  * LUIS URIEL GARCIDUEÑAS FRAUSTRO
 * 4 de Septiembre de 2017 
 * Inserccion de datos largos o textos largos
 */
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
public class TextAreaTest11
{
  public static void main(String...args)
 {
   Frame f =new Frame();
   f.setTitle("TextAreaTest");
   f.setSize(200,150);
   f.setLayout(new FlowLayout());
   TextArea ta =new TextArea("Escribe aqui...",5,15);
   f.add(ta);
   f.setVisible(true);
}
}