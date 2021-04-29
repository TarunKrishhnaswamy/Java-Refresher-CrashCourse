package package_1.exceptionhandling;

import java.util.List;
import java.util.ArrayList;


public class WriterHelper {
	
	public void writeList() {
		try {
			List<Integer> list = new ArrayList<>(10);
			list.add(1);
			System.out.println("Entering" +" try statement");
			
			Integer a = list.get(1);
			
			System.out.println("Accessing the first element: "+a);
		}catch (IndexOutOfBoundsException e) {
			System.err.println("Caught IndexOutOfBoundException: "+e.getMessage());
			throw e;
			//System.err.println(e.get);
		}finally {
			System.out.println("Finally block executed eventually");
		}
	}

}
