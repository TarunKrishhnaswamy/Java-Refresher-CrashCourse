package package_1.abstraction;

public abstract class GraphicObject {
	int x,y;
	
	GraphicObject(){
		System.out.println("Base Abstract Class");
	}
	
	void moveTo(int newX, int newY) {
		System.out.println("move in x: "+x+" and in y: "+y);
		}
	abstract void draw();
	abstract void resize();
	// To provide implementation of the above abstract methods we need to extend to child class
	//and add implementation

}
