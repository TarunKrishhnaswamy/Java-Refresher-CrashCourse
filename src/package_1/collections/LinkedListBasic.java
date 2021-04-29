package package_1.collections;

import java.util.LinkedList;

public class LinkedListBasic {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		
		System.out.println(list);
		list.add("A");
		System.out.println(list);
		list.add("B");
		System.out.println(list);
		list.addLast("C");
		System.out.println(list);
		list.addFirst("D");
		System.out.println(list);
		list.add(2, "E");
		
		System.out.println(list);
		
		list.remove(2);
		
		System.out.println(list);
		
		list.removeFirst();
		
		System.out.println(list);
		
		list.removeLast();
		System.out.println(list);
		
		

	}

}
