package prackage_1.inheritance;

public class MountainBike extends Bicycle {
	public int seatHeight;
	
	//Super statement should be the first statement inside the constructor
	//Mountain bike ---> Extra property seat height
	//Since MountainBike is extending the bicycle class --> MountainBike is responsible 
	//to initialize the Bicycle class as well 
	//It takes responsibility by including the super class values in its constructor
	
	public MountainBike(int startSpeed, int startGear, int startHeight) {
		// super --> Base class constructor 
		super(startSpeed, startGear);//Providing inputs for base class constructor
		this.seatHeight = startHeight;
		
	}
	
	public void setHeight(int newHeight) {
		this.seatHeight = newHeight;
	}

	
	

}
