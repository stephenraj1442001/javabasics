package com.basic;

import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args) {
	int i = 0,j = 0,m = 0,count = 0,n = 0,sum = 0;
	Scanner scan = new Scanner(System.in);
	String word = scan.next();
	   char ch[] = word.toCharArray(); 
	    
		for(m = 0,n = ch.length-1 ; m < (ch.length/2) && n >= (ch.length/2) ; m++,n--){
			 if(ch[m] == ch[n]) {
			count++;
			}}
		if(count == word.length()/2)
			{
			System.out.println("yes");
			}
		else
			System.out.println("no");
			}
}
