package package_1.methodcalling;

public class Student {
	
	private String name;
	private int age;
	private int id;
	
	public Student (String stdname,int stdage,int stdid) {
		this.name=stdname;
		this.age=stdage;
		this.id=stdid;
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

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
