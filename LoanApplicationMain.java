package com.encapsulations;

public class LoanApplicationMain {

	public static void main(String[] args) {
		 LoanApplication loan=new  LoanApplication("Bujji",100000,1.0,2,20000);
		 System.out.println(loan);
          loan.makePayment(2000);
          loan.calculateEMI();
          loan.displayLoanDetails();
	}

}
