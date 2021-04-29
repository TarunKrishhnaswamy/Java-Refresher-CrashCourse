package package_1;

public class ArrayDemo {

	public static void main(String[] args) {
		// Declare an array of integers 
		int[] anArray;
		
		//allocate memory for 10 integers 
		anArray = new int[5];
		
		//initialize array elements
		anArray[0]=1;
		anArray[1]=2;
		anArray[2]=3;
		anArray[3]=4;
		
		//Loops to be covered later 
		for(int i=0; i<=anArray.length-2;i++)
		{
			System.out.println("Element at index anArray["+i+"]"+"is "+anArray[i]);
		}

	}

}
