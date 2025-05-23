package com.encapsulations;

public class CreditCardAccount {
       private String customerName;
       private double creditLimit;
       private double currentDebt;
       private double interestRate;
       public CreditCardAccount( String customerName, double creditLimit,double currentDebt,double interestRate) {
    	   this.customerName=customerName;
    	   this.creditLimit= creditLimit;
    	   this.currentDebt=currentDebt;
    	   this.interestRate=interestRate;
       }
       public void setCustomerName( String customerName) {
    	   this.customerName=customerName;
       }
       public void setCreditLimit(double creditLimit) {
    	   this.creditLimit=creditLimit;
       }
       public void setCurrentDebt(double currentDebt) {
    	   this.currentDebt=currentDebt;
       }
       public void setInterestRate(double interestRate){
    	   this.interestRate=interestRate;
       }
       public String getCustomerName() {
    	   return customerName;
       }
       public double getCreditLimit() {
    	   return creditLimit;
       }
       public double getCurrentDebt() {
    	   return currentDebt;
       }
       public double getInterestRate(){
    	   return interestRate;
       }
       public void swipeCard(double amount) {
    	   if(amount>creditLimit) {
    		   System.out.println("Transaction declined : limit exceeded");
    	   }else {
    		   System.out.println("Total Amount is:"+(amount+ currentDebt)); 
    		   
    	   }
       }
       public void makePayment(double amount) {
    	   if(amount>currentDebt) {
    		   System.out.println("Excess Payment not allowed");
    	   }
       }
       
       public void applyInterest() {
    	   currentDebt+=(currentDebt*(interestRate/100.0));
    	   System.out.println(currentDebt);
       }
       public String toString(){
    	   return "Customer Name is:"+customerName+"\nCredit Limit is:"+creditLimit+"\nCurrent Debt is:"+currentDebt+"\n InterestRate is:"+interestRate;
       }
	 


	}


