package Ejercicios1;

import java.awt.*;
import javax.swing.*;
/*
* LUIS URIEL GARCIDUEÑAS FRAUSTRO
* 5 de Septiembre de 2017
* Ventana que puede ayudar para hacer zoom 
*/
public class JSliderTest19 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("JSliderTest");
		f.setSize(300,250);
		f.getContentPane().setLayout(new FlowLayout());
		JSlider s = new JSlider(JSlider.HORIZONTAL,0,30,15);
		s.setMajorTickSpacing(10);
		s.setMinorTickSpacing(1);
		s.setPaintTicks(true);
		s.setPaintLabels(true);
		f.getContentPane().add(s);
		f.setVisible(true);
	}
}
