package factorymethod;

public class CatFactory implements AnimalFactory{
	public Animal createAnimal() {
		return new Cat();
	}
}
