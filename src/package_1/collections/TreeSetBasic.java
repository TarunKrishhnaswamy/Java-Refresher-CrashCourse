package package_1.collections;
import java.util.*;
public class TreeSetBasic {

	public static void main(String[] args) 
	{
		//Always specify size 
		//Can remove String key word after new keyword 
		TreeSet<String> treeSet = new TreeSet<String>();
		
		//Irrespective of order of input --> Natural order is returned 
		treeSet.add("B");
		treeSet.add("A");
		treeSet.add("C");
		treeSet.add("C");//add returns boolean as false and so the duplicated is not part of the set
		
		System.out.println(treeSet);
		//The output --> [A,B,C]
		//

	}

}
