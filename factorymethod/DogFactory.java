package factorymethod;

public class DogFactory implements AnimalFactory{
	public Animal createAnimal() {
		return new Dog();
	}
}
