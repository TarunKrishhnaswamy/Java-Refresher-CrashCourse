package staticnestedclasses;

public class StaticNestedClassedDemo {
	
	public static void main(String[] args) {
		//accessing static nested class
		OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();
		nestedObject.display();
	}

}
