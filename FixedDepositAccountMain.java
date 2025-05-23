package com.encapsulations;

public class FixedDepositAccountMain {

	public static void main(String[] args) {
		 FixedDepositAccount  fixed=new  FixedDepositAccount("Bujji",100000,2000,1,3000);
         System.out.println(fixed);
         fixed.calculateMaturityAmount();
         fixed. withdrawBeforeMaturity(23);
	}

}
