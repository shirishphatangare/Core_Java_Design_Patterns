package flyweightpattern;

public class Circle implements IShape{
	int radius = 5; // Intrinsic property of Circle object
	int x; // Extrinsic
	int y;  // Extrinsic
	String color; // Extrinsic
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public void draw() {
		System.out.println(this + " -- Drawing circle at coordinates " + this.x + "," + this.y + ".. Radius = " + this.radius + " ..Color= " + this.color);
	}

}
