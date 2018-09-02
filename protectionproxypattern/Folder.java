package protectionproxypattern;

public class Folder implements IFolderAccess {

	@Override
	public void performReadOrWriteOperations() {
		System.out.println("Access Granted!! Performing read/write opearions on the shared folder");
	}

}
