package com.encapsulations;

public class CreditCardAccountMain {

	public static void main(String[] args) {
		CreditCardAccount credit=new CreditCardAccount("Bujji",10000.0,5000.0,2.0);
           System.out.println(credit);
           credit.swipeCard(2000.0);
           credit.makePayment(10000);
           credit.applyInterest();
	}

}
