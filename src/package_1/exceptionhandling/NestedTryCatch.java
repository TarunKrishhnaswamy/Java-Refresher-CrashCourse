package package_1.exceptionhandling;

public class NestedTryCatch {
	public static void main(String[] args) {
		
		try {//block 1
			try {//block 2
				try {//block 3
					int arr[]={1,2,3,4};
					System.out.println(arr[10]);
					
					
				}catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("ArrayIndexOutOfBoundException in block 3");
					throw e;
				}
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("ArrayIndexOutOfBoundException in block 2");
				throw e;
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundException in block 1");
			throw e;
		}finally {
			System.out.println("We are finally out of all 3 blocks in the finally tab ");
		}
	}

}
