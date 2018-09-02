package statepattern;

// Context class has reference to ATMState instances
public class ATMMachine {
	ATMState hasCard;
	ATMState hasPin;
	ATMState noCard;
	ATMState noCash;
	
	ATMState currentState;
	int atmCashAmount;
	
	public ATMMachine(){
		hasCard = new HasCard(this);
		hasPin = new HasPin(this);
		noCard = new NoCard(this);
		noCash = new NoCash(this);
	}

	public ATMState getCurrentState() {
		return currentState;
	}

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
	
}
