package statepattern;


// Define what happens when current state is HasCard for all possible actions
public class HasCard implements ATMState{
	ATMMachine atmMachine;
	
	public HasCard(ATMMachine atmMachine){
		this.atmMachine = atmMachine;
	}
	
	@Override
	public void insertCard() {
		System.out.println("Card already in ATM slot");
	}

	@Override
	public void ejectCard() {
		System.out.println("Card ejected from ATM slot");
		atmMachine.setCurrentState(atmMachine.noCard);
	}

	
	@Override
	public void enterPin(int pin) {
		if(pin == 1234){
			System.out.println("Pin is correct");
			atmMachine.setCurrentState(atmMachine.hasPin);
		}else{
			System.out.println("Pin is incorrect");
		}
	}

	@Override
	public void requestCash(int amount) {
		/*int cashAvailable = atmMachine.getAtmCashAmount();
		if(amount <= cashAvailable){
			System.out.println("Dispensing Rs - " + amount);
			cashAvailable = cashAvailable - amount;
			atmMachine.setAtmCashAmount(cashAvailable);
		}else{
			System.out.println(amount + " Rs is not available in ATM");
		}
		atmMachine.setCurrentState(atmMachine.hasPin);*/
		
		System.out.println("Please enter pin first");
	}

}
