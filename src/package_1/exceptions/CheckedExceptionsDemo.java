package package_1.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionsDemo {
	
	public static void main(String[] args) throws MyException  {
		//throws FileNotFoundException,IOException
//		FileReader file = new FileReader("D:\\IT LEARNING\\SimplyLearn_Java\\Test Demo\\checkckedexception.txt");
//		BufferedReader fileInput = new BufferedReader(file);
//		
//		//Print first 3 line of file in directory 
//		for (int counter =0; counter<3; counter++) {
//			System.out.println(fileInput.readLine());
//			
//			
//			fileInput.close();
			
//		}
		throw new MyException();
	
	
	
	
	}

}
