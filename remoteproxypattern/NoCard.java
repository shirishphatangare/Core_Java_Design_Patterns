package remoteproxypattern;

//Define what happens when current state is NoCard for all possible actions
public class NoCard implements ATMState{
	private static final long serialVersionUID = 1L;
	transient ATMMachine atmMachine; // Do not serialize and transfer this field with state object
	
	public NoCard(ATMMachine atmMachine){
		this.atmMachine = atmMachine;
	}
	
	@Override
	public void insertCard() {
		System.out.println("ATM Card inserted");
		atmMachine.setCurrentState(atmMachine.hasCard);
	}

	@Override
	public void ejectCard() {
		System.out.println("Card not in ATM slot");
	}

	

	@Override
	public void enterPin(int pin) {
		System.out.println("First insert ATM card and then enter pin");
	}

	@Override
	public void requestCash(int amount) {
		System.out.println("First insert ATM card and then request amount");
	}

}
