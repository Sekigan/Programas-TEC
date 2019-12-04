package Ejercicios1;

import java.awt.*;
import javax.swing.*;
/*
* LUIS URIEL GARCIDUEÑAS FRAUSTRO
* 5 de Septiembre de 2017
* Ventana para seleccion simple 
*/
public class JSpinnerTest20 {
public static void main(String[] args) {
	JFrame f = new JFrame();
	f.setTitle("JSpinnerTest");
	f.setSize(200,150);
	f.getContentPane().setLayout(new FlowLayout());
	String []dias={"L","M","X","J","V","S","D"};
	SpinnerListModel modelo=new SpinnerListModel(dias);
	JSpinner s=new JSpinner(modelo);
	f.getContentPane().add(s);
	f.setVisible(true);
}
}
