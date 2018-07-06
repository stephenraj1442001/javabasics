package com.basic;

public class Car {
	 public static void main(String args[]){
		    int[] array = new int[]{10, 11, 88, 2, 12, 120};
		 int max =  new int[];
		    System.out.println("Maximum Value is: "+max);
		    int min = new int 6;
		    System.out.println("Minimum Value is: "+min);
		  }
		  public static int getMax(int[] inputArray){ 
		    int maxValue = inputArray[0]; 
		    for(int i=1;i < inputArray.length;i++){ 
		      if(inputArray[i] > maxValue){ 
		         maxValue = inputArray[i]; 
		      } 
		    } 
		    return maxValue; 
		  }
		  public static int getMin(int[] inputArray){ 
		    int minValue = inputArray[0]; 
		    for(int i=1;i<inputArray.length;i++){ 
		      if(inputArray[i] < minValue){ 
		        minValue = inputArray[i]; 
		      } 
		    } 
		    return minValue; 
		  } 
		}


