public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=20;
		int b=30;
		//int res;
		// Arithmetic operations
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		// relational operator
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		
		//logical operators
		boolean c = true;
		boolean d = false;
		System.out.println(c && d);//false
		System.out.println(c || d);//true
		System.out.println(!c);//false
		
		//bitwise operator
		int e=60;
		int f=13;
		
		System.out.println(e&f);
		System.out.println(e|f);
		System.out.println(e^f);
		System.out.println(~f);
		
		//Assignment operator a=20
		
		System.out.println(a+=10);//30
		System.out.println(a-=10);//10
		System.out.println(a*=10);//200
		System.out.println(a/=10);//2
		System.out.println(a%=10);//0
		
		//conditional operator
		int h;
		 h=(a==20) ? 30: 20 ;
		 System.out.println(h);//30
	}

}