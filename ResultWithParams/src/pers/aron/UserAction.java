package pers.aron;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{

	private int type;

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
	
	@Override
	public String execute(){
		return SUCCESS;
	}
}