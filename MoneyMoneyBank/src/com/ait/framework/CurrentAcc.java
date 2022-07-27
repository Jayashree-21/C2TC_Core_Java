package com.ait.framework;

public class CurrentAcc extends BankAcc {
	private float creditLimit;


	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
		this.creditLimit = creditLimit;
	}
	


	private float getCreditLimit() {
		return creditLimit;
	}
	



	@Override
	public void withdraw(float accBal) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public String toString() {
		return "CurrentAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + ", creditLimit=" + creditLimit
				+ "]";
	}
	
	

}
