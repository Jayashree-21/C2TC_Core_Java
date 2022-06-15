import java.util.Scanner;
public class CustomExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter student id");
		int id = sc.nextInt();
		
		if(id>100)
		{
			System.out.println("Student Found");
		}
		else
		{
			try
			{
				throw new StudentIdNotfoundException(id);
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}

	}

}
