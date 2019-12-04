package Unidad1;

/* 
 * LUIS URIEL GARCIDUEÑAS FRAUSTRO
 * 4 de Septiembre de 2017
 * Ventana para abrir archivos e imprimir cual saless
 */

import java.awt.FileDialog;
import java.awt.Frame;
public class DialogTest1_14
{
    public static void main(String...args)
 {
   Frame f =new Frame();
   f.setTitle("FrameTest");
   f.setSize(200,150);
   f.setVisible(true);
   
   
   FileDialog d= new FileDialog(f);
   d.setTitle("FileDialogTest");
   d.setBounds(50,50,70,50);
   d.setVisible(true);
   System.out.println(d.getFile()); 
}
}
    