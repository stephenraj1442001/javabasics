package com.basic;

import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	int n = scan.nextInt();
    	
    	int arr[] = new int[n];
    	int i =0,j = 0,count=1;
      
    	for(i = 0 ; i < n ; i++) {
    		  arr[i] = scan.nextInt();
    	}
    	for(i = 0 ; i < n ; i++) {
    		for(j = i+1 ; j < n ; j++) {
    			if(arr[i] == arr[j]) {
    				count++;	
    			}
    		}
    			if(count> 1) {
    				System.out.println(arr[i]+" "+count);
    				break;
    				}
    	}
    	if(count==1) {
    		System.out.println("NODUPLICATEELEMENT");
    	}
    	
		
	}
}
