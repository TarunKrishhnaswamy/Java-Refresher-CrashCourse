package package_1.staticDemo;

public class Student {
	
	String name;
	int age;
	String address;
	static final String college = "Univ";
	static int count =0;
	
	public Student(String name,int age, String address) {
		this.name = name;
		this.age= age;
		this.address = address;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

	public static String getCollege() {
		return college;
	}
	
	static void studentcount() {
		count++;
		
	}

	public int getcount() {
		return count;
	}
}
