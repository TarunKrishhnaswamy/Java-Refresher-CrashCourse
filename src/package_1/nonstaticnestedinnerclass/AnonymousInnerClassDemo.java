package package_1.nonstaticnestedinnerclass;

public class AnonymousInnerClassDemo {
	public static void main(String[] args) {
//		Bicycle mntbike = new MountainBike();
//		mntbike.canApplyBreak();
//		mntbike.canSpeedUp();
		
		//What if we don't want to create an object for mountain bike class 
		//What if we only need the bicycle class object
		
		Bicycle bk = new Bicycle() {//Anonymous inner class
			
			@Override
			public void canSpeedUp() {
				System.out.println("Can speed up the mnt bike BICYCLE");
				
			}
			
			@Override
			public void canApplyBreak() {
				System.out.println("Can slow down the mnt bike BICYCLE");
				
			}
		};
		
		bk.canApplyBreak();
		bk.canSpeedUp();
	}

}
