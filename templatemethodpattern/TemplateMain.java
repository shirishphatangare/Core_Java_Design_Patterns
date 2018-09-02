package templatemethodpattern;

public class TemplateMain {
	public static void main(String [] args) {
		FileLogger fileLogger = new FileLogger();
		EmailLogger emailLogger = new EmailLogger();
		DataBaseLogger databaseLogger = new DataBaseLogger();
		
		fileLogger.Log("FILE LOG MESSAGE");
		emailLogger.Log("EMAIL LOG MESSAGE");
		databaseLogger.Log("DATABASE LOG MESSAGE");
	}

}
