package remoteproxypattern;

// IMPORTANT POINTS

// 1. Run rmiregistry from class directory C:\Java\DesignPatterns\bin>rmiregistry
// 2. Package names should be same at client and server side otherwise common interface (ATMMachineRemote) is not found

// The stub and skeleton are generated dynamically behibd the scenes

import java.rmi.Remote;
import java.rmi.RemoteException;

// This interface defines set of methods which can be called remotely
// All return types need to be primitive or Serializable
public interface ATMMachineRemote extends Remote{

	//public String getCurrentState() throws RemoteException;
	public ATMState getCurrentState() throws RemoteException;
	public int getAtmCashAmount() throws RemoteException;
}
