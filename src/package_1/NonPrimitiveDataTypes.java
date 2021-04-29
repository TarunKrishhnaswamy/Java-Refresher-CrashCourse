package package_1;

public class NonPrimitiveDataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//One way of creating a string
		String str="test";// Use the same object multiple times - less memory usage
		System.out.println("String is: "+str);
		
		//Another way of creating a string
		String str1 = new String("test str1");//Will call a new object every time it is called - more memory usage
		System.out.println("Another String: "+str1);
		
		int arr[];//Can store a continuous sequence of anything - Homogeneous values  meaning having similar type
		arr = new int[2];
		arr[0]= 0;
		arr[1]= 1;
		//arr[2]= 2;
		
		//int arr1[] = new int[-2];
		
		
		
		System.out.println(arr); // Printing an array simply prints the memory foot print of the array as it is non-primitive [I@2c7b84de
		System.out.println(arr[1]);

	}

}
