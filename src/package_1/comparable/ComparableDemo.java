package package_1.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {
	public static void main(String[] args) {
		ArrayList<Student> arrlist = new ArrayList<Student>();
		Student john = new Student(3, "john", 21);
		Student jane = new Student(1, "Jane", 18);
		Student tom = new Student(2, "Tom", 20);

		arrlist.add(john);
		arrlist.add(jane);
		arrlist.add(tom);

		Collections.sort(arrlist);
		System.out.println("Students after sorting them");
		arrlist.forEach(student -> System.out.println(student.getName()));
	}

}
