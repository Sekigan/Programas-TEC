package Practica;

import javax.swing.JOptionPane;

public class LibroDeDirecciones {
	//
	private Persona[] personas;

	public LibroDeDirecciones(int n) {
		personas = new Persona[n];
	}

	public void agregar() {
		for (int indice = 0; indice < personas.length; indice++) {
			personas[indice] = new Persona("", 0, 'f');
			personas[indice].setNombre(JOptionPane.showInputDialog("Inserta el nombre de la persona "));
			personas[indice].setEdad(Integer.parseInt(JOptionPane.showInputDialog("Inserta la edad de la persona ")));
			personas[indice].setGenero(JOptionPane.showInputDialog(null, "M-Masculino o F-Femenino").charAt(0));
		}
	}

	public int indexOf(Persona obj) {
		for (int indice = 0; indice < personas.length; indice++) {
			if (obj.equals(personas[indice]))
				return indice;
		}
		return 0;
	}

	public void borrar(Persona obj) {

		int indice = indexOf(obj);
		personas[indice] = null;

	}
	// dame el nombre = luis,edad,genero

	public boolean buscar(Persona obj) {
		for (int indice = 0; indice < personas.length; indice++) {
			if (obj.equals(personas[indice])) {
				return true;
			}
		}
		return false;

	}

	public String mayor() {

		Persona p1 = null;
		int index = 0;
		for (int indice = 0; indice < personas.length; indice++) {
			if (personas[indice] != null) {
				p1 = personas[indice];
				index = indice;
				break;
				// sirve para no hacer pasos inecesarios y
				// comparar
			}
		}
		for (int indice = index + 1; indice < personas.length; indice++) {
			if (personas[indice] != null) {
				if (personas[indice].getEdad() > p1.getEdad()) {
					p1 = personas[indice];
				}
			}
		}
		return p1.toString();

	}

	public void mensaje(char f) {
		String mensaje="";
		for (int indice = 0; indice < personas.length; indice++) {
			
			if(f=='f'){
			if (personas[indice].getGenero()=='f') {

			 //JOptionPane.showMessageDialog(null,"Persona " + (indice + 1) + "\n" + personas[indice].toString() + "\n\n");
				mensaje+=personas[indice].toString()+"\n\n";
			}
			}
			else{
			if(personas[indice].getGenero()=='m'){
				 //JOptionPane.showMessageDialog(null,"Persona " + (indice + 1) + "\n" + personas[indice].toString() + "\n\n");
				mensaje += personas[indice].toString()+"\n\n";
			}
			}
			
		}
		JOptionPane.showMessageDialog(null,mensaje);

	}

	}
		

	

