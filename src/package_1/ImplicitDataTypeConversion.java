package package_1;

public class ImplicitDataTypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		
		int a =100;
		System.out.println("INTEGER : "+a);
		
		long b =a;//Can long store int value --> Yes 
		System.out.println("LONG : "+b);
		
		float c=b;//Can float store long value --> Yes 
		System.out.println("FLOAT : "+c);
	}

}
