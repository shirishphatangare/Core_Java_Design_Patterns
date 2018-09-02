package remoteproxypattern;

//Define what happens when current state is HasPin for all possible actions
public class HasPin implements ATMState{
	private static final long serialVersionUID = 1L;
	transient ATMMachine atmMachine; // Do not serialize and transfer this field with state object
	
	public HasPin(ATMMachine atmMachine){
		this.atmMachine = atmMachine;
	}
	
	@Override
	public void insertCard() {
		System.out.println("Card already inserted");
	}

	@Override
	public void ejectCard() {
		System.out.println("Card Ejected.. Session terminated");
		atmMachine.setCurrentState(atmMachine.noCard);
	}

	
	@Override
	public void enterPin(int pin) {
		if(pin == 1234){
			System.out.println("Pin is correct");
		}else{
			System.out.println("Pin is incorrect");
		}
	}

	@Override
	public void requestCash(int amount) {
		int cashAvailable = atmMachine.getAtmCashAmount();
		
		if(amount <= cashAvailable){
			System.out.println("Dispensing Rs - " + amount);
			cashAvailable = cashAvailable - amount;
			atmMachine.setAtmCashAmount(cashAvailable);
		}else{
			if(cashAvailable == 0){
				System.out.println("Cash not available..");
				atmMachine.setCurrentState(atmMachine.noCash);
			}else{
				System.out.println(amount + " Rs is not available in ATM");
			}
		}
	}
}
