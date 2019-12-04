package Practica;

import javax.swing.JOptionPane;

	public class appPersona {

	
		public static void main(String[] args) {
		
		
		
		//		Person p1 = new Person();
		
			String nombre;
			int edad;
			char genero; 
		
		
				nombre=JOptionPane.showInputDialog("Inserta el nombre de la persona 1");
				edad=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad 1"));
				genero=JOptionPane.showInputDialog("F-femenino o M-masculino persona 1").charAt(0);
				Persona p1 = new Persona(nombre,edad,genero);

				
		//...
		
		
				nombre=JOptionPane.showInputDialog("Inserta el nombre de la persona 2");
				edad=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad 2"));
				genero=JOptionPane.showInputDialog("F-femenino o M-masculino edad 2").charAt(0);
				Persona p2 = new Persona(nombre,edad,genero);
		
		
						if(p1.equals(p2)){
							JOptionPane.showMessageDialog(null, "si son iguales"+p1.toString()+"\n Persona 2"  +p2.toString());
						}else 
							JOptionPane.showMessageDialog(null, "No son iguales"+p1.toString()+"\n  Persona 2 " +p2.toString());
			}

		}	
		

	


