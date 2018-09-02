package commandpattern;

public class TVOff implements ICommand{
	IDevice tv;
	
	public TVOff(IDevice tv){
		this.tv = tv;
	}
	
	@Override
	public void execute() {
		tv.off();
	}

	@Override
	public void unexecute() {
		tv.on();
	}

}
