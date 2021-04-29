package package_1.exceptions;

public class MyException extends Exception{
	
	//default constructor
	MyException(){};
	
	//Parameterized constructor 
	MyException(String str){
		super(str);
		str.equals("Text");
	}
	

}
