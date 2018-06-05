package com.basic;

import java.util.Scanner;

public class AirLine {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
     int f = 0;
     int e = 5;
     
     int exit;
     do {
    	 System.out.println("1.First Class");
    	 System.out.println("2.Economy Class");
    	  int Class = input.nextInt();
     
    	 
		switch(Class)
    	 {
    		 case 1:
    			 System.out.println("ur Seat is in First Class");
    			 f++;
    			 if(f<=5)
    			 {
    				 System.out.println("Your seat number is " + f);
   					System.out.println();
    				 				}
    			 else
    			 {
    				 System.out.println("Seat is Full");
    				 System.out.println("go to Economy class");
    				 int full = input.nextInt();
    				 if(full==1)
    				 {
    					 System.out.println("Press 1");
    				 }
    				 else
    				 {
    					 System.out.println("Next fligth leaves in 3 hours");
    				 }
    				 }
    			 break;
    		 case 2:
    			 System.out.println("ur Seat is in Economy Class");
    			 e++;
    			 if(e>=6 && e<=10)
    			 {
    				 System.out.println("Your seat number is " + e);
   					System.out.println();
    				 				}
    			 else
    			 {
    				 System.out.println("Seat is Full");
    				int full =input.nextInt();
    				 if(full==1)
    				 {
    					 System.out.println("Press 1");
    				 }
    				 else
    				 {
    					 System.out.println("Next fligth leaves in 3 hours");
    				 }
    				 }
    			 }
    	 System.out.println("1.main 2.exit" );
    	 exit = input.nextInt();
    	 
     }
     while(exit == 1);
    	 System.out.println("Enjoy");
     }
	}
	