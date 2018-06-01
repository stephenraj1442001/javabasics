package com.basic;

public class Array {
	public static void main(String[] args) {
		int n = 1234,i;
		int remainder;
		int[] array = new int[10];
		System.out.print("[");
		for(  i = 0 ; i < array.length ; i++ ) {
			remainder = n % 10;
		     array[i] = remainder;
		     n = n/10;
		     System.out.print(array[i]);
			   
		    if(i<array.length-1) 
		    {
		    	
		    	System.out.print(",");
		    }
		   
}
		 System.out.print("]");
}   
		
		
		 }
		
	
	
	


