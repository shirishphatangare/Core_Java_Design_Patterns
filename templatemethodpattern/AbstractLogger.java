package templatemethodpattern;

public abstract class AbstractLogger {

	// Common Final template method - algorithm footprint remains same in all subclass implementations
	public final void Log(Object message) {
		String messageLog = serializeMessage(message); // default implementation in abstract class
		openDatastore(); 			// override in subclass
		logMessage(messageLog);     // override in subclass
		closeDatastore(); 			// override in subclass
	}
	
	protected String serializeMessage(Object message) {
		System.out.println("Serializing message..");
		return message.toString();
	}
	
	protected abstract void openDatastore(); 
	protected abstract void logMessage(String messageLog);
	protected abstract void closeDatastore();
		
}
