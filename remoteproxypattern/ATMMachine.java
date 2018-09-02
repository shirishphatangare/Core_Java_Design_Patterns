package remoteproxypattern;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

// Context class has reference to ATMState instances
// UnicastRemoteObject gives ATMMachine class the ability to act as a remote service
public class ATMMachine extends UnicastRemoteObject implements ATMMachineRemote{
	private static final long serialVersionUID = 1L;
	ATMState hasCard;
	ATMState hasPin;
	ATMState noCard;
	ATMState noCash;
	
	ATMState currentState;
	int atmCashAmount;
	
	public ATMMachine(int atmCashAmount) throws RemoteException{
		hasCard = new HasCard(this);
		hasPin = new HasPin(this);
		noCard = new NoCard(this);
		noCash = new NoCash(this);
		
		this.atmCashAmount = atmCashAmount;
	}

	/*public ATMState getCurrentState() {
		return currentState;
	}*/

	public void setCurrentState(ATMState currentState) {
		this.currentState = currentState;
	}
	
	public int getAtmCashAmount() {
		return atmCashAmount;
	}

	public void setAtmCashAmount(int atmCashAmount) {
		this.atmCashAmount = atmCashAmount;
	}
	
	
	public void insertCard() {
		currentState.insertCard();
	}
	
	public void ejectCard() {
		currentState.ejectCard();
	}
	
	
	public void enterPin(int pin) {
		currentState.enterPin(pin);
	}
	
	public void requestCash(int amount) {
		currentState.requestCash(amount);
	}

	@Override
	public ATMState getCurrentState() throws RemoteException {
		return currentState;
	}

	/*@Override
	public String getCurrentState() {
		return currentState.getClass().getSimpleName();
	}*/
	
	
	
}
