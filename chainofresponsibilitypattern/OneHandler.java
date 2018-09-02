package chainofresponsibilitypattern;

public class OneHandler implements Chain{
	private Chain nextChain;
	
	
	public Chain getNextChain() {
		return nextChain;
	}

	@Override
	public void setNextChain(Chain nextChain) {
		this.nextChain = nextChain;
	}

	@Override
	public void handleTransaction(int amount) {
		System.out.println("Inside " + this.getClass().getSimpleName());
		System.out.println("Dispensing Rs. - " + amount + " in " + amount + " bills of 1 denomination");
	}
}


