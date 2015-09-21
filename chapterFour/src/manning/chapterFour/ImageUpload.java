package manning.chapterFour;


import java.io.File;
import java.io.IOException;

import manning.chapterFour.utils.PortfolioService;
import manning.chapterFour.utils.User;

import com.opensymphony.xwork2.ActionSupport;


public class ImageUpload extends ActionSupport  {
	


	public String execute(){
		try {
			getPortfolioService().addImage( getPic(), getPicFileName(), fileSystemPath  );
		} catch (IOException e) {
			e.printStackTrace();
		}		
		return SUCCESS;		
	}

	File pic;
	String picContentType;
	String picFileName;
	String fileSystemPath;
	
	public File getPic() {
		return pic;
	}
	public void setPic(File pic) {
	    this.pic = pic;
	}
	
	public String getPicContentType() {
		return picContentType;
	}
	void setPicContentType(String picContentType) {
	    this.picContentType = picContentType;
	}
	
	public void setPicFileName(String picFileName) {
		this.picFileName = picFileName;
	}
	public String getPicFileName() {
		return picFileName;
	}
	public void setFileSystemPath(String fileSystemPath) {
		this.fileSystemPath = fileSystemPath;
	}
	
	public PortfolioService getPortfolioService( ) 	{
		
		return new PortfolioService();
		
	}
	
	

}
