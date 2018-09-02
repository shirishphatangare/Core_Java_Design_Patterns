package builderpattern;

public class BuilderMain {
	
	public static void main(String [] args){
		JsonBuilder builder = new JsonBuilder();
		builder.addChild("name","Shirish");
		builder.addChild("age","39");
		builder.addChild("company","Atos");
		
		System.out.println("Printing JSON Object..");
		System.out.println(builder);
	}

}
