package com.basic;

import java.util.Scanner;

public class WifiKey {
	 public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	    	System.out.println("Enter the name :");
	    	String name = scan.next();
	    	System.out.println("Enter the room number :");
			int roomNumber = scan.nextInt();
		createWifiPin(roomNumber,name);
			
	 }
			public static void createWifiPin(int roomNo, String lastName) {
		        int length = 0;
				int temp = 1,i = 0;
				while (temp <= roomNo) {
			    length++;
				temp *= 10;
				}
				int number = roomNo;
				if(length == 3) {
						int a = roomNo / 10;
						int unit = a % 10;
						int n = 0;
						int result = roomNo % 10;
			
						  
						String special[] = {")","!","@","#","$","%","^","&","*","("};
						
						while(roomNo > 0 || n > 9) {
							if(roomNo == 0) {
								roomNo = n;
								n = 0;
							}
							int remainder = roomNo % 10;
							n = n + remainder;
							roomNo /= 10;
						}	
						if(n == 1)
							n +=1;
						if(n % 2 == 1)
							n -=1;
							
			
				System.out.println(n+special[number%10]+(lastName.charAt(lastName.length()-1))+unit);
	    }
				}
			}

	








































































































































































































