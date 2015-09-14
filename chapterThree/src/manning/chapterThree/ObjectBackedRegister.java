package manning.chapterThree;


import manning.chapterThree.utils.PortfolioService;
import manning.chapterThree.utils.User;

import com.opensymphony.xwork2.ActionSupport;


public class ObjectBackedRegister extends ActionSupport {
	

	public String execute(){
		
		getPortfolioService().createAccount( user ); 
		return SUCCESS;
	}
	
	
	private User user;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void validate(){
		

		PortfolioService ps = getPortfolioService();
		
	
		if ( getUser().getPassword().length() == 0 ){			
			addFieldError( "user.password", getText("password.required") );
		}
		if ( getUser().getUsername().length() == 0 ){			
			addFieldError( "user.username", getText("username.required") );
		}
		if ( getUser().getPortfolioName().length() == 0  ){			
			addFieldError( "user.portfolioName", getText( "portfolioName.required" ));
		}		

		if ( ps.userExists( getUser().getUsername() ) ){		
			addFieldError("user.username", getText( "user.exists"));
		}
		
	}
	
	public PortfolioService getPortfolioService( ) 	{
		
		return new PortfolioService();
		
	}
	
	

}
