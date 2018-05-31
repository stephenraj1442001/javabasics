package com.basic;

public class Invoice {
	String number;
	String discription;
	int quantity;
	double price;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if (quantity > 0) {
			this.quantity = quantity;
		} else {
			this.quantity = 0;
		}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price < 0)
			this.price = 0;
		else
			this.price = price;
	}

	public double getInvoiceAmount() {
		return quantity * price;

	}




public static void main(String[] args)
{
	Invoice invoice1 = new Invoice();
	invoice1.setNumber("1");
	invoice1.setQuantity(5);
	invoice1.setPrice(-10.0);
	System.out.println(invoice1.getNumber());
	System.out.println(invoice1.getInvoiceAmount());
	System.out.println(invoice1.getPrice());
}
}