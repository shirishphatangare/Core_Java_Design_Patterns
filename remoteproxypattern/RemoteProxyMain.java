package remoteproxypattern;

import java.rmi.Naming;

// Client side implementation of Remote Proxy pattern

public class RemoteProxyMain {

	public static void main(String[] args) {
		try {
			ATMMachineRemote machine = (ATMMachineRemote) Naming.lookup("rmi://192.168.0.15/atmmachine");
			ATMMonitor atmMonitor = new ATMMonitor(machine);
			atmMonitor.report();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
