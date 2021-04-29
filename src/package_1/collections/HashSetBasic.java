package package_1.collections;
import java.util.*;

public class HashSetBasic {

	public static void main(String[] args) 
	{
		//Can be declared as Set or HashSet
		Set<String> hashSet = new HashSet<>();
		
		hashSet.add("A");
		hashSet.add("B");
		hashSet.add("C");
		boolean r1 = hashSet.add("D");
		System.out.println(r1);	
		boolean r2 = hashSet.add("D");
		System.out.println(r2);	
		
		
		System.out.println(hashSet);
		
		System.out.println("List contains D or not? "+ hashSet.contains("D"));
		
		hashSet.remove("D");
		System.out.println("List contains D or not? "+ hashSet.contains("D"));
		
		for (String items: hashSet)//lsh = place holder : rhs = collection
		{
			System.out.println(items);
		}
		
	}

}
