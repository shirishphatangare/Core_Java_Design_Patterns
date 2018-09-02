package remoteproxypattern;

import java.io.Serializable;

//All possible states implement ATMState interface
//All possible actions are defined as methods in ATMState interface
// These methods are overridden by different state implementations

// Extend Serializable so that State in all the subclasses can be transfered over the network
public interface ATMState extends Serializable{
	public void insertCard();
	public void ejectCard();
	public void enterPin(int pin);
	public void requestCash(int amount);
}
