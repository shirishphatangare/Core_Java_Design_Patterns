package decoratorpattern;

public class Cappuccino implements IBeverage {
	
	public double cost(){
		return 2.5;
	}
	
	public String description() {
		return "Cappuccino ";
		
	}
}
