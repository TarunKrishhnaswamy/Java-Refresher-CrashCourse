package prackage_1.inheritance;

public class InheritanceDemo {

	//Invoking inherited class
	public static void main(String[] args) 
	{
		MountainBike mountainbike = new MountainBike(20,10,1);
		
		System.out.println("Gear is: "+mountainbike.gear);
		System.out.println("Seat height is: "+mountainbike.seatHeight);
		System.out.println("Current Bike Speed: "+mountainbike.speed);
		mountainbike.speedUp(25);
		System.out.println("speedup: "+mountainbike.speed);
		
		mountainbike.applyBreak(20);
		
		System.out.println("ApplyBreak :"+mountainbike.speed);
		mountainbike.setHeight(3);

		System.out.println("New height: "+mountainbike.seatHeight);
	}

}
