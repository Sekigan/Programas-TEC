package Unidad1;
/*
 *  * LUIS URIEL GARCIDUE�AS FRAUSTRO
 * 4 de Septiembre de 2017 
 * Podria servir para visualizar bien una imagen
 */
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Scrollbar;
public class ScrollbarTest9
{
    public static void main(String...args)
 {
   Frame f =new Frame();
   f.setTitle("ScrollbarTest");
   f.setSize(200,150);
   f.setLayout(new FlowLayout());
   Scrollbar sb=new Scrollbar(Scrollbar.HORIZONTAL,0,5,-100,100);
   f.add(sb);
   f.setVisible(true);
}
}