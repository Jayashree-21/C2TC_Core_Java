import java.util.*;

public class SwitchStatement 
{

	public static void main(String[] args)
	{

		Scanner s =new  Scanner(System.in);
		try
		{

			int s1;
			int a,b;
			
			
			System.out.println("Enter operations\n1.Addition\n2.Substraction\n3.Multiplication\n4.Divison");
			s1=s.nextInt();
			System.out.println("Enter a value of a:" );
			a=s.nextInt();
			System.out.println("Enter a value of b:"  );
			b=s.nextInt();
			
			switch(s1)
			{
			case 1 : 	int sum = a + b;
			System.out.println(sum);
			break;
			case 2 : 	int sum1 = a - b;
			System.out.println(sum1);
			break;
			case 3 : 	int sum2 = a * b;
			System.out.println(sum2);
			break;
			case 4 : 	float sum4 = a / b;
			System.out.println(sum4);
			break;
			default:
				System.out.println("Please enter a correct operation");

			}


		}


		finally 
		{ 
			s.close();
		}


	}
	
}
