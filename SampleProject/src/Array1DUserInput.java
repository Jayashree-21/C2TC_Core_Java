import java.util.Scanner;

public class Array1DUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[10];
		int n;
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("ENTER A NUMBER OF ELEMENTS IN ARRAY");
		n=sc.nextInt();
		for (int i=0;i<n;i++) 
		{
		
			System.out.println("ENTER  ELEMENTS");
			a[i]=sc.nextInt();
		}
		for (int i=0;i<n;i++)
		{
			System.out.println(a);
				
		}
		}
		
		finally 
		{
			sc.close();
		}
	}

}