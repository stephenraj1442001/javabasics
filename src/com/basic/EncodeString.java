package com.basic;

import java.util.Scanner;

import com.sun.corba.se.spi.orbutil.fsm.Input;

public class EncodeString {
    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Enter the first name :");
    	String input1 = scan.next();
    	System.out.println("Enter the second name :");
    	String input2 = scan.next();
    	System.out.println("Enter the third name :");
    	String input3 = scan.next();
    	
    	String[] s1 = encodeThreeStrings(input1);
    	String[] s2 = encodeThreeStrings(input2);
        String[] s3 = encodeThreeStrings(input3);
        
    	String one = s1[0] + s2[1] + s3[2];
    	String two = s1[1] + s2[2] + s3[0];
    	String three = s1[2] + s2[0] + s3[1];
    	
    	
    	String tthree = toggleString(three);
    	
    	System.out.println(one);
    	System.out.println(two);
    	System.out.println(tthree);
    	}
    
    	public static String[] encodeThreeStrings(String input) {
	    	int remainder = input.length() % 3;
	    	int divide = input.length() / 3;
	    	String first = "";
	    	String middle = null;
	    	String last = null;
	    	char c= 0;
	    	System.out.println(c);
	    	if(remainder == 0) {
	    		 first = input.substring(0,divide);
	             middle = input.substring(first.length(),first.length()+divide);
	             last = input.substring(first.length()+middle.length(),input.length());
		    	}
	    	if(remainder == 1) {
	    		 first = input.substring(0,divide);
	             middle = input.substring(first.length(),divide+first.length()+remainder);
	             last = input.substring(first.length()+middle.length(),input.length());
	    	}
	    	if(remainder == 2) {
	    		 first = input.substring(0,divide+1);
	             middle = input.substring(first.length(),first.length()+divide);
	             last = input.substring(first.length()+middle.length(),input.length());
	    	}return new String[] {first,middle,last};
	    	}
    	
    	public static String toggleString(String str) {
    		char[] ch = str.toCharArray();
    		String s="";
    		for (int i = 0; i < ch.length; i++) {
    			if (Character.isLowerCase(ch[i])) {
    				s=s+Character.toUpperCase(ch[i]);
    			}
    			if (Character.isUpperCase(ch[i])) {
    				s=s+Character.toLowerCase(ch[i]);
    			}
    		}
    		return s;
    	}
	    
    }

