package nullobjectpattern;

public class ACOff implements ICommand{

	IDevice ac;
	
	public ACOff(IDevice ac){
		this.ac = ac;
	}
	
	@Override
	public void execute() {
		ac.off();
	}

	@Override
	public void unexecute() {
		ac.on();
	}

}
