package package_1.collections;

import java.util.TreeMap;

public class TreeMapBasic {

	public static void main(String[] args) 
	{
		// Natural sorting order based on Key 
		// custom key --> need to provide a custom sorting implementation to help Java sort
		TreeMap<Integer, String> treeMap= new TreeMap<>();
		
		treeMap.put(3, "A");
		treeMap.put(5, null);
		treeMap.put(1, null);
		
		System.out.println(treeMap);
		

	}

}
