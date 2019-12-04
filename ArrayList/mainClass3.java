package ArrayList;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class mainClass3 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		// ahora la lista puede tener 10 elementos por default

		list.ensureCapacity(11);

		list.add("ONE");
		list.add("TWO");
		list.add("THREE");
		list.add("FOUR");
		list.add("QUE PESADO");
		/* para reducir la capacidad del arreglo para la actual capacidad de un
		ArrayList es la siguiente llamada de metodo*/
		list.trimToSize();

		JOptionPane.showMessageDialog(null, "Arreglo\n" + list);
	}

}
