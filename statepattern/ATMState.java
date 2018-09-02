package statepattern;

//All possible states implement ATMState interface
//All possible actions are defined as methods in ATMState interface
// These methods are overridden by different state implementations
public interface ATMState {
	public void insertCard();
	public void ejectCard();
	public void enterPin(int pin);
	public void requestCash(int amount);
}
