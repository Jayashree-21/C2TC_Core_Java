import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String h2= new String();
		Scanner sc = new Scanner(System.in);
		try
		{
		System.out.println("ENTER THE A STRING");		
		h2=sc.nextLine();
		System.out.println("THE  STRING IS " + h2.toUpperCase());	
		}
		
		finally
		{
			sc.close();
		}

	}

}