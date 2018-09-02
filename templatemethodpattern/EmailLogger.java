package templatemethodpattern;

public class EmailLogger extends AbstractLogger{

	@Override
	protected void openDatastore() {
		System.out.println("Connecting to mail server and logging in");
		
	}

	@Override
	protected void logMessage(String messageLog) {
		System.out.println("Sending Email with Log Message : " + messageLog);
	}

	@Override
	protected void closeDatastore() {
		System.out.println("Dispose Connection to mail server");
	}

}
