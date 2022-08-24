package com.ait.framework;

public  class BankAcc {
	protected int  accNo;
	protected String accNm;
	protected float accBal;
	
	

	/**
	 * @param accNo
	 * @param accNm
	 * @param accBal
	 */
	public BankAcc(int accNo, String accNm, float accBal) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}

	public void BankAcc(int accNo2, String accNm2, float creditLimit) {
		// TODO Auto-generated constructor stub
	}

	protected int getAccNo() {
		return accNo;
	}
	
	public String getAccNm() {
		return accNm;
	}
	private void setAccNm(String accNm) {
		this.accNm = accNm;
	}
	public float getAccBal() {
		return accBal;
	}
	public void withdraw(float accBal) {
	}
	//abstract public void deposit(float accBal);
	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + "]";
	}
}
