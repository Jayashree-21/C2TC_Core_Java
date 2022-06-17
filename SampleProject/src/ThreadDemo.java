
public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadClass t1 = new ThreadClass(5000,"First");
		ThreadClass t2 = new ThreadClass(3000,"Second");
		
		t1.start();
		t2.start();
		
		try
		{
			t1.join();
			t2.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
 
	}
}
