package bridgepattern;

public class BridgeMain {

	public static void main(String[] args) {
		System.out.println("Creating Entertainment devices..");
		
		// Create Entertainment device  - Implementation Hierarchy
		EntertainmentDevice tv = new TV(100);
		EntertainmentDevice radio = new Radio(25);
		
		// Create different Remote types - Remote types hierarchy can vary independently to that of EntertainmentDevice hierarchy and vice a versa
		// Abstraction Hierarchy
		DeviceMuteRemote deviceMuteRemote = new DeviceMuteRemote(tv); // Abstraction maintains the reference to the implementor - Here tv or radio
		DevicePauseRemote devicePauseRemote = new DevicePauseRemote(tv);
		DeviceStopRemote deviceStopRemote = new DeviceStopRemote(radio);
		
		System.out.println("Performing Mute Remote Operations on TV");
		deviceMuteRemote.increaseVolumeSetting();
		deviceMuteRemote.increaseVolumeSetting();
		deviceMuteRemote.increaseVolumeSetting();
		deviceMuteRemote.increaseVolumeSetting();
		deviceMuteRemote.increaseVolumeSetting();
		deviceMuteRemote.increaseDeviceSetting();
		deviceMuteRemote.decreaseDeviceSetting();
		deviceMuteRemote.decreaseDeviceSetting();
		deviceMuteRemote.displayDeviceStatus();
		deviceMuteRemote.muteDevicePressed();
		
		System.out.println("Performing Stop Remote Operations on Radio");
		deviceStopRemote.increaseVolumeSetting();
		deviceStopRemote.increaseVolumeSetting();
		deviceStopRemote.increaseVolumeSetting();
		deviceStopRemote.increaseDeviceSetting();
		deviceStopRemote.increaseDeviceSetting();
		deviceStopRemote.increaseDeviceSetting();
		deviceStopRemote.displayDeviceStatus();
		deviceStopRemote.stopDevicePressed();
		
		System.out.println("Performing pause Remote Operations on Radio");
		devicePauseRemote.increaseVolumeSetting();
		devicePauseRemote.increaseDeviceSetting();
		devicePauseRemote.displayDeviceStatus();
		devicePauseRemote.pauseDevicePressed();
		
		
	}

}
