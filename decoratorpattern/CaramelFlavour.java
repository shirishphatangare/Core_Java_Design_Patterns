package decoratorpattern;

public class CaramelFlavour implements IFlavour {
	
	IBeverage beverage;
	
	public CaramelFlavour(IBeverage beverage){
		this.beverage = beverage;
	}
	
	public double cost(){
		return beverage.cost() + 0.5;
	}
	
	public String description() {
		return beverage.description() + " + " + "CaramelFlavour ";
		
	}
}
