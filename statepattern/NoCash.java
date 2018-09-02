package statepattern;

//Define what happens when current state is NoCash for all possible actions
public class NoCash implements ATMState{

	ATMMachine atmMachine;
	
	public NoCash(ATMMachine atmMachine){
		this.atmMachine = atmMachine;
	}
	
	@Override
	public void insertCard() {
		System.out.println("ATM card inserted");
		atmMachine.setCurrentState(atmMachine.hasCard);
	}

	@Override
	public void ejectCard() {
		System.out.println("ATM card ejected");
		atmMachine.setCurrentState(atmMachine.noCard);
	}

	@Override
	public void enterPin(int pin) {
		System.out.println("No Cash available in ATM");
	}

	@Override
	public void requestCash(int amount) {
		System.out.println("No Cash available in ATM");
	}

}
