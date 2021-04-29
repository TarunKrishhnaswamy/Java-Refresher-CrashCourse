package package_1.collections;

import java.util.Stack;

public class StackBasic {

	public static void main(String[] args) 
	{
		Stack<String> stack = new Stack<String>();
		
		stack.push("India");
		stack.push("Japan");
		stack.push("Kenya");
		stack.push("Lebanon");
		
		System.out.println(stack);
		
		String poppedElement = stack.pop();
		
		System.out.println("Popped Element: "+poppedElement);
		System.out.println("Now the stack looks like: "+stack);

	}

}
