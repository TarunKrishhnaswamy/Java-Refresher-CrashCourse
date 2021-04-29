package prackage_1.encapsulation;

public class Student {
	
	private String name;
	private int age;
	private String address;
	
	public Student(String name,int age,String address) {
		this.name=name;
		this.age= age;
		this.address=address;
		
	}

	//getter and setter propertied can be moulded as per our need 
	//We govern as to how we want the name to be returned
	public String getName() {
		return name;
	}

	public void setName(String name) {
		//this.name --> object 
		//name --> argument coming in !
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return ("Student name is "+this.getName()+",age is: "+this.getAge()
		+" and address is: "+this.getAddress());
	}
	
	public static void main(String args[]) {
		Student john = new Student("John", 17, "Left Avenue, North Road, 1234");
	}

	
}
