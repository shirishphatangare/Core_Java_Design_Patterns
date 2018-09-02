package bridgepattern;


// Abstraction Layer - Main Abstract class
public abstract class Remote {

	EntertainmentDevice device;
	
	public Remote(EntertainmentDevice device){
		this.device = device;
	}
	
	public void increaseVolumeSetting() {
		device.increaseVolumeButtonPressed();
	}
	
	public void decreaseVolumeSetting() {
		device.decreaseDeviceSetting();
	}
		
	public void increaseDeviceSetting() {
		device.increaseDeviceSetting();
	}
	
	
	public void decreaseDeviceSetting() {
		device.decreaseDeviceSetting();
	}
	
	
	public void displayDeviceStatus() {
		device.displayDeviceStatus();
	}
	
}
