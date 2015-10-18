package pers.aron;

import com.opensymphony.xwork2.ActionSupport;

public class ExceptionAction extends ActionSupport{

	
	@Override
	public String execute() throws Exception{
		throw new Exception("error message");
	}
}
