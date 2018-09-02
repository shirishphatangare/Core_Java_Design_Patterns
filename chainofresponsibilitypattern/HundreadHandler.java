package chainofresponsibilitypattern;

public class HundreadHandler implements Chain {

	private Chain nextChain;
	private static final int HUNDRED_DIVIDER = 100;
	
	@Override
	public void setNextChain(Chain nextChain) {
		this.nextChain = nextChain;
	}

	@Override
	public void handleTransaction(int amount) {
		System.out.println("Inside " + this.getClass().getSimpleName());
		double result = amount / HUNDRED_DIVIDER;
		int remainder = amount % HUNDRED_DIVIDER;
		int numberBills = (int) Math.floor(result);
		
		if( result >= 1 ) {
			System.out.println("Dispensing Rs. - " + (amount-remainder) + " in " + numberBills + " bills of " + HUNDRED_DIVIDER + " denomination" );
			if(remainder != 0) {
				nextChain.handleTransaction(remainder);
			}
		}else {
			System.out.println("Can not handle this request of " + amount + " Passing to next handler..");
			nextChain.handleTransaction(amount);
		}
	}

}
