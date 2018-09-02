package abstractfactory;


public class AbstractFactoryMain {

	public static void main(String[] args) {
		System.out.println("Creating Sea Animal Factory..");
		AbstractFactory seaFactory = new SeaFactory();
		System.out.println("Building Sea Animal ..");
		buildSeaAnimal(seaFactory);
		System.out.println("Creating Land Animal Factory..");
		AbstractFactory landFactory = new LandFactory();
		System.out.println("Building Land Animal ..");
		buildLandAnimal(landFactory);
		
		System.out.println("Creating Sea Plant Factory..");
		//AbstractFactory seaAnimalFactory = new SeaFactory();
		System.out.println("Building Sea Plant ..");
		buildSeaPlant(seaFactory);
		System.out.println("Creating Land Plant Factory..");
		//AbstractFactory landAnimalFactory = new LandAnimalFactory();
		System.out.println("Building Land Plant ..");
		buildLandPlant(landFactory);
	}
	
	
	private static void buildSeaAnimal(AbstractFactory seaFactory){
		Animal seaAnimal = seaFactory.createAnimal();
		seaAnimal.speak();
	}
	
	private static void buildLandAnimal(AbstractFactory landFactory){
		Animal landAnimal = landFactory.createAnimal();
		landAnimal.speak();
	}
	
	private static void buildSeaPlant(AbstractFactory seaFactory){
		Plant seaPlant = seaFactory.createPlant();
		seaPlant.speak();
	}
	
	private static void buildLandPlant(AbstractFactory landFactory){
		Plant landPlant = landFactory.createPlant();
		landPlant.speak();
	}

}
