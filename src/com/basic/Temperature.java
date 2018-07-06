package com.basic;

public class Temperature {
	static double fahrenheit;
	static double celsius;
public static void celsius( float fahrenheit) {
	celsius = (5.0 / 9.0) * ( fahrenheit - 32 ); 
	System.out.println(celsius);
}
public static void fahrenheit(int celsius)
{
	fahrenheit = (9/5) * (celsius + 32);
	System.out.println(fahrenheit);
	}
public static void main(String[] args) {
	
	celsius(110);
	fahrenheit(36);

}
}
