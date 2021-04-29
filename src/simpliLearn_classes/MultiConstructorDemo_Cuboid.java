package simpliLearn_classes;

public class MultiConstructorDemo_Cuboid 
{
	int width;
	int height;
	int depth;
	
	//UseCase 1 : 3 unique values 
	MultiConstructorDemo_Cuboid(int width, int height, int depth)
	{
		this.width = width;
		this.depth= depth;
		this.height= height;
	}
	
	//User Case 2: any two values need to be unique 
	MultiConstructorDemo_Cuboid(int width, int height)
	{
		this.width = width;
		this.height= height;
		this.depth= 10;
		
	}

	//User Case3: All 3 values need the same input
	MultiConstructorDemo_Cuboid(int width)
	{
		this.width = width;
		this.height= width;
		this.depth=  width;
		
	}
	//User Case4: All 3 need static values
	
	MultiConstructorDemo_Cuboid()
	{
		this.width = 10;
		this.height= 20;
		this.depth=  30;
		
	}
	//To set and get value
	public void setWidth(int width) {
		this.width=width;
	}
	
	public void setDepth(int depth) {
		this.depth=depth;
	}
	
	public void setHeight(int height) {
		this.height=height;
	}

	public int getWidth() {
		return this.width;
	}
	
	public int getDepth() {
		return this.depth;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	int volume() {
		return width*height*depth;
	}
	
	int surfaceArea() {
		int surfaceAr= 2*(width*height+height*depth+depth*width);
		return surfaceAr;
	}
	
		public static void main(String[] args) 
	{
			int volume,surfaceArea;
		//User Case 1 	
		MultiConstructorDemo_Cuboid stdCuboid = new MultiConstructorDemo_Cuboid(10,20,15);
		volume = stdCuboid.volume();
		surfaceArea=stdCuboid.surfaceArea();
		System.out.println("Volume of Standard Cuboid is :"+volume);
		System.out.println("SurfaceArea of Standard Cuboid is :"+surfaceArea);
		
		
	
		//User Case 2
		MultiConstructorDemo_Cuboid cuboid_constdepth = new MultiConstructorDemo_Cuboid(25, 35);
		volume =cuboid_constdepth.volume();
		surfaceArea=cuboid_constdepth.surfaceArea();
		System.out.println("Volume of Cuboid with const depth is :"+volume);
		System.out.println("SurfaceArea of Cuboid with const depth is :"+surfaceArea);
		
		
		//User Case 3
		MultiConstructorDemo_Cuboid stdCube = new MultiConstructorDemo_Cuboid(25);
		volume =stdCube.volume();
		surfaceArea=stdCube.surfaceArea();
		System.out.println("Volume of Standard Cube is :"+volume);
		System.out.println("SurfaceArea of Standard Cube is :"+surfaceArea);
		
		//User Case 4
		
		MultiConstructorDemo_Cuboid staticCuboid = new MultiConstructorDemo_Cuboid();
		volume =staticCuboid.volume();
		surfaceArea=staticCuboid.surfaceArea();
		System.out.println("Volume of Static Cuboid is :"+volume);
		System.out.println("SurfaceArea of Static Cuboid is :"+surfaceArea);
		
	

	}

}
