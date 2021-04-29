package package_1;

public class ExplicitDataTypwConversion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 59.999999996785463782930395846356478638937362547849372648383;
		System.out.println("DOUBLE: "+a);
		
		float  f = (float) a;//Rounds off 
		System.out.println("FLOAT: "+f);
		long b = (long) a;//Does not round off 
		System.out.println("LONG: "+b);
		int c = (int) a;//Does not round off 
		System.out.println("INT: "+c);
		

	}

}
