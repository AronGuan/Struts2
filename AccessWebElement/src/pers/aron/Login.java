package pers.aron;


import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class Login extends ActionSupport implements RequestAware,SessionAware,ApplicationAware{
	
	Map<String,Object> request;
	Map<String,Object> session;//一般只用到这个
	Map<String,Object> application;

	public String execute(){
		request.put("a1", "request");
		session.put("a1", "session");
		application.put("a1", "application");
		return SUCCESS;
	}

	@Override
	public void setApplication(Map<String, Object> request) {
		this.request = request;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	@Override
	public void setRequest(Map<String, Object> application) {
		this.application = application;
	}



}
