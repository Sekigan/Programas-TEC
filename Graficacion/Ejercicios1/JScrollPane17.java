package Ejercicios1;
import java.awt.*;
import javax.swing.*;
/*
* LUIS URIEL GARCIDUEÑAS FRAUSTRO
* 5 de Septiembre de 2017
* Cuadro de texto con scroll para mejor visualizacion 
*/
public class JScrollPane17 {
	public static void main(String[] args) {
		JFrame f =new JFrame();
		f.setTitle("JScrollPaneTest");
		f.setSize(200,150);
		f.getContentPane().setLayout(new FlowLayout());
		JTextArea ta=new JTextArea("Escribe aqui..",5,5);
		JScrollPane p =new JScrollPane(ta);
		f.getContentPane().add(p);
		f.setVisible(true);
	}

}
