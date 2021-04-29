package package_1.methodoverriding;

public class MethodOverRidingDemo {

	public static void main(String[] args) {
		
		Bicycle bike = new Bicycle(10,1);
		System.out.println("Bicycle gear is: "+bike.gear);
		System.out.println("Bicycle speed is: "+bike.speed);
		bike.applyBrake(1);
		System.out.println("Bicycle speed after applying breaks is: "+bike.speed);
		
		Bicycle mntbike = new MountainBike (50,50,3);
		System.out.println("Mountain Bike Gear is: "+mntbike.gear);
		System.out.println("MountainBike speed is: "+mntbike.speed);
		
		mntbike.applyBrake(1);
		
		System.out.println("Mountainbike speed after applying break is: "+mntbike.speed);
		
		mntbike.accelearte(2);
		
		System.out.println("Mount bike speed after acceleration is: "+mntbike.speed);
		
		
		

	}

}
