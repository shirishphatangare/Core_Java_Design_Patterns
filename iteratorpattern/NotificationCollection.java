package iteratorpattern;

public class NotificationCollection implements ICollection{

	Notification [] notificationArray;
	int MAX_SIZE = 6;
	int index = 0;
	
	public NotificationCollection(Notification [] notificationArray){
		this.notificationArray = notificationArray;
	}
	
	public void addItem(Notification notification){
		if(index < MAX_SIZE){
			notificationArray[index++] = notification;
		}else{
			System.out.println("Notification Max size limit reached..");
		}
	}
	
	public void removeLastItem(){
		if(index == MAX_SIZE){
			notificationArray[--index] = null;
		}else{
			notificationArray[index--] = null;
		}
		
	}
	
	@Override
	public IIterator getIterator() {
		return new NotificationIterator(this);
	}

}
