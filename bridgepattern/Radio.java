package bridgepattern;


// Concrete Implementation
public class Radio extends EntertainmentDevice{
	public Radio(int maxDeviceSetting){
		this.maxDeviceSetting = maxDeviceSetting;
	}
	
	@Override
	public void increaseDeviceSetting() {
		if(deviceSetting < maxDeviceSetting){
			deviceSetting++;
		}else{
			System.out.println("Max no. of stations Reached..");
		}
	}

	@Override
	public void decreaseDeviceSetting() {
		if(deviceSetting > 0){
			deviceSetting--;
		}else{
			System.out.println("Min no. of stations Reached..");
		}
	}
	
	@Override
	public void displayDeviceStatus() {
		System.out.println("Displaying device status of Radio");
		System.out.println("Volume - " + volumeSetting);
		System.out.println("Station - " + deviceSetting);
	}
}
