package commandpattern;

import java.util.LinkedList;

// Remote having different functionalities
public class Invoker {
	
	ICommand lightOnCommand;
	ICommand lightOffCommand;
	ICommand tvOnCommand;
	ICommand tvOffCommand;
	ICommand acOnCommand;
	ICommand acOffCommand;
	
	LinkedList<ICommand> commandList;
	
	public Invoker(ICommand lightOnCommand,ICommand lightOffCommand,ICommand tvOnCommand,ICommand tvOffCommand,ICommand acOnCommand,ICommand acOffCommand ){
		this.lightOnCommand = lightOnCommand;
		this.lightOffCommand = lightOffCommand;
		this.tvOnCommand = tvOnCommand;
		this.tvOffCommand = tvOffCommand;
		this.acOnCommand = acOnCommand;
		this.acOffCommand = acOffCommand;
		
		commandList = new LinkedList<>();
	}

	public void pressLightOnButton(){
		lightOnCommand.execute();
		commandList.add(lightOnCommand);
	}
	
	public void pressLightOffButton(){
		lightOffCommand.execute();
		commandList.add(lightOffCommand);
	}
	
	public void pressTvOnButton(){
		tvOnCommand.execute();
		commandList.add(tvOnCommand);
	}
	
	public void pressTvOffButton(){
		tvOffCommand.execute();
		commandList.add(tvOffCommand);
	}
	
	public void pressAcOnButton(){
		acOnCommand.execute();
		commandList.add(acOnCommand);
	}
	
	public void pressAcOffButton(){
		acOffCommand.execute();
		commandList.add(acOffCommand);
	}
	
	// Command Set 1 has below commands
	// 1. Lighton
	// 2. TVon
	// 3. ACon
	public void executeCommandSet1(){
		pressLightOnButton();
		pressTvOnButton();
		pressAcOnButton();
	}
	
	// Command Set 2 has below commands
	// 1. Lightoff
	// 2. TVoff
	// 3. ACoff
	public void executeCommandSet2(){
		pressLightOffButton();
		pressTvOffButton();
		pressAcOffButton();
	}
	
	public void unDoLastCommand(){
		ICommand command = commandList.getLast();
		command.unexecute();
		commandList.removeLast();
	}
	
}
