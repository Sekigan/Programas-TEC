package pilas;

import java.util.Stack;

import javax.swing.JOptionPane;

public class ProcesarMiPrimeraPila {

	public static void main(String[] args) {
		Stack<String> pila = new Stack<String>();

		String[] menu = { "Insertar en la Pila", "Sacar de la Pila", "Mostrar contenido de la Pila", "Salir" };
		String opcion = "";

		do {
			opcion = (String) JOptionPane.showInputDialog(null, "Operacion con la pila?", "Menu para Pila",
					JOptionPane.QUESTION_MESSAGE, null, menu, menu[0]);

			switch (opcion) {
			case "Insertar en la Pila":
				String entero = JOptionPane.showInputDialog("Numero a Ingresar");
				pila.push(entero);
				break;
			case "Sacar de la Pila":
				String dato = pila.pop();
				JOptionPane.showMessageDialog(null, dato);
				break;
			case "Mostrar contenido de la Pila":
				JOptionPane.showMessageDialog(null, pila.toArray());
				break;
			case "Salir":
			}
		} while (!opcion.equals("Salir"));
	}

}
