package package_1.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueBasic {

	public static void main(String[] args) 
	{
		Queue<String> queue = new PriorityQueue<>();
		
		queue.add("India");
		queue.add("Germany");
		queue.add("Holland");
		queue.add("Japan");
		queue.add("Kenya");
		queue.add("Lebanon");
		
		
		System.out.println("Original Queue: "+queue);
		
		queue.remove();
		System.out.println("Queue after removing head element: "+queue);
		
		String head = queue.peek();
		System.out.println("Head of queue: "+head);
		
		head = queue.poll();
		System.out.println("Removed head with poll(): "+head);
		
		System.out.println("Queue after all changes made: "+queue);


	}

}
