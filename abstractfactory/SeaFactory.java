package abstractfactory;

public class SeaFactory implements AbstractFactory{
	
	public Animal createAnimal(){
		return new SeaAnimal();
	}

	@Override
	public Plant createPlant() {
		// TODO Auto-generated method stub
		return new SeaPlant();
	}
}
