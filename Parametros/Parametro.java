package Parametros;

import java.util.Arrays;



public class Parametro {
	public static void modificarArreglo(int[] arr)
	{
		for (int ind=0; ind<arr.length; ind++){
			
			arr[ind]=2;
		
		}
		
	}

	public static void main (String []args){
		int[] nums = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(Arrays.toString(nums));
		modificarArreglo(nums);
		System.out.println(Arrays.toString(nums));
		
	}
	
}
