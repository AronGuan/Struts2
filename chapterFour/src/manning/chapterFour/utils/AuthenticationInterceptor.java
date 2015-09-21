package manning.chapterFour.utils;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

/*
 * This interceptor provides authentication for the secure actions of the application.
 * It does two things.  First, it checks the session scope map to see if there's user 
 * object present, which inidcates that the current user is already logged in.  If this
 * object is not present, the interceptor alters the workflow of the request by returning 
 * a login control string that causes the request to forward to the login page.
 * 
 * If the user object is present in the session map, then the interceptor injects the user
 * object into the action by calling the setUser method, and then allows the processing of 
 * the request to continue.  
 */

public class AuthenticationInterceptor implements Interceptor {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String intercept(ActionInvocation actionInvocation) throws Exception {
		Map session = actionInvocation.getInvocationContext().getSession();
		purgeStaleTokens(session);
		User user = (User)session.get(Struts2PortfolioConstants.USER);		
		if(user == null){
			return Action.LOGIN;
		}
		return null;
	}

	private void purgeStaleTokens(Map session){
		Object userToken = session.get(Struts2PortfolioConstants.USER);
		if(!(userToken instanceof User)) session.remove(Struts2PortfolioConstants.USER);
	}

}
