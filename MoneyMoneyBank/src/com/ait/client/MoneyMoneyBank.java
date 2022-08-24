package com.ait.client;

import com.ait.application.MMCurrentAcc;
import com.ait.application.MMSavingAcc;
import com.ait.application.*;
public class MoneyMoneyBank {
	
	
	public static void main(String[] args) {
		MoneyMoneyBank obj=new MoneyMoneyBank ();
		MMSavingAcc jaya = (MMSavingAcc) obj.getNewSavingAcc(123,"jaya", 100.0f, true);
		jaya.withdraw(jaya.getAccBal());
		
		
		
		obj.getNewCurrentAcc(124,"shree",500.0f,20.0f);
		MMCurrentAcc shree = null;
		shree.withdraw(shree.getAccBal());
		
		
}

	private void getNewCurrentAcc(int i, String string, float f, float g) {
		// TODO Auto-generated method stub
		
	}

	private MMSavingAcc getNewSavingAcc(int i, String string, float f, boolean b) {
		// TODO Auto-generated method stub
		return null;
	}

}
