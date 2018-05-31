package com.basic;

public class Date {
	int month;
	int day;
	int year;
	public Date() {
		
	}
	public Date(int day,int month,int year) {
		this.day=day;
		this.month=month;
		this.year=year;
		
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
public void setdisplayDate() {
	System.out.println(day + "/" + month + "/" + year);
}




public static void main(String[] args)
{
	Date date = new Date();
	Date date1 = new Date(31,5,2014);
	date.setMonth(5);
	date.setDay(31);
	date.setYear(2018);
	date.setdisplayDate();
	date1.setdisplayDate();
}	
}
