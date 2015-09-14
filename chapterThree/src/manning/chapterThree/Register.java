package manning.chapterThree;

import manning.chapterThree.utils.PortfolioService;
import manning.chapterThree.utils.User;

import com.opensymphony.xwork2.ActionSupport;

public class Register extends ActionSupport{

	public String execute(){
		User user = new User();
		user.setPassword( getPassword() );
		user.setPortfolioName( getPortfolioName() );
		user.setUsername( getUsername() );
		
		getPortfolioService().createAccount( user ); 
		return SUCCESS;
	}
	
	private String username;
	private String password;
	private String portfolioName;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public String getPortfolioName() {
		return portfolioName;
	}
	public void setPortfolioName(String portfolioName) {
		this.portfolioName = portfolioName;
	}
	
	public void validate(){
		
		PortfolioService ps = getPortfolioService();
		
		if(password.length() == 0){
			addFieldError("password", getText("password.required"));
		}
		if(username.length() == 0){
			addFieldError("username", getText("username.required"));
		}
		if(portfolioName.length() == 0){
			addFieldError("portfolioName", getText( "portfolioName.required" ));
		}
		if ( ps.userExists(getUsername() ) ){		
			addFieldError("username", getText( "user.exists"));
		}
	}
	
	public PortfolioService getPortfolioService(){
		return new PortfolioService();
	}
	
	
}
