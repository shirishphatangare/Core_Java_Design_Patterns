package bridgepattern;
//RefinedAbstraction
public class DeviceStopRemote extends Remote{
	public DeviceStopRemote(EntertainmentDevice device){
		super(device);
	}
	
	
	public void stopDevicePressed(){
		System.out.println(device.getClass().getSimpleName()  +  " stopped");
	}
}
