package package_1.methodoverriding;

public class Bicycle {

	protected int gear;
	protected int speed;
	
	public Bicycle(int startSpeed,int startGear) {
		this.gear= startGear;
		this.speed = startSpeed;
		
	}
	
	public int getGear() {
		return gear;
	}
	public void setGear(int gear) {
		this.gear = gear;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void applyBrake(int decrement) {
		speed -= decrement;
	}
	public void accelearte(int increment) {
		speed += increment;
	}
}
