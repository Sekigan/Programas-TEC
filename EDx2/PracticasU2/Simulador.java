package PracticasU2;

import java.io.FileNotFoundException;
import java.io.*;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Simulador {
	
	public static void main(String[] args) {
        try {
            
            new Simulador().abrirArchivo();
        } catch (FileNotFoundException fnfe) {
            JOptionPane.showMessageDialog(null, "No se ha abierto el archivo");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "No se ha abierto el archivo");
        } catch (Exception ex) {
        }
    }
	
    public void abrirArchivo() throws FileNotFoundException, IOException, Exception {
		 	String archivo = "";
			String[] tokens;
		 	
		 	JOptionPane.showMessageDialog(null, "Seleccione el archivo a traducir");
		 	
	        JFileChooser jfc = new JFileChooser();
	        jfc.showOpenDialog(null);
	        
	        File f = jfc.getSelectedFile();
	        FileReader fr = new FileReader(f);
	        BufferedReader br = new BufferedReader(fr);
	        
	        int numPalab = 0,numLineas = 0,control = 0,indice = 0;
	        
	        
	        JOptionPane.showMessageDialog(null, "Seleccione donde guardar la traduccion");
	        
	        JFileChooser Atr = new JFileChooser();
	        Atr.showOpenDialog(null);
	        File F = Atr.getSelectedFile();
	        
	        FileWriter fw = new FileWriter(F);
	        BufferedWriter bw = new BufferedWriter(fw);

	        while (br.ready()) {
	        	
	            archivo += br.readLine() + " ";
	            numLineas ++;
	            
	            tokens = archivo.split(" ");
	            
	            numPalab += tokens.length;
	            numPalab -= control;
	            control  = tokens.length;
	            
	            
	            try {
	 			 
	 			   do {
	 			   
	 				   if( tokens[indice].toLowerCase().equals(comEsp[indice]) ) {
	 					   bw.write(TradIng[indice]);
	 					   bw.write(" ");
	 					   System.out.print(TradIng[indice] + " "); 
	 				   }
	 			   			indice++;
	 			   			
	 		   	}while(indice < numPalab);
	 			   System.out.println();
	 			   bw.newLine();  	
	 	   		} catch (Exception ex) {
	 	   		}	
	            
	        }
	        
	        bw.close();
	        br.close();
	        JOptionPane.showMessageDialog(null,"La cantidad	 de palabras fue de:" + numPalab);
	        JOptionPane.showMessageDialog(null,"La cantidad de lineas fue de:" + numLineas);
	        
	   }
	 
	   

		   String[] TradIng = {"The","silence","always","this","here","and","in","all","parts",
				   				"to","times","is","true","the","we feel","plus","sharp",
				   				"there are","fog","in","the","Meadows","the","door","the","warehouse",
				   				"this","open","from","pair","in","pair","to","the","far","sings",
				   				"a","thrush","y","a","butterfly","white","flaps","without",
				   				"cease","around","from","the","branch","of the","elm","what",
				   				"he","swing","on","the","background","from","the","put","the","sun",
				   				"the","twilight","fades","faces","and","signs",
				   				"barley","he","perceives","the","chiaroscuro",
				   				"is","this","the","night","the","heart","of the","summer",
				   				"and","the","old","clock","the","pocket","starts","to","tick",
				   				"the","soon","with","a","force","unused",
				   				"above","of the","desk."};		
		   
		   String[]comEsp   = {"el","silencio","siempre","esta","aqui","y","en","todas","partes",
				   				"a","veces","es","cierto","lo","sentimos","mas","nitido",
				   					"hay","niebla","en","los","prados","la","puerta","del","almacen",
				   					"esta","abierta","de","par","en","par","a","lo","lejos","canta",
				   					"un","tordo","y","una","mariposa","blanca","aletea","sin",
				   					"cesar","alrededor","de","la","rama","del","olmo","que",
				   					"se","mece","sobre","el","fondo","de","la","puesta","del","sol",
				   					"el","crepusculo","desvanece","rostros","y","signos",
				   					"apenas","se","percibe","el","claroscuro",
				   					"es","esta","la","noche","del","corazón","del","verano",
				   					"y","el","viejo","reloj","de","bolsillo","empieza","a","tictaquear",
				   					"de","pronto","con","una","fuerza","inusitada",
				   					"encima","del","escritorio"};	   
}	   
