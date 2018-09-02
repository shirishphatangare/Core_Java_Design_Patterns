package remoteproxypattern;

//Define what happens when current state is NoCash for all possible actions
public class NoCash implements ATMState{
	private static final long serialVersionUID = 1L;
	//transient ATMMachine atmMachine; // Do not serialize and transfer this field with state object
	ATMMachine atmMachine; // Do not serialize and transfer this field with state object
	
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
