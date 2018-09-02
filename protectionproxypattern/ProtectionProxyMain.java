package protectionproxypattern;

public class ProtectionProxyMain {
	public static void main(String [] args) {
		User ceo = new User("user1","password1","CEO");
		User manager = new User("user2","password2","MANAGER");
		User developer = new User("user3","password3","DEVELOPER");

		System.out.println("CEO accessing shared folder");
		IFolderAccess folderaccess1 = new FolderProxy(ceo);
		folderaccess1.performReadOrWriteOperations();
		
		System.out.println("----------------------------------------------------------------");
		
		System.out.println("Manager accessing shared folder");
		IFolderAccess folderaccess2 = new FolderProxy(manager);
		folderaccess2.performReadOrWriteOperations();
		
		System.out.println("----------------------------------------------------------------");
		
		System.out.println("Developer accessing shared folder");
		IFolderAccess folderaccess3 = new FolderProxy(developer);
		folderaccess3.performReadOrWriteOperations();
		
	}

}
