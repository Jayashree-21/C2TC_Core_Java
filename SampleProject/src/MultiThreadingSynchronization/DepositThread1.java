package MultiThreadingSynchronization;

public class DepositThread1 extends Thread {
	AClass obj;
	int amt;
	String msg;

	public DepositThread1(AClass obj,int amt,String msg) {
		// TODO Auto-generated constructor stub
		this.obj = obj;
		this.amt = amt;
		this.msg = msg;
	}
		
		      
		
		public void DepositThread(AClass obj,int amt,String msg) {   
			this.obj = obj;
			this.amt = amt;
			this.msg = msg;
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
			obj.deposit(amt);	}

}
