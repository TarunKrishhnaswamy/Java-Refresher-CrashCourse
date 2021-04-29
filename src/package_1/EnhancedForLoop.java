package package_1;

public class EnhancedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {1,2,3,4,5,6,7,8,9,0};
		
		for (int item:num) 
			// num here is a collection of array.. it can also be map, list,etc
			// item is a place holder variable name which is a temporary variable 
			//
		{
			System.out.println("Count is: "+item);
		}

	}

}
