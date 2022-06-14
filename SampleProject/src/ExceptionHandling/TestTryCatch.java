package ExceptionHandling;

public class TestTryCatch {

	public static void main(String[] args) {
		try
		{
			int data = 50/0;
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
		System.out.println("Rest of the code");
	}

}
