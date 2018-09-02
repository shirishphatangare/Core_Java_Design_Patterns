package protectionproxypattern;

public class User {
	String userName;
	String password;
	String designation;
	
	public User(String userName, String password, String designation) {
		super();
		this.userName = userName;
		this.password = password;
		this.designation = designation;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
}
