public class ConditionalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//conditional operator
		int h;
		int a=10;
		String name="Bheemaraya";
		h = (a == 1) ? 20: 30;
		System.out.println( "Value of b is : " +  h );

		h = (a == 10) ? 20: 30;
		System.out.println( "Value of b is : " + h );
		h=  (a==20)   ? 30: 20 ;
		System.out.println( "Value of b is : " + h );
		
		boolean result= name instanceof String;
		System.out.println( result );
	
	
	}

}