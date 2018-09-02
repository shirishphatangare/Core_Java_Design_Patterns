package observerpattern;

import java.util.ArrayList;
import java.util.List;

public class ObserverMain {

	public static void main(String[] args) {
		List<IObserver> registeredObservers = new ArrayList<>(); 
		FlipcartObservable flipcartObservable = new FlipcartObservable(registeredObservers);
		
		String user1 = "Ram";
		String user2 = "Shyam";
		String user3 = "Yash";
		
		// Create Flipcart users and Register them with Flipcart
		IObserver observer1 = new FlipcartUser1(flipcartObservable,user1);
		IObserver observer2 = new FlipcartUser2(flipcartObservable,user2);
		IObserver observer3 = new FlipcartUser3(flipcartObservable,user3);
		
		// Check Flipcart every 50 secs and update observers
		notifyObservers(flipcartObservable);
	}
	
	private static void notifyObservers(FlipcartObservable flipcartObservable){
		
		if(flipcartObservable.isProductAvailable()){
			System.out.println("Product is available. Notifying observers...");
			flipcartObservable.setProuctPrice(756);
			flipcartObservable.notifyObservers();
		}else{
			System.out.println("Product is not available.");
		}
		
	}

}
