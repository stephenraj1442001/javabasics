package com.basic;

public class PolyTest {
	public static void main(String[] args) {
		PolyTest pt = new PolyTest();
		SportsCar sc = new SportsCar();
		Taxi tx = new Taxi();
		
		pt.brake(sc);
		pt.brake(tx);
	}
	public void brake(Car car) {
		car.brake();
	}
	
}
