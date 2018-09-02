package commandpattern;

public class TVOn implements ICommand{
	IDevice tv;
	
	public TVOn(IDevice tv){
		this.tv = tv;
	}
	
	@Override
	public void execute() {
		tv.on();
	}

	@Override
	public void unexecute() {
		tv.off();
	}

}
