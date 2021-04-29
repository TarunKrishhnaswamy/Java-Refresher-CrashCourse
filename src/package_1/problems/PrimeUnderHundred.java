package package_1.problems;

//Program to print all prime numbers under 100
//Think and fix this code
public class PrimeUnderHundred {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ctr=0;
		for (int i=1;i<100;i++)
		{
			for(int j=1;j<=i;j++)
			{
				
				if(i%j==0)
				{
					ctr++;
				}
				
			}
			if (ctr==2)
			{
				System.out.println(i);
			}
			ctr=0;
			
		}

	}

}
