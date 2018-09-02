package factorymethod;

public class FactoryMain {

	public static void main(String[] args) {
		
		AnimalFactory catfactory = new CatFactory();
		AnimalFactory dogfactory = new DogFactory();
		
		System.out.println("Creating Cat Object...");
		Animal cat = catfactory.createAnimal();
		cat.speak();
		
		
		
		System.out.println("Creating Dog Object...");
		Animal dog = dogfactory.createAnimal();
		dog.speak();
	}

}
