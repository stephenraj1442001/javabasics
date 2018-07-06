package com.basic;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateNumber {


	   public static void main(String args[]) {
	     Scanner scan = new Scanner(System.in);
	     
	     int n = scan.nextInt();
	     int i = 0;
	     String result = "";
	     int arr[] = new int[n];
	     for(i = 0 ; i < n ; i++) {
	    	 arr[i] = scan.nextInt();	 
	     }
	    	 Arrays.sort(arr);
	     
	     for(i = 0 ; i < arr.length-1 ; i++) {
	    	 if(arr[i] != arr[i+1]) {
	    		 System.out.print(arr[i]+",");
	    	 }
	     }
	    System.out.print(arr[arr.length-1]);
	   }  }


