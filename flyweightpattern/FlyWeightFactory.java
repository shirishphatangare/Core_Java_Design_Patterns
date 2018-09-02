package flyweightpattern;

import java.util.HashMap;

public class FlyWeightFactory {
	private static HashMap<String,IShape> shapes = new HashMap<>();
	
	public static IShape getShape(String shapeName){
		IShape shape = null;
		if(shapeName.equals("circle")){
			shape = shapes.get("circle");
			
			if(shape == null){
				shape = new Circle();
				System.out.println("Creating new circle object and storing in Cache.." + shape);
				shapes.put("circle", shape);
			}else{
				System.out.println("Reusing circle object from Cache..");
			}
		}
		return shape;
	}
	
}

