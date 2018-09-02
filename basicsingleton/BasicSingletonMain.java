package basicsingleton;

public class BasicSingletonMain {

	public static void main(String[] args) {
		System.out.println("Geting single instance of a Class");
		//BasicSingleton basicSingleton = BasicSingleton.createInstance();
		BasicSingleton basicSingleton = BasicSingleton.createInstanceDoubleCheckedLocking();
		System.out.println("Reading value of a singleton - " + basicSingleton.getValue());
		//BasicSingleton basicSingleton1 = new BasicSingleton(); // - This statement gives compilation error as constructor is not visible
	}

}
