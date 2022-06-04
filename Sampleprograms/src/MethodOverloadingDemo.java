public class MethodOverloadingDemo 
{
	int add(int a,int b)
	{
		int sum=a+b;
		return sum;
	}
	
	float add(float a, float b)
	{
		return a+b;
	}
	
	float add(int a,float b,int c)
	{
		return a+b+c;
	}
}