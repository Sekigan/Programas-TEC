package Practica6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class SimulacionRegex {
	


	@SuppressWarnings("unused")
	public static void main(String[] args) throws FileNotFoundException, IOException {

		File archivo1 = null;
		FileReader fr = null;
		BufferedReader br = null;
		String archivo = "";
		String expresion="";
		
		archivo1 = new File("Cadenas.txt");
		fr = new FileReader(archivo1);
		br = new BufferedReader(fr);

		
		char pi;
		
		
		while (br.ready()) {

			expresion = br.readLine() + " ";
			archivo +=br.readLine()+" ";
			JOptionPane.showMessageDialog(null, expresion);
			String[] arrayElementos = expresion.split(" ");
			pi=expresion.charAt(0);
			String pf =expresion.substring(expresion.length()-2);
			
			if(((pi=='a')) ||((pf=="d ")) ){
				JOptionPane.showMessageDialog(null, expresion+"Aceptado");
			}
			else
				JOptionPane.showMessageDialog(null, expresion+"Rechazado");
		}
		
		br.close();
	}

		}
