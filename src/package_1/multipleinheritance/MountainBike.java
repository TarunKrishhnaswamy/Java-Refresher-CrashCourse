package package_1.multipleinheritance;

class MountainBike extends TwoWheeler implements Bicycle,Vehicle {
	private int seatHeight;
	private int gear;
	private int speed;
	
	public MountainBike (int startHeight,int startGear,int startSpeed) {
		this.seatHeight = startHeight;
		this.speed = startSpeed;
		this.gear = startGear;
	}
	
	@Override
	public void applyBrake(int decrement) {
		speed = speed-decrement;
		
	}

	@Override
	public void speedUp(int increment) {
		speed += increment;
		
	}

	public int getSeatHeight() {
		return seatHeight;
	}

	public int getGear() {
		return gear;
	}

	public int getSpeed() {
		return speed;
	}

	@Override
	public void canDrive() {
		System.out.println("Mnt Bike can be driven");
		
		
		
		
	}


}
