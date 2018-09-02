package decoratorpattern;

public class VanillaFlavour implements IFlavour{
	
	IBeverage beverage;
	
	public VanillaFlavour(IBeverage beverage){
		this.beverage = beverage;
	}
	
	public double cost(){
		return beverage.cost() + 1.0;
	}
	
	public String description() {
		return beverage.description() + " + " + "VanillaFlavour ";
		
	}
}
