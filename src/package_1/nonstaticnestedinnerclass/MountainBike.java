package package_1.nonstaticnestedinnerclass;

public class MountainBike implements Bicycle {

	@Override
	public void canSpeedUp() {
		System.out.println("Can speed up the mnt bike");
		
	}

	@Override
	public void canApplyBreak() {
		System.out.println("Can slow down the mnt bike");
		
	}

}
