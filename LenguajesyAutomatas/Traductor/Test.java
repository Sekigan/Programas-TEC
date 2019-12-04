package Traductor;

import java.util.*;
import java.io.*;


/**
 *  Diccionario Espanol-Ingles
 */

public class Test {

    /**
     *  Mapa que almacena las palabras del diccionario.
     *  La clave es la palabras en espanol.
     *  El valor la palabra en ingles.
     */
    private Map<String,String> tabla;


    /**
     *  Crea el diccionario.
     */
    public Test() {

	tabla = new HashMap<String,String>();

	// Relleno el diccionario con las palabras en ei.txt
	try {
	    cargaFichero("docR.txt");
	}
	catch (Exception e) {
	    System.err.println("No puedo crear el diccionario");
	    System.err.println("  Razon: "+e.getMessage());
	    System.exit(1);
	}
    }


    /**
     *  Añade las palabras contenidas en el fichero dado al diccionario.
     *  El formato de este fichero son lineas con dos pablabras: la palabra en el
     *  idima origen, y la palabras traducida. 
     *  @param fichero Fichero con las palabras a rellenar el diccionario.
     *  @throws Exception Lanza una excepcion si hay problemas al cargar el 
     *          fichero dado.      
     */
    private void cargaFichero(String fichero) throws Exception {
	// crea un scanner para leer el fichero
	Scanner scanner = new Scanner(new FileInputStream(fichero));
	
	String p1; // palabra original
	String p2; // palabra traducida

	// lee todo el fichero
	while (scanner.hasNext()) {
	    p1 = scanner.next();
	    if (!scanner.hasNext()) break;
	    p2 = scanner.next();
	    tabla.put(p1.toLowerCase(),p2);
	}
	
	// cerrar el scanner
	scanner.close();
    }
    

    /**
     *  Traduce una palabra sin hacer caso a mayusculas y minusculas. 
     *  Si la palabra no existe en el diccionario, devuelve la palabra original.
     *  @param p Palabra a traducir.
     *  @return La palabra traducida.
     */
    public String traduce(String p) {

	String p2 = tabla.get(p.toLowerCase());

	return p2==null ? p : p2;
    }
    
    
}