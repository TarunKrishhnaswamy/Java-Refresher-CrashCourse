package package_1.nonstaticnestedinnerclass;

public class InnerClassDemo {
	//To initialize a non-static nested class
	
	public static void main(String[] args) {
		OuterClass.InnerClass in = new OuterClass().new InnerClass();
		in.display();
		
		OuterClass outerCls = new OuterClass();
		outerCls.outerClassMehtod();
		
	}

}
