package bridgepattern;
//RefinedAbstraction
public class DevicePauseRemote extends Remote{
	public DevicePauseRemote(EntertainmentDevice device){
		super(device);
	}
	
	
	public void pauseDevicePressed(){
		System.out.println(device.getClass().getSimpleName() +  " paused");
	}
}
