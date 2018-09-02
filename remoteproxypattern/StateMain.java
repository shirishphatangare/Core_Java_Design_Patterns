package remoteproxypattern;

import java.rmi.Naming;

//Client will contact stub on - rmi://192.168.0.15/atmmachine

public class StateMain {
	// This class gets ATMMachine up and running and registers it with the RMI registry
	public static void main(String[] args) {
		ATMMachineRemote atmMachine = null;
		int atmCashAmount = 15000;
		String machineNetworkIpAddress = "rmi://192.168.0.15";
		// Below property is required. Without below property setting client can not communicate with server
		System.setProperty("java.rmi.server.hostname", "192.168.0.15");
		try{
			atmMachine = new ATMMachine(atmCashAmount);
			((ATMMachine)atmMachine).setCurrentState(new NoCash((ATMMachine)atmMachine));
			// Publish ATMMachine stub under the name atmmachine
			Naming.rebind(machineNetworkIpAddress + "/atmmachine", atmMachine);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
