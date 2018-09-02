package nullobjectpattern;


// NULL Object Pattern
// OO design principle - Replace conditionals (if-else) with polymorphism
// if condition checking nullability of an object can be replaced with Null object pattern via polymorphism 
// There can be situations in code where we need to use NoCommand i.e. command object which does nothing
// Null object pattern is useful in such situations
// We do not have to add any check for Null object and normal flow of program is not affected
// NoCommand Class will implement same ICommand interface as other commands and hence normal flow of program is not impacted

public class NullObjectMain {

	public static void main(String[] args) {
		IDevice AC = new AC();
		IDevice TV = new TV();
		IDevice Light = new Light();
		
		Invoker invoker = new Invoker(new LightOn(Light), new LightOff(Light), new TVOn(TV), new TVOff(TV), new ACOn(AC), new ACOff(AC), new NoCommand());
		
		invoker.pressLightOnButton();
		invoker.pressLightOffButton();
		invoker.pressAcOnButton();
		invoker.pressAcOffButton();
		
		// In program flow if there are some situations where we need to perform "no actions" even on press of remote button (like disabled button)
		// In such situations we can use null object pattern without adding any extra nullability checks (instead using polymorphism) and not affecting normal program flow. 
		invoker.pressNoFunctionButton();
		
		invoker.executeCommandSet1();
		invoker.executeCommandSet2();
		
		invoker.pressNoFunctionButton();
		invoker.unDoLastCommand();
		invoker.unDoLastCommand();
		invoker.unDoLastCommand();
	}

}
