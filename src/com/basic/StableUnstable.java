package com.basic;

import java.util.Scanner;

public class StableUnstable {
	public static void main(String[] args) {
		int j = 0,r = 0,count = 0;
		 	int c[] = new int[10];
		
		int input[] = new int[2];
		for(int i = 0 ; i < 2 ; i++) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number :");
		input[i] = scan.nextInt();
		c[i] = input[i];
		}
		for(int i = 0; i < 2 ; i++) {
		
			int[] number = new int[10];	
			int[] d= new int[10];
       while(input[i] != 0)
		 {
			 r = input[i] % 10;
			 number[r] += 1;
			 input[i] = input[i] / 10;
			
		 }
    int n=0;
       for(j = 0 ; j < 10 ; j++){
	            if(number[j] != 0) {
				d[n] = number[j];
				n++;
			}
       }
  
       for(j = 1 ; j < n ; j++){
           if(d[0] != d[j]) {
			count++;
		}    
         }}System.out.println(count);
         
        }
}
