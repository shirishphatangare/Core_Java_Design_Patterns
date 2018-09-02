package commandpattern;

public class CommandMain {

	public static void main(String[] args) {
		IDevice AC = new AC();
		IDevice TV = new TV();
		IDevice Light = new Light();
		
		Invoker invoker = new Invoker(new LightOn(Light), new LightOff(Light), new TVOn(TV), new TVOff(TV), new ACOn(AC), new ACOff(AC));
		
		invoker.pressLightOnButton();
		invoker.pressLightOffButton();
		invoker.pressAcOnButton();
		invoker.pressAcOffButton();
		
		invoker.executeCommandSet1();
		invoker.executeCommandSet2();
		
		invoker.unDoLastCommand();
		invoker.unDoLastCommand();
		invoker.unDoLastCommand();
	}

}
