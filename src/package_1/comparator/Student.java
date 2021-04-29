package package_1.comparator;

public class Student implements Comparable<Student> {

	private int rollno;
	private String name;
	private int age;

	public Student(int roll, String naming, int ageo) {

		this.rollno = roll;
		this.name = naming;
		this.age = ageo;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Student cstudent) {
		// TODO Auto-generated method stub
		return this.rollno - cstudent.rollno;
	}

}
