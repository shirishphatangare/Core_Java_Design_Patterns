package flyweightpattern;

public class FlyWeightMain {

	public static void main(String[] args) {
		Circle circle;
		int x=10;
		int y=10;
		System.out.println("Creating RED circles..");
		for(int i=0;i<10;i++){ // For simplicity we have taken 10 objects, but usually FlyWeight pattern is used when thousands of objects need to be created 
			circle = (Circle) FlyWeightFactory.getShape("circle");
			circle.setColor("red"); //setting extrinsic property of Circle object on the FLY
			circle.setX(x++);
			circle.setY(y++);
			circle.draw(); // Use same Circle object (in cache) with updated extrinsic property // For instance 
		}
		
		x=100;
		y=100;
		
		System.out.println("Creating GREEN circles..");
		for(int i=0;i<10;i++){
			circle = (Circle) FlyWeightFactory.getShape("circle");
			circle.setColor("green"); //setting extrinsic property of Circle object on the FLY
			circle.setX(x++);
			circle.setY(y++);
			circle.draw();
		}
		
		x=1000;
		y=1000;
		
		System.out.println("Creating BLUE circles..");
		for(int i=0;i<10;i++){
			circle = (Circle) FlyWeightFactory.getShape("circle");
			circle.setColor("blue"); //setting extrinsic property of Circle object on the FLY
			circle.setX(x++);
			circle.setY(y++);
			circle.draw();
		}
		
	}

}
