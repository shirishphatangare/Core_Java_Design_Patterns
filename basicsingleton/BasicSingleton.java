package basicsingleton;

public class BasicSingleton {
	
	private static BasicSingleton singleton = null;
	private int value;
	
	private BasicSingleton(){ // With private constructor, not new instance can be created from outside the class 
		value = 55;
	}
	
	public static synchronized BasicSingleton createInstance(){ // This approach has performance implications
		if(singleton == null){ // Lazy Initialization
			singleton = new BasicSingleton();
		}
		return singleton;
	}
	
	
	public static BasicSingleton createInstanceDoubleCheckedLocking(){ // Double Checked Locking - To improve performance
		if(singleton == null){ // Lazy Initialization
			synchronized(BasicSingleton.class){
				if(singleton == null){ // Double check Locking instead of using synchronized static method
					singleton = new BasicSingleton();
				}
			}
		}
		return singleton;
	}
	
	// Inner static singleton takes care of Thread Safety implicitly - No need of synchronized method or synchronized block

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
}
