package enumsingleton;

// 1) Enum is nothing but a class with finite number of instances
// 2) You cannot inherit from an Enum
// 3) Enum has a private default constructor - No one can make new instances of Enum other than that declared inside Enum
// 4) Enums are implicitly serializable. We do not have to implement serializable interface. 
//	  However, Enum State can not be persisted with serialization. Only instance name is serializable, but fields are NOT serialized
// 5) If you are OK with these limitations of inheritance and serialization, you can use Enum based Singleton. 

public enum EnumBasedSingleton {
	INSTANCE; // Only one instance
	
	EnumBasedSingleton() { // private default constructor
		value = 44;
	}
	
	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
}
