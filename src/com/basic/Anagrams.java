package com.basic;
import java.util.Arrays;
import java.util.Scanner;
public class Anagrams{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("eNTER THE NAME1");
      String input1 = scan.next();
     System.out.println("ENTER THE NAME2");
      String input2 = scan.next();
     

      String a = "";
     char ch[] =input1.toCharArray();
      char ch1[] = input2.toCharArray();		  
      Arrays.sort(ch);
    		  Arrays.sort(ch1);
    		  String z=String.valueOf(ch);
    		  String y=new String(ch1);
    		  
    		  System.out.println(y);System.out.println(z);
    		  if(z.equals(y))
    			  System.out.println("yes");
  }  }