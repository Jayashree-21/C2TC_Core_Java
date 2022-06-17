package MultiThreading1;

public class Ex {
	public static void main(String args)
	{
		InterThreadCommunication obj = new InterThreadCommunication();
		Producer p = new Producer(obj);
		Consumer c = new Consumer(obj);
		p.start();
		c.start();
		try
		{
			p.join();
			c.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

