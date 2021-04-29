package package_1.equalshashcode;

public class MainClass {

	public static void main(String[] args) {
		
		Student test = new Student(1, "Test1", "Addr 1");
		Student test2= new Student(1,"Test2", "Addr 2");
		Student test3= new Student(3,"Test","Addr 3");
		
		//Running this simply will result in false as Java does not know how to equate the two objects 
		//The false is because Java is comparing the two references instead of the object itself 
		//Both references are stored in unique memory location
		//To fix this probelm -->Goto student class and override the equals method 
		System.out.println(test.equals(test2));

	}

}
