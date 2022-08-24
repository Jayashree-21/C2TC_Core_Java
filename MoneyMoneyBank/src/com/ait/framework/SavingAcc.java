package com.ait.framework;

public class SavingAcc extends BankAcc  {
	private boolean isSalaried;
	private static final float creditLimit=0;
	
	protected boolean isSalaried() {
		return isSalaried;
	}
    private void setSalaried(boolean isSalaried) {
		this.isSalaried = isSalaried;
	}
    private static float getcreditLimit() {
		return creditLimit;
	}
   
	public SavingAcc(int accNo, String accNm, float accBal,boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
	}
@Override
public void withdraw(float accBal) {
	
}
@Override
public String toString() {
	
	String isSalary = null;
	return "SavingAcc [isSalary=" +  isSalary + " ,getAccNo() =" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal() + "     ]";
}
}




	
	
	
