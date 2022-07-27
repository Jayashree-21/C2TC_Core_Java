package com.ait.application;

import com.ait.framework.BankFactory;
import com.ait.framework.CurrentAcc;
import com.ait.framework.SavingAcc;

public class MMBankFactory implements BankFactory {
	
	public SavingAcc getNewSavingAcc(int AccNo, String accNm, float accBal, boolean isSalaried) {
		SavingAcc SavingAcc = new MMSavingAcc(AccNo, accNm, accBal, isSalaried);
		return SavingAcc;
		
	}
	public CurrentAcc getNewCurrentAcc(int AccNo, String accNm, float accBal, float creditLimit) {
		CurrentAcc CurrentAcc = new MMCurrentAcc(AccNo, accNm, accBal, creditLimit);
		return CurrentAcc;
	}

}
