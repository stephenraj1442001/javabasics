package com.basic;

import java.util.Scanner;

public class WeigthOfString {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String word = scan.nextLine();
		int z = scan.nextInt();
		word = word.toUpperCase();	
		int i = 0,j = 0,a = 0;
		if(z == 1) {
			
		for(i = 0 ; i < word.length() ; i++){
		   char ch[] = word.toCharArray(); 
			    
			for(j = 0 ; j < ch.length ; j++) {
				   if(Character.isAlphabetic(ch[j])) {
			a += ((int)ch[j])-64;
				   }}break;
		}}	
		if(z == 0) {
			for(i = 0 ; i < word.length() ; i++){
				   char ch[] = word.toCharArray(); 
				   
				  
				   for(j = 0 ; j < ch.length ; j++) {
					   if(Character.isAlphabetic(ch[j])) {
					   if(ch[j] == 'A' || ch[j] == 'E' || ch[j] == 'I' || ch[j] == 'O' || ch[j] == 'U') {
						   ch[j] = 64;
					  }
						a += ((int)ch[j])-64;
					        }
					}break;}	
		}
	System.out.println(a);
	}
}
	
