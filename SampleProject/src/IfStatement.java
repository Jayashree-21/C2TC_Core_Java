import java.util.*;
public class IfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s=new Scanner(System.in);
		try {
			System.out.print("Enter a Number is it gretaer than 0 or less");
			n=s.nextInt();
			if (n>100)
			{
				System.out.print("Number is it gretaer than 100");
			}

		}
		finally 
		{
			s.close();
		}
	}

}