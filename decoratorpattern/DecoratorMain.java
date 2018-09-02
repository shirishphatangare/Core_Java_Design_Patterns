package decoratorpattern;


public class DecoratorMain {

	public static void main(String[] args) {
		//System.out.println("Getting Price for Cappuccino with CaramelFlavour and ChocolateFlavour added...");
		
		IBeverage cappuccino = new Cappuccino();
		IBeverage cappuccinoWithCaramel = new CaramelFlavour(cappuccino);
		IBeverage cappuccinoWithCaramelAndChocolate = new ChocolateFlavour(cappuccinoWithCaramel);
		
		System.out.println("Price For " + cappuccinoWithCaramelAndChocolate.description() +  "is - $ " + cappuccinoWithCaramelAndChocolate.cost());
		
		//System.out.println("Getting Price for Espresso with CaramelFlavour CinnamonFlavour and VanillaFlavour added...");
		
		IBeverage espresso = new Espresso();
		IBeverage espressoWithCaramel = new CaramelFlavour(espresso);
		IBeverage espressoWithCaramelAndCinnamon = new CinnamonFlavour(espressoWithCaramel);
		IBeverage espressoWithCaramelAndCinnamonAndVanilla = new VanillaFlavour(espressoWithCaramelAndCinnamon);
		
		System.out.println("Price for " + espressoWithCaramelAndCinnamonAndVanilla.description() +  "is - $ " + espressoWithCaramelAndCinnamonAndVanilla.cost());
	}

}
