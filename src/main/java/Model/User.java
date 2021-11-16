package Model;

public class User {

	
	private	String UID ; 
	private	String userName ; 
	private int age ;
	private int nbPost ; 
	private String email ; 
	private boolean isAdmin ; 
	


	
	
	
	
	
	
	

	public User(String uID, String userName, int age, int nbPost, String email, boolean isAdmin) {
		super();
		UID = uID;
		this.userName = userName;
		this.age = age;
		this.nbPost = nbPost;
		this.email = email;
		this.isAdmin = isAdmin;
	}
	public String getUID() {
		return UID;
	}
	public void setUID(String uID) {
		UID = uID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}


	public int getNbPost() {
		return nbPost;
	}


	public void setNbPost(int nbPost) {
		this.nbPost = nbPost;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	public String isAdmin() {
		if(this.isAdmin == true) {
			 return "admin";
		}else{
			return "user"; 

		}
		
	}
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}


	
	
	
	
	
	
}
