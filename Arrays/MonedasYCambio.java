package Arrays;

public class MonedasYCambio {
	
	
	
	static int maximoMonedas;
	//static int soluciones[][]=new int[100][maximoMonedas];
	//static int[] solucionesCantidad=new int[100];
	static int indiceSoluciones=0;
	//static int[] mejorSolucion;
	static int mejorSolucionCantidad;
	static int[] denominaciones;
	static int cambio;
	static String[] solucionesTexto=new String[10000];
	static String mejorSolucion;
	
	
	static void cambio(int moneda,int suma,int[] solucion,int indiceCiclo){
		for(int i=indiceCiclo;i<denominaciones.length;i++){
			if(suma==cambio){
				if(moneda<mejorSolucionCantidad){
					if(indiceSoluciones!=0){
						solucionesTexto[indiceSoluciones]=mejorSolucion;
					}
					//soluciones[indiceSoluciones]=mejorSolucion;
					//solucionesCantidad[indiceSoluciones]=mejorSolucionCantidad;
					indiceSoluciones++;
					mejorSolucion="";
					for(int j=0;j<moneda;j++){
						//if(solucion[j] == null)
						mejorSolucion+=solucion[j]+",";
					}
					mejorSolucionCantidad=moneda;
				}
				else{
					solucionesTexto[indiceSoluciones]="";
					for(int j=0;j<moneda;j++){
						solucionesTexto[indiceSoluciones]+=solucion[j]+",";
					}
					//soluciones[indiceSoluciones]=solucion;
					//solucionesCantidad[indiceSoluciones]=moneda;
					indiceSoluciones++;
					
				}
				break;
			}
			else if(suma+denominaciones[i]<=cambio){
				solucion[moneda]=denominaciones[i];
				cambio(moneda+1,suma+denominaciones[i],solucion,i);
				
			}
		}
		
	}
		
	static void llamada(int[] tiposDeMoneda,int cambioPar){
		denominaciones=tiposDeMoneda;
		cambio=cambioPar;
		maximoMonedas=cambio/denominaciones[0];
		mejorSolucion="";
		mejorSolucionCantidad=maximoMonedas+1;
		indiceSoluciones=0;
		cambio(0,0,new int[maximoMonedas],0);
	}
	public static void main(String[] args){
		int[] denominaciones={1,2,5,10,20,100};
		int cambio=129;
		//String s="";
		//String sTodas="";
		llamada(denominaciones,cambio);
		
		
		/*for(int i=0;i<mejorSolucionCantidad;i++){
			s+="-"+mejorSolucion[i]+"-";
		}*/
		System.out.println("Cambio a dar: "+cambio);
		System.out.println("Mejor solucion "+mejorSolucion+" Numero de monedas empleadas: "+ mejorSolucionCantidad);
		System.out.println("Soluciones posibles");
		//int[][] solucionesLocal=soluciones;
		//int[] cabtidadLocal=solucionesCantidad;
		for(int i=1;i<indiceSoluciones;i++){
			System.out.println("solucion "+(i)+": "+solucionesTexto[i]);
		}
		
	}
	

}

