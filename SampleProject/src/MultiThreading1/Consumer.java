package MultiThreading1;

public class Consumer extends Thread {
	InterThreadCommunication obj;

	public Consumer(InterThreadCommunication obj) {
		// TODO Auto-generated constructor stub
		this.obj = obj;
	}
	@Override
	public void run()
	{
		while(true)
		{
			try
			{
				Thread.sleep(4000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			obj.get();
		}
	}

}
