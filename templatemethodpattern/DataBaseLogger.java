package templatemethodpattern;

public class DataBaseLogger extends AbstractLogger{

	@Override
	protected void openDatastore() {
		System.out.println("Connecting to Database...");
	}

	@Override
	protected void logMessage(String messageLog) {
		System.out.println("Inserting Log Message to DB table : " + messageLog);
	}

	@Override
	protected void closeDatastore() {
		System.out.println("Closing DB connection..");
	}

}
