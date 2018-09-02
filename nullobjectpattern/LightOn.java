package nullobjectpattern;

public class LightOn implements ICommand{
	IDevice light;
	
	public LightOn(IDevice light){
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();
	}

	@Override
	public void unexecute() {
		light.off();
	}

}
