package iteratorpattern;

public class NotificationIterator implements IIterator{
	
	NotificationCollection collection;
	int pos = 0;

	public NotificationIterator(NotificationCollection collection){
		this.collection = collection;
	}
	
	
	
	@Override
	public boolean hasNext() {
		if(pos < collection.notificationArray.length)
			return true;
		else
			return false;
	}

	@Override
	public Object next() {
		return collection.notificationArray[pos++];
	}

	

}
