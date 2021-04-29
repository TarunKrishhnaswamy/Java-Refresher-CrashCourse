package package_1.collections;

import java.util.ArrayList;
import java.util.List;


public class ArrayListBasics {

	public static void main(String[] args) 
	{
//Initialization of an Array list 
//Can also start with ArrayList instead of List 
//Good practice is to declare with the type of interface which is "List" here 
//This helps in if there is a need to switch from ArrayList to some other form of List
//Interface<class object type> variable = new Type of class belonging to iterface <type>(default size);	
		List<Integer> arrayList = new ArrayList<Integer>(5);
		
		for (int i =1; i<=5;i++)
		{
			arrayList.add(i);
		}
		
		//Printing Elements
		System.out.println(arrayList);
		
		//Remove element at index 3
		arrayList.remove(3);
		
		//Display the ArrayList
		//after deletion 
		System.out.println(arrayList);
		
		//Printing elements one by one
		
		for (int i =0; i<arrayList.size();i++)
		{
			System.out.print(arrayList.get(i)+" ");
		}
		
		System.out.println();
		//Using enhanced for loop 
		for (int i : arrayList)
		{
			System.out.print(i+" ");
		}

	}

}
