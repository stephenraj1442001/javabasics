package com.basic;

import java.util.Scanner;

public class Wages {
	public static void main(String[] args) {
		int numberofEmployees;
		int count1=0;
		int count2=0;
		int count3=0;
		int count4=0;
		int count5=0;
		int count6=0;
		int count7=0;
		int count8=0;
		int count9=0;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number of employees");
		numberofEmployees=scan.nextInt();
		int employeeArray[]=new int[numberofEmployees];
		for(int j=0;j<numberofEmployees;j++) {
			System.out.println("enter the sale value");
			employeeArray[j]=scan.nextInt();
			
		
			employeeArray[j]=200+((9* employeeArray[j])/100);
		
		if(employeeArray[j]>200 && employeeArray[j]<299) {
		count1++;
		}
		if(employeeArray[j]>300 && employeeArray[j]<399) {
			count2++;
			}
		if(employeeArray[j]>400 && employeeArray[j]<499) {
			count3++;
			}
		if(employeeArray[j]>500 && employeeArray[j]<599) {
			count4++;
			}
		if(employeeArray[j]>600 && employeeArray[j]<699) {
			count5++;
			}
		if(employeeArray[j]>700 && employeeArray[j]<799) {
			count6++;
			}
		if(employeeArray[j]>800 && employeeArray[j]<899) {
			count7++;
			}
		if(employeeArray[j]>700 && employeeArray[j]<799) {
			count8++;
			}
		else
		{
			count9++;
			System.out.println("above 1000 "+count9);
			
		}
		
		
		}
		System.out.println("the value between 200 to 299 is "+count1);
		System.out.println("the value between 300 to 399 is "+count2);
		System.out.println("the value between 400 to 499 is "+count3);
		System.out.println("the value between 500 to 599 is "+count4);
		System.out.println("the value between 600 to 699 is "+count5);
		System.out.println("the value between 700 to 799 is "+count6);
		System.out.println("the value between 800 to 899 is "+count7);
		System.out.println("the value between 900 to 999 is "+count8);
		
		
	}

}
