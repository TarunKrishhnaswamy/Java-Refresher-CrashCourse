package interfaces;

//In interface we cannot define methods, but can only declare methods 
//So concrete methods are not allowed in an interface
//Can only declare public static final data type variables 
interface Bicycle {
	
	void applyBrake(int decrement);
	void speedUp(int increment);

}
