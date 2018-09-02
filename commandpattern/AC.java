package commandpattern;

public class AC implements IDevice{

	@Override
	public void on() {
		System.out.println("Executing AC on command..");
	}

	@Override
	public void off() {
		System.out.println("Executing AC off command..");
	}

}
