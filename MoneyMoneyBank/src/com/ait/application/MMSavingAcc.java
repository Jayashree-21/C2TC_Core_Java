package com.ait.application;

import com.ait.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {

	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
		// TODO Auto-generated constructor stub
	}
	
	public void withdraw(float accBal)
	{
		
		
		
		System.out.println("Witdraw accBal:" +getAccBal() );
	}
	@Override
	public String toString() {
		return "MMSaingAcc [isSalary()=" + isSalaried() + ", toString()=" + super.toString() + ", getAccNo()=" + ", getAccNm()=" +getAccNm() + ", getAccBal()=" + getAccBal() + "	]";

	
	
	
	
	}
}
