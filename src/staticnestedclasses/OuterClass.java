package staticnestedclasses;

public class OuterClass {
	
	static int outerStaticMember = 10;
	int instanceMember = 20;
	
	private static int outerPrivateMember = 30;
	
	static class StaticNestedClass{
		
		void display() {
			System.out.println("Static member of outer class = "+ outerStaticMember);
			System.out.println("Private Static memebr of outer class = "+ outerPrivateMember);
			//Static block cannot access non-static variables
			//System.out.println("Non-static member of the outer class = "+inst);
		}
		
	}

}
