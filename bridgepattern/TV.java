package bridgepattern;


//Concrete Implementation
public class TV extends EntertainmentDevice{

	public TV(int maxDeviceSetting){
		this.maxDeviceSetting = maxDeviceSetting;
	}
	
	@Override
	public void increaseDeviceSetting() {
		if(deviceSetting < maxDeviceSetting){
			deviceSetting++;
		}else{
			System.out.println("Max no of channels Reached..");
		}
	}

	@Override
	public void decreaseDeviceSetting() {
		if(deviceSetting > 0){
			deviceSetting--;
		}else{
			System.out.println("Min no of channels Reached..");
		}
	}

	@Override
	public void displayDeviceStatus() {
		System.out.println("Displaying device status of TV");
		System.out.println("Volume - " + volumeSetting);
		System.out.println("Station - " + deviceSetting);
	}
	
}
