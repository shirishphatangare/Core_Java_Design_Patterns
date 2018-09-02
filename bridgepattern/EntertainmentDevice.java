package bridgepattern;


//Implementation Layer - Main Abstract class
public abstract class EntertainmentDevice {
	protected int volumeSetting = 0;
	protected int maxVolumeSetting = 50;
	protected int deviceSetting = 0;
	protected int maxDeviceSetting;
	
	public abstract void increaseDeviceSetting();
	public abstract void decreaseDeviceSetting();
	public abstract void displayDeviceStatus();
	
	public void increaseVolumeButtonPressed() {
		if(volumeSetting < maxVolumeSetting){
			volumeSetting++;
		}else{
			System.out.println("Max volume setting Reached..");
		}
	}
	
	public void decreaseVolumeButtonPressed() {
		if(volumeSetting > 0){
			volumeSetting--;
		}else{
			System.out.println("Min volume setting Reached..");
		}
	}
}
