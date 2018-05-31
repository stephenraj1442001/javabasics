package com.basic;

public class Palindromeprogram {
	 public int reverseNumber(int number){
         
	        int reverse = 0;
	        while(number != 0){
	            reverse = (reverse*10)+(number%10);
	            number = number/10;
	        } 
	        return reverse;
	    }
	     
	    public static void main(String a[]){
	        Palindromeprogram p1 = new Palindromeprogram();
	        System.out.println("Result: "+p1.reverseNumber(17868));
	    }
	
		}  



