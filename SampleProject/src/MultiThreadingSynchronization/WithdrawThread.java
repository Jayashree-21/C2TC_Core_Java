package MultiThreadingSynchronization;

public class WithdrawThread extends Thread {
	AClass obj;
	int amt;
	//string msg;

	public WithdrawThread(AClass obj,int amt,String msg) {
		// TODO Auto-generated constructor stub
		this.obj = obj;
		this.amt = amt;
		//this.msg = msg;
	}
	@Override
	public void run()
	{
		try
		{
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			
		}
		System.out.println("First");
		obj.withdraw(amt);
	}

}
