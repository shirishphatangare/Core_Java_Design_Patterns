package decoratorpattern;

public interface IFlavour extends IBeverage { // Decorator Interface
	public double cost();
	public String description();
}
