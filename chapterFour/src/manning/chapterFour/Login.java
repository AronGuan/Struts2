package manning.chapterFour;


import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import manning.chapterFour.utils.PortfolioService;
import manning.chapterFour.utils.User;
import manning.chapterFour.utils.Struts2PortfolioConstants;

import com.opensymphony.xwork2.ActionSupport;

public class Login extends ActionSupport implements SessionAware {
	

	public String execute(){
		
		User user = getPortfolioService().authenticateUser( getUsername(), getPassword() ); 
		if ( user == null )
		{
			return INPUT;
		}
		else{
			session.put( Struts2PortfolioConstants.USER, user );
		}
		
		return SUCCESS;
	}
	
	
	
	private String username;
	private String password;
	private Map session;


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
		
		PortfolioService ps = getPortfolioService();
		if ( getPassword().length() == 0 ){			
			addFieldError( "password", getText("password.required") );
		}
		if ( getUsername().length() == 0 ){			
			addFieldError( "username", getText("username.required") );
		}

	}
	
	public PortfolioService getPortfolioService( ) 	{
		
		return new PortfolioService();
		
	}

	public void setSession(Map session) {
		this.session = session;
		
	}
	
	

}
