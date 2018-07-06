package com.basic;
import java.util.Scanner;
public class StringCode{

public static void main(String[] args)
{
	final long startTime=System.currentTimeMillis();
	Scanner scan = new Scanner(System.in);
	String word = scan.nextLine();
	word = word.toUpperCase();	
	String[] split = word.split(" ");
	int a[] = new int[26];
	String result ="";
	int arr[] = new int[split.length];
	int i = 0,j = 0,m = 0,n = 0,sum = 0;
	for(i = 0 ; i < split.length ; i++){
	   char ch[] = split[i].toCharArray(); 
	    
			for (j = 0; j < ch.length; j++) {
				a[j] = ((int) ch[j]) - 64;
			}
		for(m = 0,n = ch.length-1 ; m < (ch.length/2) && n >= (ch.length/2) ; m++,n--){
			sum += a[m] - a[n];
			
			}
			if(sum < 0)
				sum = -sum;
			if(ch.length % 2 == 1){
			sum += a[(ch.length/2)];
			}	  	
			result += sum;
			sum = 0;
               }
		System.out.println(result);
		final long endTime=System.currentTimeMillis();
		System.out.println(endTime-startTime);
			
		}
}