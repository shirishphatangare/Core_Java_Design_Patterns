package protectionproxypattern;

public class FolderProxy implements IFolderAccess {

	private User user;
	private Folder folder;
	
	public FolderProxy(User user) {
		this.user = user;
	}


	@Override
	public void performReadOrWriteOperations() {
		if(user.getDesignation().equalsIgnoreCase("Manager") || user.getDesignation().equalsIgnoreCase("CEO")) {
			folder = new Folder();
			System.out.println("Manager/CEO has access to shared folder for read and write operations");
			folder.performReadOrWriteOperations();
		}else if(user.getDesignation().equalsIgnoreCase("Developer")) {
			System.out.println("Developer do not have access to shared folder for read and write operations");
		}
	}

}
