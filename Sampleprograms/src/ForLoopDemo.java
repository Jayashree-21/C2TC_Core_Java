import java.util.Scanner;
public class ForLoopDemo {
	public static void main(String a[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the range ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		for (int i = m; i <= n; i++) 
		{
			if(i%2==0)
			{
				System.out.println("Multiplication table of "+i);
				for(int j=1;j<=10;j++)
				{
					System.out.println(i + "*" + j + "=" + (i * j));
				}
			}	
		}
	}
}