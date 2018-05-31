package com.basic;

public class Employee {
		String n1;
		double salary;
		public String getN1() {
			return n1;
		}
		public void setN1(String n1) {
			this.n1 = n1;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		
		
public static void main(String[] args)
{
	Employee e1 = new Employee();
	Employee e2 = new Employee();
	e1.setN1("stephen");
	e1.setSalary(500);
	e2.setN1("sathish");
	e2.setSalary(500);
	String Name = e1.getN1();
	double salary = e1.getSalary();
	 salary = salary * 1.1 ; 
	String Name1 = e2.getN1();
	double salary1 = e2.getSalary();
    salary1 = salary1 * 1.2 ; 
    System.out.println(Name);
	System.out.println(salary);
	 System.out.println(Name1);
		System.out.println(salary1);
}
		
		


}
