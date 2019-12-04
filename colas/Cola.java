package colas;

public class Cola implements ICola {
	int frente;
	int fondo;
	Object arreglo[];

	public Cola(int tamaño) {
		arreglo = new Object[tamaño];
		for (int i = 0; i < arreglo.length; i++)
			arreglo[i] = new Object();
		frente = -1;
		fondo = -1;

	}

	public boolean isVacio() {

		return frente == -1 && fondo == -1;
	}

	public boolean isLLeno() {

		return fondo == (arreglo.length - 1);
   
   }
	

	public Object getFrente() {

		return arreglo[frente];
	}

	public Object getFondo() {
		if (!isVacio()) {
			return arreglo[fondo];
		} else {
			return null;
		}
	}

	
	public void encolar(Object obj) {
		if(!isLLeno()){
			
			fondo++;
			arreglo[fondo]=obj;
			
			if (fondo==0){
				frente=fondo;
			}
		}
		}
	

	public Object desencolar() {
		Object ob = null;
		if (!isVacio()) {
			ob = arreglo[frente];
			arreglo[frente] = null;
			if(frente==fondo){
				frente=fondo=-1;
			}
			else{
				int i = 1;
				while (i<arreglo.length && arreglo[i] != null) {
					arreglo[i - 1] = arreglo[i];
					arreglo[i]=null;
					i++;
				}
				fondo--;
			}

		}
		return ob;

	}
	

}