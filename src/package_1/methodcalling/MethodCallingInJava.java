package package_1.methodcalling;

public class MethodCallingInJava {

	public static void main(String[] args) {
		
		int i = 1;
		int result = calculateVal(i);
		System.out.println(result);
		
		Student obj = new Student("Tarn", 22, 123);
		
		System.out.println("Name : "+obj.getName());
		System.out.println("Age  : "+obj.getAge());
		System.out.println("Id   : "+obj.getId());
		
//		nameCorrection(obj);
		Student resultObj= nameCorrectionNewObj(obj);
		
		System.out.println("Name after correction : "+resultObj.getName());
		

	}
	
	static int calculateVal(int i) {
		i ++;
		return i;
	}
	
	//Why does this work?
	//Passed ref pointed to the object inside the method -->over wrote the name the name on the object 
	//pointed by the particular refer 
	//This might look like pass by reference but it is actually pass by value ?
	//Both references are pointing to the same object 
	//Hence, we can mutate the values of an object inside a method -->DANGER!!!
	//Mutating an object from inside a method is not advisable -->causes chaos  
	//To not mutate an object -->Create a new object and just a replica of the exisitng object and make
	//changes to it-->Prevents over writing of exisitng object
//	static void nameCorrection(Student correction) {
//		correction.setName("Tarun");
//	}
	
	
	//This although gives the same result but here the initial object is neither touched nor manipulated
	//The original object can now be re-used as is and this is a good thing!
	static Student nameCorrectionNewObj(Student correction) {
		Student studentcorrect = new Student("Tarun Krishnaswamy",correction.getAge(),correction.getId());
		
		return studentcorrect;
		
		
	}

	
	
}
