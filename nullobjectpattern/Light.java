package nullobjectpattern;

public class Light implements IDevice{

	@Override
	public void on() {
		System.out.println("Executing Light on command..");
	}

	@Override
	public void off() {
		System.out.println("Executing Light off command..");
	}

}
