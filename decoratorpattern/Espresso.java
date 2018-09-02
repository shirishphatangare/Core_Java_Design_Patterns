package decoratorpattern;

public class Espresso implements IBeverage{

	public double cost(){
		return 3.5;
	}
	
	public String description() {
		return "Espresso ";
		
	}
}
