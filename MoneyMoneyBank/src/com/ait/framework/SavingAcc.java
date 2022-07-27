package com.ait.framework;

public class SavingAcc extends BankAcc  {
	private boolean isSalaried;
	private static final float MINBAL=0;
	
	private boolean isSalaried() {
		return isSalaried;
	}
    private void setSalaried(boolean isSalaried) {
		this.isSalaried = isSalaried;
	}
    private static float getMinbal() {
		return MINBAL;
	}
   
	public SavingAcc(int accNo, String accNm, float accBal,boolean isSalaried) {
		super();
		this.isSalaried = isSalaried;
	}
@Override
public void withdraw(float accBal) {
	
}
@Override
public String toString() {
	return "SavingAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + ", isSalaried=" + isSalaried + "]";
}




	
	
	
}