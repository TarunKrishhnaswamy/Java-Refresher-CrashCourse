package package_1.methodoverriding;

public class MountainBike extends Bicycle {
	
	public int seatHeight;
	
	public MountainBike (int startHeight,int startSpeed,int startGear) {
		super(startSpeed,startGear);
		this.seatHeight = startHeight;
	}

	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}
	
	@Override
	public void setGear(int newValue) {
		this.gear = newValue+2;
	}

	@Override
	public void applyBrake(int decrement) {
		this.speed -= decrement+5;
	}
	
	@Override
	public void accelearte(int increment) {
		speed += increment+10;
	}
}
