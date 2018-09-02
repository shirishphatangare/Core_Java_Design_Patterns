package templatemethodpattern;

public class FileLogger extends AbstractLogger{

	@Override
	protected void openDatastore() {
		System.out.println("Opening File...");
	}

	@Override
	protected void logMessage(String messageLog) {
		System.out.println("Appending Log message to file : " + messageLog);
	}

	@Override
	protected void closeDatastore() {
		System.out.println("Closing File..."); 
		
	}

}
