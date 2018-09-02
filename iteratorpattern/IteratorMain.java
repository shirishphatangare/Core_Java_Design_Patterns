package iteratorpattern;

public class IteratorMain {
	public static void main(String[] args){
		
		System.out.println("Creating a Notification Collection...");
		Notification [] notificationArray =  new Notification [6];
		NotificationCollection notificationCollection  = new NotificationCollection(notificationArray);
		
		notificationCollection.addItem(new Notification("notification 1"));
		notificationCollection.addItem(new Notification("notification 2"));
		notificationCollection.addItem(new Notification("notification 3"));
		notificationCollection.addItem(new Notification("notification 4"));
		notificationCollection.addItem(new Notification("notification 5"));
		notificationCollection.addItem(new Notification("notification 6"));
		notificationCollection.addItem(new Notification("notification 7"));
		
		
		notificationCollection.removeLastItem();
		notificationCollection.addItem(new Notification("notification 16"));
		notificationCollection.removeLastItem();
		notificationCollection.removeLastItem();
		notificationCollection.addItem(new Notification("notification 11"));
		
		System.out.println("Iterating over a NotificationCollection using NotificationIterator");
		
		IIterator iterator = notificationCollection.getIterator();
		
		while(iterator.hasNext()){
			Notification n = (Notification) iterator.next();
			System.out.println(n);
		}
		
	}

}
