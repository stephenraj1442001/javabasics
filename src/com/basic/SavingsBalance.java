package com.basic;

public class SavingsBalance {
  static int annualInterestRate;
    double savingsBalance;
    double interest;
    public SavingsBalance(int savingsBalance) {
    	this.savingsBalance = savingsBalance;
    	
    }
    public void calculateMonthlyInterest() {
    	interest = (savingsBalance *annualInterestRate/100.0)/12;
    			savingsBalance+=interest;
    			System.out.println("Balance"+savingsBalance);
    }
    public static void modifyInterestRate(int newvalue) {
    	annualInterestRate = newvalue;
    	
    }
    public static void main(String[] args) {
    	SavingsBalance sb1 = new SavingsBalance(2000);
    	SavingsBalance sb2 = new SavingsBalance(3000);
    	sb1.calculateMonthlyInterest();
    	sb2.calculateMonthlyInterest();
    	sb1.modifyInterestRate(4);
    	sb1.calculateMonthlyInterest();
    	sb2.calculateMonthlyInterest();
    	sb1.modifyInterestRate(5);
    	sb1.calculateMonthlyInterest();
    	sb2.calculateMonthlyInterest();
    }
}
