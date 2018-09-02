package bridgepattern;


// RefinedAbstraction provides an extension to the Abstraction, usually adding extra methods that provide different ways of getting at the same functionality. 
public class DeviceMuteRemote extends Remote{

	
	public DeviceMuteRemote(EntertainmentDevice device){
		super(device);
	}
	
	
	public void muteDevicePressed(){
		System.out.println(device.getClass().getSimpleName() +  " muted");
	}
}
