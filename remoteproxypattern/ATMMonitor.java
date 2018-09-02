package remoteproxypattern;

public class ATMMonitor {
	ATMMachineRemote machine;

	public ATMMonitor(ATMMachineRemote machine) {
		this.machine = machine;
	}
	
	public void report() {
		try {
			System.out.println("Atm Machine State: " + machine.getCurrentState().getClass().getSimpleName());
			System.out.println("Atm Machine amount: " + machine.getAtmCashAmount());
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
