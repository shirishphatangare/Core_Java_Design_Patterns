package decoratorpattern;

public class ChocolateFlavour implements IFlavour{
	
	IBeverage beverage;
	
	public ChocolateFlavour(IBeverage beverage){
		this.beverage = beverage;
	}
	
	
	public double cost(){
		return beverage.cost() + 1.2;
	}
	
	public String description() {
		return beverage.description() + " + " + "ChocolateFlavour ";
		
	}
}
