package abstractfactory;

public class LandFactory implements AbstractFactory{

	@Override
	public Animal createAnimal() {
		return new LandAnimal();
	}

	@Override
	public Plant createPlant() {
		return new LandPlant();
	}

}
