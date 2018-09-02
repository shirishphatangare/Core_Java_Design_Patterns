package commandpattern;

public class LightOff implements ICommand{
	IDevice light;
	
	public LightOff(IDevice light){
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.off();
	}

	@Override
	public void unexecute() {
		light.on();
	}

}
