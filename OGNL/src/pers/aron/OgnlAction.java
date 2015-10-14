package pers.aron;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class OgnlAction extends ActionSupport{

	private String password;
	private String username;
	
	private User user;

	private User user1 = new User(8);
	
	private List<User> user2 = new ArrayList<User>();
	
	public OgnlAction(){
		user2.add(new User(1));
		user2.add(new User(2));
		user2.add(new User(3));
	}
	
	public String execute(){
		return SUCCESS;
	}
	
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


	public User getUser1() {
		return user1;
	}


	public void setUser1(User user1) {
		this.user1 = user1;
	}

	public List<User> getUser2() {
		return user2;
	}

	public void setUser2(List<User> user2) {
		this.user2 = user2;
	}
	
	
	
}
