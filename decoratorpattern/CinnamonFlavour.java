package decoratorpattern;

public class CinnamonFlavour implements IFlavour{
	
	IBeverage beverage;
	
	public CinnamonFlavour(IBeverage beverage){
		this.beverage = beverage;
	}
	
	public double cost(){
		return beverage.cost() + 1.9;
	}
	
	public String description() {
		return beverage.description() + " + " + "CinnamonFlavour ";
		
	}
}
