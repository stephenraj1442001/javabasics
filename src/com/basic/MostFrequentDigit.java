package com.basic;


import java.util.Scanner;

import com.sun.istack.internal.FragmentContentHandler;

public class MostFrequentDigit{
	public static void main(String[] args)
	{ 
	Scanner scan = new Scanner(System.in);
	int first = scan.nextInt();
	int second = scan.nextInt();
	int third = scan.nextInt();

	
   MostFrequentDigit frequent = new MostFrequentDigit();
   
  
   System.out.println(frequent.ffs(first,second,third));
	}
	public int ffs(int first,int second, int third) { 
		int arr[] = new int[10];
		frequentDigit(first,arr);
		frequentDigit(second,arr);
		frequentDigit(third,arr);
		int i=0,count = 0,max=0;
		String result = "";
     	for(i = 0 ;i < 10 ; i++) {
	    	if(max<=arr[i]) {
	        	max=arr[i];
			    count = i;
			}
		}
     	result += count;
     	int d = Integer.parseInt(result);
	return d;
    }
	
	public  void frequentDigit(int input,int arr[]) {
		
		while(input != 0) {
		int remainder =  input % 10;
		arr[remainder] += 1;
		input /= 10;
		}
	  
		
	}
}
