package package_1.problems;

import java.util.ArrayList;
import java.util.List;

//Calculate sum of array list 
public class sumArrayList {

	public static void main(String[] args) 
	{
		List<Integer> intList = new ArrayList<>();
		intList.add(5);
		intList.add(25);
		intList.add(15);
		intList.add(35);
		int sum =0;
		for(int i: intList) {
			sum+=i;
		}
		
		//System.out.println("Sum of ArrayList "+sum);
		
		//intList.stream().


	}

}
