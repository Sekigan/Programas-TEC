package Arrays;

import javax.swing.*; 
import java.util.*;
public class Evaluador {
    public static void main(String[] args) {
        int n;  // número de cadenas a evaluar
        String respuesta = JOptionPane.showInputDialog("Cuántos elementos va a procesar" ); 
        n = Integer.parseInt(respuesta); 
        // Evaluar las cadenas
        for(int i=0; i<n; i++) {
            Stack<Double> pila = new java.util.Stack<>();   // Nuevo en JAVA 7 - Operador diamante
            // Leer expresion
            String expresion = JOptionPane.showInputDialog("Expresión a evaluar" ); 
            // Evaluar expresion
            expresion        = expresion.trim();        // Elimina espacios al comienzo y al final
            String[]     exp = expresion.split("\\s+"); // Para separar por secuencias de uno o más espacios
            for(String x: exp) {                        // Para cada cadena 'x' del arreglo exp
                try {
                    double valor = Double.parseDouble(x);
                    pila.push(valor);                   // Meter valor en la pila
                }
                catch(NumberFormatException ex) {       // Excepcion si la cadena 'x' no se pudo pasar a número
                    double b = pila.pop();
                    double a = pila.pop();
                    switch(x) {         // NUEVO EN JAVA 7 - Evaluación de cadenas en los switch
                        case "+"    :   pila.push(a+b); break;
                        case "-"    :   pila.push(a-b); break;
                        case "*"    :   pila.push(a*b); break;
                        case "/"    :   pila.push(a/b); break;
                    } // end switch
                } // end catch
            } // end for
            // Mostrar respuesta
            JOptionPane.showMessageDialog(null,pila.pop(), "Respuesta", JOptionPane.PLAIN_MESSAGE);
        } // end for
    }
}