package com.ait.application;

import com.ait.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {

	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
		// TODO Auto-generated constructor stub
	}

    private static final float MINBAL=0;

	private static float getMinbal() {
		return MINBAL;
	}
	
	@Override
	public void withdraw(float accBal)
	{
		
	}

	@Override
	public String toString() {
		return "MMSavingAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + "]";
	}
	
	
	
	
	

	

}
