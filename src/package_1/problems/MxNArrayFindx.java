package package_1.problems;

public class MxNArrayFindx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Conditions 
		//Accept array input M * N
		//Accept a number x
		//Sort array in ascending order 
		//Find if x is part of the array 
		
		
		int arr [][]= {{1,2,3,4,5},{6,7,8,9,10}};
		int x = 10;
		
		for (int i =0;i<2;i++)
		{
			for (int j=0; j<5;j++)
			{
				if (x==arr[i][j])
					System.out.println(true);
				else 
					continue;
			}
		}

	}

}
