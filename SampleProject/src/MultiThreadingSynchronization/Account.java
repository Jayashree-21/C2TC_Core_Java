package MultiThreadingSynchronization;

import java.util.Scanner;

public class Account {
	static int Balance = 10000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AClass oa = new AClass();
		DepositThread1 dt1 = new DepositThread1(oa,5000,"First");
		DepositThread1 dt2 = new DepositThread1(oa,4000,"Second");
		WithdrawThread wt1 = new WithdrawThread(oa,1000,"Second");
		WithdrawThread wt2 = new WithdrawThread(oa,1000,"Second");
	
		System.out.println("Enter your choice");
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		if(choice==1)
		{
			dt1.start();
			dt2.start();
			try {
				dt1.join();
				dt2.join();
			}
		
		catch(Exception e) {
			}
		}
		else if(choice==2)
		{
			wt1.start();
			wt2.start();
			try
			{
				wt1.join();
				wt2.join();
				}
			catch (Exception e)
			{
				
			}
		}
		else {
			System.out.println("Invalid Input");
		}
		System.out.println("Total balance is:" + Balance);
		}
}
