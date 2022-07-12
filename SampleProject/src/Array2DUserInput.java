import java.util.*;

public class Array2DUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[20][10];
		int b[][]=new int[20][10];
		int m,n;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter number of rows : ");
			m=sc.nextInt();
			System.out.println("Enter number of cols : ");
			n=sc.nextInt();
			System.out.println("MATRIX A IS \n");
			for ( int i =0;i<m;i++) 
			{
				for (int j=0;j<n;j++) 
				{
					System.out.println("Enter a Element");
					a[i][j]=sc.nextInt();

				}

			}
			System.out.println("MATRIX B IS \n");
			for ( int i =0;i<m;i++) 
			{
				for (int j=0;j<n;j++) 
				{
					System.out.println("Enter a Element");
					b[i][j]=sc.nextInt();

				}

			}
			System.out.print("\n");
			System.out.println("Enter 2D  multipliaction ARRAY A  IS");
			for (int j=0; j< 3*n+5 ;j++) 
			{
				System.out.print("-");

			}
			System.out.print("\n");


			for ( int i =0;i<m;i++) 
			{
				System.out.print("|");
				for (int j=0;j<n;j++) 
				{
					System.out.print("  " + a[i][j]);



				}
				System.out.print("   |");
				System.out.print("\n");
			}
			for (int j=0; j< 3*n +5 ;j++) 
			{
				System.out.print("-");

			}
			System.out.println("\n Enter 2D  multipliaction ARRAY B IS");
			for (int j=0; j< 3*n+5 ;j++) 
			{
				System.out.print("-");

			}
			System.out.print("\n");


			for ( int i =0;i<m;i++) 
			{
				System.out.print("|");
				for (int j=0;j<n;j++) 
				{
					System.out.print("  " + b[i][j]);



				}
				System.out.print("   |");
				System.out.print("\n");
			}
			for (int j=0; j< 3*n +5 ;j++) 
			{
				System.out.print("-");

			}




		}
		finally 
		{
			sc.close();	
		}

	}

}