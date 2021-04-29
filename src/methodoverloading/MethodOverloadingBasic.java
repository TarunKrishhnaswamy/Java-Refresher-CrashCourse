package methodoverloading;

public class MethodOverloadingBasic {
	
			
		public int multiply (int x, int y)
		{
			return (x*y);
		}
		
		public int multiply (int x, int y , int z)
		{
			return (x*y*z);
		}
		
		public double multiply (double x, int y) {
			return (x*y);
		}
		
		public double multiply (int x, double y) {
			return (x*y);
		}
		public static void main(String[] args) {
			MethodOverloadingBasic overloading = new MethodOverloadingBasic();
			
			System.out.println(overloading.multiply(2, 3));
			System.out.println(overloading.multiply(24.656565656565656565656, 5));
			System.out.println(overloading.multiply(12, 10, 20));
			System.out.println(overloading.multiply(24, 0.4657836578364836478364734647463));
		}

}
