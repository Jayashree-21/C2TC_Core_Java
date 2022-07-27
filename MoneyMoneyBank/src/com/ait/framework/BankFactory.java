package com.ait.framework;

public interface BankFactory {
	public SavingAcc getNewSavingAcc(int AccNo, String accNm, float accBal, boolean isSalaried);
	public CurrentAcc getNewCurrentAcc(int AccNo, String accNm, float accBal, float creditLimit);
	
	

}
