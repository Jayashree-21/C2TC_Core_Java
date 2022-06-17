package MultiThreading;

public class A implements Runnable {
	int h;
	int l;
	String msg;
	
	public Class A(int h,int l,String msg)
	{
		this.h = h;
		this.l = l;
		this.msg = msg;
		return null;
	}
	@Override
	public void run()
	{
		for(int i= h;i>l;i--)
		{
			try
			{
				Thread.sleep(2000);
		}
			catch(Exception e)
			{
				
			}
			System.out.println(msg +i);
		}
	}
}



