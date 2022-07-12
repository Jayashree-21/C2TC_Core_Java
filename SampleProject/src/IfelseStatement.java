import java.util.*;
public class IfelseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s=new Scanner(System.in);
		try {
			System.out.print("Enter a Number ");
			n=s.nextInt();
			if (n>100)
			{
				System.out.print("Number is it gretaer than 100");
			}
			else 
			{
				System.out.print("Number is less than 100");
			}

		}
		finally 
		{
			s.close();
		}
	}

}