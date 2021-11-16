package Model;

public class Post {
	private String UID ; 
	
	
	
	
	public Post() {
		super();
	}



	public Post(String uID, String title, String content, User user) {
		super();
		UID = uID;
		this.title = title;
		this.content = content;
		this.user = user;
	}



	public String getUID() {
		return UID;
	}



	public void setUID(String uID) {
		UID = uID;
	}
	private String title ; 
	private String content ; 
	private User user ;
	
	
	
	
	
	public Post(String title, String content, User user) {
		super();
		this.title = title;
		this.content = content;
		this.user = user;
	}
	
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	} 
	
	
	
	
	
	

}
