package Arrays;

public class Calculadora {
    public static void main(String args[]) {
        System.out.println("Convertir a binarios");
        int[] test1 = decimalToBinary(999);
        int[] test2 = decimalToBinary(36843);
        System.out.println("Valores convertidos y rellenados:");
        for (int item : test1) {
            System.out.print(item);
        }
        System.out.println();
        for (int item : test2) {
            System.out.print(item);
        }
        System.out.println();
        System.out.println("Resultado de la suma binaria");
        int res[] = sumBinAndBin(test1, test2);
        for(int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
        }
        System.out.println();
    }
    public static int[] decimalToBinary(int numeroDecimal) {
        //Variables locales
        int residuo = 0;
        String res = "";
        
        //mientras el resultado de la division sea mayor que 0
        while (numeroDecimal > 0) {
            residuo = numeroDecimal % 2;//obtener el residuo
            numeroDecimal = numeroDecimal / 2;//realizar la siguiente division
            //En el orden natural de la operacion los valores estan invertidos
            //por eso aqui los volvemos a invertir :)
            res = residuo + res;
        }
        System.out.println(res);
        //El contenido maximo en una variable de tipo entero es 2**31-1
        //Por eso es logico que el max numero binario en un entero sea 2**31-1 = 2147483647
        int resultado [] = new int[31];
        //Para que la manipulacion del numero binario sea mas simple
        //lo convertimos en un arreglo. Pero, como el maximo valor esta dado
        //por 2**31-1 y eso son 31 posiciones debemos introducir ceros a la izq del valor binario
        for(int i = resultado.length -1, j=0, k=0; i > -1; i--, j++) {//Recorremos el arreglo
            //Si el valor de i(indice inverso) es mayor o igual a la longitud de
            //la cadena (la que contiene el numero binario).
            //Entonces aun no llegamos a las posiciones para la cadena.
            if(i >= res.length()) {
                resultado[j] = 0;//Y rellenamos esos espacios con 0
            } else {
                //Cuando lleguemos a los espacios que ocupa la cadena
                //los agregamos en orden inverso con la ayuda de k
                //mientras los parseamos a enteros ;)
                resultado[j] = Integer.parseInt(res.charAt(k)+"");
                k++;//incrementamos k
            }
        }
        return resultado;//Al finalizar el ciclo retornamos el arreglo.
    }
    
    /*
     * Suma dos numeros binarios.
     * Recibe dos arreglos de tipo entero y retorna un
     * arreglo de tipo entero con el resultado de la suma.
     */
    public static int[] sumBinAndBin(int a[], int b[]) {
        int acarreo = 0;//variable de control.
        int[] c = new int[a.length];//Arreglo a retornar.        
        //Se recorre el arreglo a de manera inversa.
        for (int i = a.length - 1; i > -1; i--) {            
            int suma = a[i] + b[i]; //Se realiza  la suma una vez por ciclo
            if(suma == 2) {//Si la suma da 2 los elementos en el arreglo son 1 y 1.
               c[i] = 0;//Por lo tanto debe ir como resultado un 0
               acarreo = 1;//Y se lleva un acarreo
           }
            //Si por el contrario la suma es 0 quiere decir que los elementos
            //eran 0 y 0.
            else if(suma == 0) {
               c[i] = 0;//Entonces debe ir 0 como resultado
           }
            //Si por el contrario la suma es 1, entonces los elementos 
            //eran 0 y 1 o viceversa.
            else if(suma == 1) {
               c[i] = 1;//Y debe ir como resultado un 1.
           }
           if(acarreo == 1) {//Si existe un acarreo en este ciclo
               //Se comprueba si la suma del elemento siguiente del
               //arreglo "a" mas el acarreo es igual a 2.
               if(a[i-1] + 1 == 2) {
                   a[i-1] = 0;//Si lo es, se asigna un 0 a "a".
                   acarreo = 1;//Y se sigue llevando un acarreo.
               } else {//Si la suma no da 2, solo puede dar 1.
                   a[i-1] = 1;//Y entonces se asigna 1 a "a".
                  acarreo = 0;//Y el acarreo desaparece.
               }
           } 
        }
        return c;//Se regresa el arreglo.
    }
}