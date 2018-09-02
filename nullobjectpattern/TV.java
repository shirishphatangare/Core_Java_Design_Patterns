package nullobjectpattern;

public class TV implements IDevice{

	@Override
	public void on() {
		System.out.println("Executing TV on command..");
	}

	@Override
	public void off() {
		System.out.println("Executing Tv off command..");
	}

}
