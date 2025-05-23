package com.encapsulations;
import java.math.*;
public class LoanApplication {
	private String customerName;
	private double loanAmount;
	private double interestRate;
	private int loanTerm;
	private double outStandingBalance;
	   public LoanApplication( String customerName,double loanAmount,double interestRate,int loanTerm,double outStandingBalance) {
		   this.customerName=customerName;
		   this. loanAmount= loanAmount;
		   this.interestRate=interestRate;
		   this.loanTerm=loanTerm;
		   this.outStandingBalance=outStandingBalance;
	   }
	        public void setCustomerName(String customerName) {
	        	this.customerName=customerName;
	        }
	        public void setLoanAmount(double loanAmount) {
	        	this.loanAmount=loanAmount;
	        }
	        public void setInterestRate(double interestRate) {
	        	this.interestRate=interestRate;
	        }
              
	        public void setLoanTerm(int loanTerm) {
	        	this.loanTerm=loanTerm;
	        }
	        public void setOutStandingBalance(double outStandingBalance) {
	        	this.outStandingBalance=outStandingBalance; 
	        }
	        public String getCustomerName() {
	        	return customerName;
	        }
	        public double getLoanAmount() {
	        	return loanAmount;
	        }
	        public double getInterestRate() {
	        	return interestRate;
	        }
	        public int getLoanTerm() {
	        	return loanTerm;
	        }
	        public double getOutStandingBalance() {
	        	return outStandingBalance;
	        }
	        public void makePayment(double amount) {
	        	this.outStandingBalance=outStandingBalance-amount;
	        	if(amount<=0) {
	        	}else if(outStandingBalance<amount) {
	        		System.out.println("Payment exceeds loan balance");
	        	}else {
	        		loanAmount=outStandingBalance-amount;
	        		System.out.println("amount is:"+loanAmount);
	        	}
	        }
             
	            public void calculateEMI() {
	            	double x=(Math.pow(1+interestRate, loanTerm*12));
	            	double monthlyEMI=(loanAmount*interestRate*(x/(x-1)));
	            	System.out.println("emi: "+monthlyEMI);
	            }
	             public void displayLoanDetails() {
	            	 System.out.println("Total loan is:"+ loanAmount);
	            	 System.out.println("Interest is:"+interestRate);
	            	  calculateEMI();
	            	 System.out.println("Remaining balance:"+outStandingBalance);
	             }
	             public String toString() {
	            	 return "Customer Name is :" +customerName+"\nLoan Amount is:"+loanAmount+"InterestRate is:"+interestRate+"\nLoan term is:"+ loanTerm+"\nOutStandingBalance is:"+outStandingBalance;
	             }

}


