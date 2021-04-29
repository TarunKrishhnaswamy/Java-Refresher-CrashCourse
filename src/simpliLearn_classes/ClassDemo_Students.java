package simpliLearn_classes;

//Class is a blue print of an object 
// Object is an instance of a class
//Say what??????????????????

//Fruther explanation
// Java is inspired from real life examples
//Class --> Logical entity
//Entities have two kinds of specification --> 1. Attribute(Properties) 2. Behaviors(Actions)

public class ClassDemo_Students 
{
	String name;
	int age;
	String address;
	
	//Constructor --> Special type of method in Ja va 
	public ClassDemo_Students(String name, int age, String address) {
		this.name = name;
		this.age= age;
		this.address = address;
		
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void setAddress(String address) {
		this.address=address;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getAddress() {
		return address;
	}
	
	@Override
	public String toString() {
		return("Student name is "+this.getName()+",age is: "+this.getAge()+" and address is: "
				+this.getAddress());
	}
	
	public static void main(String[] args) {
		ClassDemo_Students Tarun = new ClassDemo_Students("Tarun Krishnaswamy",28,"Plt 18, F3,SaiJeevadhar, Chennai, India");
		System.out.println(Tarun.toString());
		System.out.println(Tarun.getName());
		System.out.println(Tarun.getAge());
		System.out.println(Tarun.getAddress());
		
	}
}
