package pers.aron;


import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

public class Login extends ActionSupport{
	

	public String execute(){
		
		return SUCCESS;
	}
	
	private String username;
	private String password;

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
	
	public void validate(){
		if ( getPassword().length() == 0 ){			
			addFieldError( "password", getText("password.required") );
		}
		if ( getUsername().length() == 0 ){			
			addFieldError( "username", getText("username.required") );
		}
		addFieldError("global",getText("global.message"));

	}


}
