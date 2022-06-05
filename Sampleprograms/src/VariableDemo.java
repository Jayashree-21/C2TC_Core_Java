
public class VariableDemo {
	static int a;
	static int b=10;
	
	static void func()
	{
		int c=10;
		a=30;
		b=60;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		}
	void func1()
	{
		func();
	}

	public static void main(String[] args) {
		func();
	}

}
