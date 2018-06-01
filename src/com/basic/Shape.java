package com.basic;

public class Shape {
    double length,breadth;
    public Shape (double length,double breadth) {
    	if((length > 0.0 && length < 20.0) && (breadth > 0.0 && breadth < 20.0)) {
    	this.length = length;
    	this.breadth = breadth;
    }else {
    	System.out.println("sorry length || breadth is between 0.0 & 20.0");
    }
    }
    public double perimeter() {
    	return 2 * (length + breadth);
    }
    public double area() {
    	return length * breadth;
    }
    public static void main(String[] args) {
    Shape rectangle = new Shape(21.0,9);
    System.out.println(rectangle.area());
    System.out.println(rectangle.perimeter());
    
}
}
