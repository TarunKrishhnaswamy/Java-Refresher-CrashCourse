package package1_streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) 
	{
		//Using our basic knowledge of collections
		List<Integer> numberList = new ArrayList<>();
		numberList.add(10);
		numberList.add(20);
		numberList.add(30);
		numberList.add(40);
		numberList.add(50);
		
		System.out.println("numberList :"+numberList);
		
		//We need so many lines of code just to find the square of each element present in the list
		List<Integer> squareList = new ArrayList<>();
		for (Integer i: numberList) {
			squareList.add(i*i);
		}
		
		//Using the streams concept 
		//numberList--> Collection being used 
		//List<Integer> var = collectiontype.stream()
		//with.stream() --> elements of the list are streamed one by one 
		List<Integer> streamsqList = numberList.stream().map(i -> i*i).collect(Collectors.toList());
		//System.out.println("Square of numberList elements: "+streamsqList);
		
		
		//Take a list --> Square the list and store it in a set 
		
		Set<Integer> streamsqlistset = numberList.stream().map(a -> a*a).collect(Collectors.toSet());
		//System.out.println("Square of numberList elements as a Set: "+streamsqlistset);
		
		
		//Filtering 
		List<String> languages = new ArrayList<>();
		languages.add("java");
		languages.add("javascript");
		languages.add("c++");
		languages.add("python");
		languages.add("scala");
		
		//Create a list from the above list with string starting with p
		//Old method
		List<String> filterResult = new ArrayList<>();
		
		for (String i : languages) 
		{
			if(i.startsWith("p")) 
			{
				filterResult.add(i);
			}
		}
	//System.out.println("String with string starting wtih p :"+filterResult);	
		
		
		//New method with streams
		// filter something new here --> Used for making a conditional logic
		List <String> strfltrRslt = languages.stream().filter(a -> a.startsWith("p")).collect(Collectors.toList());
		
		System.out.println("Stream Languages starting with 'p': "+strfltrRslt);
		
		
		//Sorting using normal list 
		List<String> sortedlist = new ArrayList<>();
		sortedlist = languages.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted List: "+sortedlist);
		
		
		
		//forEach in streams 
		//Printing elements one by one in a for each loop being used under streams
		languages.stream().forEach(y -> System.out.println("Element is: "+y));
		
		//Breaking single line code in streams function
		
		languages.stream().forEach(y -> {
			
			String x = "";
			x=x.concat(y);
			final String z = x;
		});//Notice we are trying to reduce the result of this collection into a single result for that we need the reduce method
		
		
		//Trying to concatenate all the string values into one using reduce method 
		
		String x= languages.stream().reduce("",(con,i)->con.concat(i));//Success : P
		
		System.out.println("language concatenate: "+x); 
		
		//reduce method in stream 
		
		//Identity - an element that is the initial value of the reduction operation
		//and the default result if the stream is empty
		
		//Accumulator - a function that takes two parameters:
		//a partial result of the reduction operation and the next element of the stream 
		
		//Combiner - a function used to combine the partial result of the reduction operation
		//when the reduction is parallelized, or when there's a mismatch between the types of the
		//accumulator arguments and the types of the accumulator implementation
	
		
		int sum = numberList.stream().reduce(0, (ans,i)->ans+i);
		System.out.println("With reduce method: "+sum);
		
		
		
	
		
		
		
	

	}

}
