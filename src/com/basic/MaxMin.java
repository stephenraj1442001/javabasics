package com.basic;

public class MaxMin {
	public static void main(String[] args) {
	int a[] = {3,4,5,33,24,2};
       int max = a[0],min = a[0];
               
		    for(int i=1;i < a.length;i++){ 
	              if(a[i] > max)
		            {
		                max = a[i];
		            }
		            if(a[i] < min)
		            {
		                min = a[i];
		            }
		        }
		    System.out.println(max);
		    System.out.println(min);
		
	 }
	
	}

