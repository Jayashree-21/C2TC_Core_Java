package com.ait.application;

import com.ait.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {
	
	
	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(float accBal) {
}

	@Override
	public String toString() {
		return "MMCurrentAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + "]";
	}

	
	
	

}
