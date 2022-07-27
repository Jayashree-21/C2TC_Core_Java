package com.ait.framework;

public  abstract class BankAcc {
	protected int accNo;
	protected String accNm;
	protected float accBal;

	private int getAccNo() {
		return accNo;
	}
	
	private String getAccNm() {
		return accNm;
	}
	private void setAccNm(String accNm) {
		this.accNm = accNm;
	}
	public float getAccBal() {
		return accBal;
	}
	abstract public void withdraw(float accBal);
	//abstract public void deposit(float accBal);
	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + "]";
	}
}
