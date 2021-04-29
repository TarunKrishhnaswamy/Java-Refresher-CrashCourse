package package_1.collections;
import java.util.*;
import java.util.Map.Entry;
public class HashMapBasic {

	public static void main(String[] args) 
	{
		//Key Value arrangement 
		// Key --> String (Set, accepts unique value)
		// Value --> Integer (List, allows duplicates)
		HashMap<String, Integer> hmap = new HashMap<>();
		
		hmap.put("a",10);
		hmap.put("b", 20);
		hmap.put("c", null);
		hmap.put("d", null);
		hmap.put("c", 25);
		//notice the hashmap does not allow duplicate keys and overwrites the previous value
		//with a new one so instead of c= null ... it gets updated to c=25
							
		
		System.out.println("Size of map is: "+hmap.size() );//To find the size of the map
		System.out.println(hmap);
		
		
		//containskey method -> to check if a hashmap has a particular key is present or not 
		
		if (hmap.containsKey("a"))
		{
			Integer a = hmap.get("a");
			System.out.println("Values of Key "+"\"a\" is: "+a);
		}
		
		//To iterate over all the keys and perform an operation
		//keySet --> Gives a set with all the keys 
		
		for (String key: hmap.keySet())
		{
			System.out.println("key: "+key+", value: "+ hmap.get(key));
		}
		
		//System.out.println(hmap.values());
		System.out.println();
		
		//To iterate over the <key, map> combination 
		// Entry set --> Hashmap treats each arrangement as an entry
		for (Entry <String, Integer> entry : hmap.entrySet())
		{
			System.out.println("Key: "+entry.getKey()+"; Value: "+entry.getValue());
		}
		
		

	}

}
