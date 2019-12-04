package colas;

import javax.swing.*;

public class Colas1 {

	public static void main(String[] args) {

		int tamaño = 0;
		tamaño = Integer.parseInt(JOptionPane.showInputDialog("De que tamaño va a ser la cola?"));

		Cola cola = new Cola(tamaño);
		Cola cola2 = new Cola(tamaño);
		int elemento;
		int elemento2;
		String opcion = "";
		int mayor = 0;
		int suma = 0;
		String[] menu = { "Insertar Cola", "Suma y Mayor", "Comparar 2 colas", "Limpiar", "Salir" };
		String Datos = " ";
		String Datos2 = "";
		int opc = 0;

		do {

			opcion = (String) JOptionPane.showInputDialog(null, "Operacion con la pila?", "Menu para Pila",
					JOptionPane.QUESTION_MESSAGE, null, menu, menu[0]);
			switch (opcion) {
			case "Insertar Cola": {
				if (cola.isVacio()) {

					for (int i = 0; i < tamaño; i++) {

						elemento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero"));
						cola.encolar(elemento);
					}
				} else {
					do {
						if (cola.isLLeno()) {
							JOptionPane.showMessageDialog(null, "Cola llena");

							opc = JOptionPane.showConfirmDialog(null, "Quiere Limpiar la Cola y agregar los datos?",
									"Pregunta", JOptionPane.YES_NO_OPTION);
							if (opc == JOptionPane.YES_OPTION) {
								for (int i = 0; i <= cola.arreglo.length - 1; i++) {
									cola.desencolar();
								}
								for (int i = 0; i < tamaño; i++) {
									elemento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero"));
									cola.encolar(elemento);
								}
							}

						}
					} while (opc == JOptionPane.NO_OPTION);
				}
			}
				break;

			case "Suma y Mayor": {
				String Datos1 = " ";
				for (int i = 0; i <= cola.arreglo.length - 1; i++) {
					int num = (int) cola.desencolar();
					suma = suma + num;
					Datos1 += num + ", ";
					if (mayor < num) {
						mayor = num;
					}

				}
				JOptionPane.showMessageDialog(null,
						"Datos de la cola: " + Datos1 + " \n El mayor es: " + mayor + " \n La suma es: " + suma);

			}
				break;
			case "Comparar 2 colas": {
				if (cola.isVacio()) {

					for (int i = 0; i < tamaño; i++) {

						elemento = Integer.parseInt(
								JOptionPane.showInputDialog("Ingrese numero", "Ingrese datos de la primera  Cola "));
						cola.encolar(elemento);
					}
				}
				if (cola2.isVacio()) {
					JOptionPane.showMessageDialog(null, "Ingrese datos de la segunda Cola");
					for (int i = 0; i < tamaño; i++) {

						elemento2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero"));
						cola2.encolar(elemento2);
					}
				}

				boolean aux1 = true;
				for (int i = 0; i < tamaño; i++) {
					if ((int) cola.arreglo[i] != (int) cola2.arreglo[i]) {

						aux1 = false;
						break;
					}
				}
				if (aux1) {

					for (int i = 0; i <= cola.arreglo.length - 1; i++) {
						int num1 = (int) cola.desencolar();
						suma = suma + num1;
						Datos += num1 + ", ";
					}

					for (int i = 0; i <= cola2.arreglo.length - 1; i++) {
						int num2 = (int) cola2.desencolar();
						suma = suma + num2;
						Datos2 += num2 + ", ";
					}

					JOptionPane.showMessageDialog(null, "Datos de la  Primera Cola: " + Datos + "\n"
							+ "Datos de la Segunda Cola: " + Datos2 + "\n Resultado: " + "\n COLAS IGUALES");
				}

				else {
					for (int i = 0; i <= cola.arreglo.length - 1; i++) {
						int num1 = (int) cola.desencolar();
						suma = suma + num1;
						Datos += num1 + ", ";
					}

					for (int i = 0; i <= cola2.arreglo.length - 1; i++) {
						int num2 = (int) cola2.desencolar();
						suma = suma + num2;
						Datos2 += num2 + ", ";
					}

					JOptionPane.showMessageDialog(null, "Datos de la Primera Cola: " + Datos + "\n"
							+ "Datos de la la Segunda Cola: " + Datos2 + "\n COLAS DIFERENTES");

				}
			}

				break;
			case "Limpiar": {
				for (int i = 0; i <= cola.arreglo.length - 1; i++) {
					cola.desencolar();
				}

				for (int i = 0; i <= cola2.arreglo.length - 1; i++) {
					cola2.desencolar();
				}
				JOptionPane.showMessageDialog(null, "Operacion realizada con exito");

			}
				break;

			}
		} while (!opcion.equals("Salir"));

	}
}
