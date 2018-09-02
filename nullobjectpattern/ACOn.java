package nullobjectpattern;

public class ACOn implements ICommand{
	
	IDevice ac;
	
	public ACOn(IDevice ac){
		this.ac = ac;
	}
	
	@Override
	public void execute() {
		ac.on();
	}

	@Override
	public void unexecute() {
		ac.off();
	}

}
