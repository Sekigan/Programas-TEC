package Ejercicios1;

import java.awt.*;
import javax.swing.*;

public class JColorChooser17 {
public static void main(String[] args) {
	JFrame f=new JFrame();
	f.setTitle("JColoChooserTest");
	f.setSize(200,150);
	f.setVisible(true);
	
	Color c = JColorChooser.showDialog(f, "Seleccione un color", Color.RED);
	System.out.println("El color seleccionado es: "+ c);
}
}
