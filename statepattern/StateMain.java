package statepattern;

public class StateMain {

	
	// Always draw a table which defines state-action relationship for all possible states and actions
	public static void main(String[] args) {
		ATMMachine atmMachine = new ATMMachine();
		ATMState currentState = new NoCard(atmMachine);
		atmMachine.setCurrentState(currentState);
		atmMachine.setAtmCashAmount(5000);
		
		atmMachine.insertCard();
		atmMachine.enterPin(1234);
		atmMachine.requestCash(2000);
		atmMachine.ejectCard();
		atmMachine.requestCash(2000);
		atmMachine.insertCard();
		atmMachine.enterPin(1334);
		atmMachine.enterPin(1234);
		atmMachine.requestCash(2000);
		atmMachine.requestCash(1000);
		atmMachine.requestCash(1000);
		atmMachine.requestCash(100);
	}

}
