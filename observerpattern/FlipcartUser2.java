package observerpattern;

public class FlipcartUser2 implements IObserver {

	String username;
	
	FlipcartObservable observable;
	
	public FlipcartUser2(FlipcartObservable observable,String username){
		this.observable = observable;
		this.username = username;
		observable.addObserver(this);
	}
	

	@Override
	public void update() {
		System.out.println("Product is available on Flipkart and price is - " + observable.getProuctPrice());
	}

	@Override
	public String getObserverName() {
		return username;
	}
	
	
}
