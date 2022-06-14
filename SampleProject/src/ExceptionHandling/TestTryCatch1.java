package ExceptionHandling;

import java.util.Scanner;
public class TestTryCatch1 {

	public static void main(String[] args) {
		try
		{
			Scanner sc = new Scanner(System.in);
			int a,b;
			System.out.println("Enter the value of a and b");
			a = sc.nextInt();
			b = sc.nextInt();
			int data = a/b;
			System.out.println("Data value is"+ data);
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
		System.out.println("Rest of the code");

	}

}
