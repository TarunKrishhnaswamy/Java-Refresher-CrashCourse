package package_1.recursion;

public class ComplexFunction {
	
	static int calculateFactorial(int n) {
		if(n==1) {
			return 1;
		}else
		{
			return(n*calculateFactorial(n-1));
		}
	}
	
//	static int calculateFibonacci(int n) {
//		int ctr =1;
//		int startval =0;
//		int scndstart =1;
//		if (ctr<n) {
//			
//		}else {
//			int series = startval+scndstart;
//			System.out.println(series);
//			
//			
//		}
//	}
	
	public static void main(String[] args) {
		
		System.out.println(calculateFactorial(5));
	}

}
