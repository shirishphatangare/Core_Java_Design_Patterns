package chainofresponsibilitypattern;


// This example is of Chain of responsibility where each request is handled by multiple receivers in a chain.
// There is another variant of Chain of responsibility pattern where each request is handled by only one receiver in chain.
public class ChainMain {

	public static void main(String[] args) {
		Chain chain1 = new HundreadHandler();
		Chain chain2 = new FiftyHandler();
		Chain chain3 = new TenHandler();
		Chain chain4 = new FiveHandler();
		Chain chain5 = new OneHandler();
		
		
		chain1.setNextChain(chain2);
		chain2.setNextChain(chain3);
		chain3.setNextChain(chain4);
		chain4.setNextChain(chain5);
		
		int totalAmount = 258432;
		System.out.println("Requesting ATM to dispense Rs - " + totalAmount);
		chain1.handleTransaction(totalAmount);

		
	}

}
