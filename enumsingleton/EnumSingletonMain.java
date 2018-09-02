package enumsingleton;

public class EnumSingletonMain {

	public static void main(String[] args) {
		System.out.println("Geting single instance of an Enum");
		EnumBasedSingleton singleton = EnumBasedSingleton.INSTANCE;
		System.out.println("Reading value of an Enum - " + singleton.getValue());
		// EnumBasedSingleton singleton1 = new EnumBasedSingleton(); - This statement gives compilation error as base type is Enum and NOT class 
	}

}
