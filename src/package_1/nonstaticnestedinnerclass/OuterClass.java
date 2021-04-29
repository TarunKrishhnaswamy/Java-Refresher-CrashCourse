package package_1.nonstaticnestedinnerclass;

public class OuterClass {
	
	class InnerClass{
		public void display() {
			System.out.println("This is an inner class method");
		}
	}
	
	void outerClassMehtod() {
		System.out.println("Normal method inside the Outer Class");
		
		class MethodLocalClass{
			void localInnerMethod() {
				System.out.println("In the MethodlocalClass which is inside the outerclass method");
				
			}
		}
		
		MethodLocalClass mlc = new MethodLocalClass();
		mlc.localInnerMethod();
			
		
	}

}
