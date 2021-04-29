package prackage_1.inheritance;

//Base Class as part of the inheritance 
public class Bicycle
{
	protected int gear;
	protected int speed;
	
	public Bicycle (int startSpeed,int startGear) {
		this.gear = startGear;
		this.speed = startSpeed;
	}

	public void setGear(int gearVal) {
		this.gear = gearVal;
	}

	public void applyBreak(int speedDec) {
		this.speed -= speedDec;
	}

	public void speedUp(int speedInc) {
		this.speed += speedInc;
	}

}
