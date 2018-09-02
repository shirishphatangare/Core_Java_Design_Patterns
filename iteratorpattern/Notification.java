package iteratorpattern;

public class Notification {
	
	String notification;
	
	public Notification(String notification){
		this.notification = notification;
	}
	
	@Override
	public String toString(){
		return notification;
	}
	
}
