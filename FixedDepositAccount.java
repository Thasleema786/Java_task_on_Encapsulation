package com.encapsulations;

public class FixedDepositAccount {
    private String customerName;
     private double principalAmount;
     private double interestRate;
     private int duration;
     private double maturityAmount;
     public FixedDepositAccount(String customerName,double principalAmount,double interestRate, int duration,double maturityAmount) {
    	 this. customerName= customerName;
    	 this. principalAmount= principalAmount;
    	 this.interestRate=interestRate;
    	 this.duration=duration;
    	 this.maturityAmount=maturityAmount;
     }
     public void setCustomerName( String customerName) {
    	 this.customerName=customerName;
     }
     public void setPrincipalAmount(double principalAmount) {
    	 this.principalAmount=principalAmount;
     }
     public void setInterestRate(double interestRate) {
    	 this.interestRate=interestRate;
     }
     public void setDuration(int duration) {
    	 this.duration=duration;
     }
     public void setMaturityAmount(double maturityAmount ) {
    	 this.maturityAmount=maturityAmount;
     }
     
     public String getcustomerName() {
    	 return customerName;
     }
     public double getPrincipalAmount() {
    	 return principalAmount;
     }
     public double getInterestRate() {
    	 return  interestRate;
     }
     public int getDuration() {
    	 return  duration;
     }
     public double getMaturityAmount() {
    	 return  maturityAmount;
     }
     public void calculateMaturityAmount() {
    	 maturityAmount=principalAmount*Math.pow((1+(interestRate/12)),duration*12);
     }
     public void withdrawBeforeMaturity(int withdrawMonth) {
    	 if(withdrawMonth<duration*12) {
    		 maturityAmount=  maturityAmount+(maturityAmount*0.02);  
    	 }
    	 else if(12*duration<withdrawMonth) {
    		 System.out.println("can't withdraw before one year");
    	 }
     }

         public String toString() {
        	 return "Customer Name:"+ customerName+"\nPrincipalAmount is:"+principalAmount+"\nInterestRate is:"+interestRate+"\nDuration:"+duration+"\nMaturityAmount:"+maturityAmount;
		

	}

}
