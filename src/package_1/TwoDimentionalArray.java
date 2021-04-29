package package_1;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][]= {{2,7,9},{3,6,1},{7,4,2}};
		
		for (int i=0;i<3;i++)
		{
			//System.out.println("____________");
			System.out.print(" | ");
			for(int j=0;j<3;j++)
			{
			System.out.print(arr[i][j]+" | ");
			}
			System.out.println();
			//System.out.print("____________");
		}
		
	}

}
