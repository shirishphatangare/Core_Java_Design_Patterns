package chainofresponsibilitypattern;

public interface Chain {
	public void setNextChain(Chain nextChain);
	public void handleTransaction(int amount); 
}
