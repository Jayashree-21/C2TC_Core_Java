class Bank
{
	float getInterstRate() 
	{
		return 6.7f;
	}
}

class SBI extends Bank
{

	@Override
	float getInterstRate() {
		// TODO Auto-generated method stub
		return 6.8f;
	}

}
class HDFC extends Bank
{

	@Override
	float getInterstRate() {
		// TODO Auto-generated method stub
		return 6.9f;
	}

}
public class MethodOveriddenDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//static Binding
		//loose coupling
		Bank b = new Bank();
		System.out.println(b.getInterstRate());

		SBI s= new SBI();
		System.out.println(s.getInterstRate());

		//Dynamic Binding assigning a child class as arefrence variable for parent class 
		//Hard copling
		Bank h=new HDFC();
		System.out.println(h.getInterstRate());

	}

}
