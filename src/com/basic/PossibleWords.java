package com.basic;

import java.util.Scanner;

public class PossibleWords {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Input1:");
		String input1 = scan.next();
		 input1 = input1.toUpperCase();
		System.out.println("Enter the Input2 :");
		String input2 = scan.next();
		 input2 = input2.toUpperCase();
	
	
		   String a[] = (input1.split("_"));
		   int count = 0;
		   String b[] = input2.split(":");
		   String copy[] = new String[input2.length()];
		   //System.out.println(b[0].length());
		   System.out.print("Output : ");
		   for(int i = 0 ; i < b.length ; i++) {
			   char[] chararr = b[i].toCharArray();
			   char[] charr = input1.toCharArray();
			   
				if( a.length == 2) {
			   if(input1.length() == b[i].length()) {
				   if(b[i].startsWith(a[0]) && b[i].endsWith(a[1])) {
					   copy[i] = b[i];
						  count = 1;
					   }
				   
				   }}
				else {
				   if(input1.length() == b[i].length()) {
					   if(b[i].startsWith(a[0])) {
							 copy[i] = b[i];
							  count = 1;
						   }
			   }}}
			   if(count == 0) {
				   System.out.println("ERROR");
				   }
			   else
			   {
				   for(int i = 0 ; i < copy.length-1 ; i++) {
					   System.out.print(copy[i]);
					   if(!(copy[i+1] == null)) {
						   System.out.print(":");
				   }else
					   break;
			   }
	
		   }
}}
