package package_1.staticDemo;

public class StaticDemo {
	
	public static void main(String[] args) {
		Student Tarun = new Student("Tarun",17,"Left, 123, North Plain");
		
		System.out.println(Tarun.getName());
		System.out.println(Tarun.getAddress());
		System.out.println(Tarun.getAge());
		System.out.println(Student.college);
	}

}
