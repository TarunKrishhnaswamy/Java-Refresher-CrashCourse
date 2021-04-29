package interfaces;

public class InterfaceDemo {

	public static void main(String[] args) {
		MountainBike mntBike = new MountainBike(20,1, 10);
		
		System.out.println("Present Gear is: "+mntBike.getGear());
		System.out.println("Seat Height is: "+mntBike.getSeatHeight());
		System.out.println("BikeSpeed is : "+mntBike.getSpeed());
		
		mntBike.applyBrake(8);
		System.out.println("On Brake: "+mntBike.getSpeed());
		
		mntBike.speedUp(10);
		System.out.println("On acceleration: "+mntBike.getSpeed());

	}

}
