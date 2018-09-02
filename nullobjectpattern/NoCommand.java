package nullobjectpattern;

// NULL object pattern can also be used as NullIterator or NullStrategy or NullDecorator etc.

public class NoCommand implements ICommand{

	// Below methods do NOTHING for a NoCommand
	
	public NoCommand() {
	
	}

	@Override
	public void execute() {
		// Do Nothing!!
		System.out.println("Executing 'No command' but performing No action..");
	}

	@Override
	public void unexecute() {
		// Do Nothing!!
		System.out.println("UnExecuting 'No command' but performing No action..");
	}

}
