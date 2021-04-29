package package_1.equalshashcode;

public class Student {
	
	private int rollno;
	private String name;
	private String address;

	public Student(int rollno, String name,String address) {
		this.rollno = rollno;
		this.name = name;
		this.address=address;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) //Are the references pointing to the same object?
		return true;
		
		if(obj==null || obj.getClass() != this.getClass()) //getClass gives you the class type 
			//Here we check if the obj class object is of type Student or not!
			return false;
		
		Student student = (Student) obj; //Explicit casting --> Here we cast obj into the student object
		//How are we going to uniquely identify a student ... so the key here is roll no.
		return (student.rollno == this.rollno);
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
