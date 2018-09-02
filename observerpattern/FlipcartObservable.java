package observerpattern;

import java.util.List;

public class FlipcartObservable implements IObservable{
	
	List<IObserver> registeredObservers; 
	int prouctPrice;
	
	public FlipcartObservable(List<IObserver> registeredObservers){
		this.registeredObservers = registeredObservers;
	}
	
	public void addObserver(IObserver observer) {
		registeredObservers.add(observer);
	}
	
	
	public void removeObserver(IObserver observer) {
		registeredObservers.remove(observer);
	}
	
	
	public void notifyObservers() {
		for(IObserver observer: registeredObservers){
			System.out.println("Notifying - " + observer.getObserverName());
			observer.update();
		}
	}
	
	public boolean isProductAvailable(){
		return true;
	}

	public int getProuctPrice() {
		return prouctPrice;
	}

	public void setProuctPrice(int prouctPrice) {
		this.prouctPrice = prouctPrice;
	}
	
	
}
