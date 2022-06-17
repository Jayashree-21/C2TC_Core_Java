package MultiThreading;

public class ThreadDemo1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A oa1 = new A();
		A oa2 = new A();
		B ob = new B();
		
		Thread t1 = new Thread(oa1);
		Thread t2 = new Thread(oa2);
		Thread t3 = new Thread();
		
		t1.start();
		t2.start();
		t3.start();
		
		try
		{
			t1.join();
			t2.join();
			t3.join();
		}
		catch(Exception e)
		{
			
		}
		System.out.println("HAVE A NICE DAY");

	}

}
