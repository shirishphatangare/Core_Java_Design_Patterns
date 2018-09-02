package observerpattern;

public interface IObserver {
	public void update(); // If observable NOT sending data with update, it is called Pull and Observable reference is required in observer
	//public void update(String availablity); // If observable sending data with update, it is called Push and Observable reference not required in observer
	public String getObserverName();
}
