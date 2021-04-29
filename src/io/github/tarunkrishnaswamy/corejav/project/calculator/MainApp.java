package io.github.tarunkrishnaswamy.corejav.project.calculator;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MainApp {

	public static void main(String[] args) {
		final String inputExp = ReadInput.read();

		Queue<String> operations;
		Queue<String> numbers;
// Assuming a calculation 4+5*3/2
		String numberArr[] = inputExp.split("[-+*/]");
		String operArr[] = inputExp.split("[0-9]+");
		// First converting array into a generic list
		// Converting the generic list into a linked list
		// Finally converting the linked list into a queue
		numbers = new LinkedList<String>(Arrays.asList(numberArr));
		operations = new LinkedList<String>(Arrays.asList(operArr));

		Double res = Double.parseDouble(numbers.poll());

		while (!numbers.isEmpty()) {

			String opr = operations.poll();

			Operate operate;
			switch (opr) {
			case "+":
				operate = new Add();
				break;
			case "-":
				operate = new Substract();
				break;
			case "*":
				operate = new Multiply();
				break;
			case "/":
				operate = new Divide();
				break;
			default:
				continue;
			}
			
			Double num = Double.parseDouble(numbers.poll());
			
			res = operate.getResult(res,num);
		}

		System.out.println(res);
	}

}
