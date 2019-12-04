package Pilas;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class PilaEnArrayList implements InterfazPila {
	//El metodo Main esta al final del programo
	private ArrayList<Object> pila;

	public PilaEnArrayList() {
		pila = new ArrayList<Object>();
	}

	public void push(Object obj) {

		pila.add(obj);

	}

	public Object pop() {
		if (!isVacia()) {

			return pila.remove(pila.size() - 1);
		}
		return "La pila esta vacia";
	}

	public boolean isVacia() {

		return pila.isEmpty();
	}

	public boolean isLlena() {

		return false;
	}

	public Object getTop() {
		if (!isVacia()) {

			return pila.get(pila.size() - 1);
		}
		return null;
	}

	public int tamañoPila() {
		return pila.size();
	}

	public String toString() {
		return "Pila-->" + pila + "\nTamaño de la palabra-->" + tamañoPila();
	}

	public static void main(String[] args) {
		int opcion = 0;
		while(opcion==JOptionPane.YES_OPTION){
			PilaEnArrayList lista = new PilaEnArrayList();
		

		String palabra = JOptionPane.showInputDialog("Dame el dato " ) ; 
		

		for (int i =0;  i<palabra.length();  i++) {
			lista.push(palabra.charAt(i));
		}
		JOptionPane.showMessageDialog(null, "\nLista: \n" + palabra + "\nDatos palabra: \n" + lista.toString());

		String C = "";
		while(!lista.isVacia()){
			
			C += lista.pop();
		
		
		}
		JOptionPane.showMessageDialog(null, "\nLista: \n" + palabra + "\nPalabra Volteada: \n" + C);
	opcion=JOptionPane.showConfirmDialog(null, "Quieres ingresar otra palabra", "Continuar?", JOptionPane.YES_NO_OPTION);
	} }
}
