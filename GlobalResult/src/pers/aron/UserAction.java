package pers.aron;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{

	private int type;
	
	@Override
	public String execute(){
		if(type == 1) return SUCCESS;
		else if(type == 2) return ERROR;
		return "mainpage";
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
	
	
}
