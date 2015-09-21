package manning.chapterFour.utils;


/*
 * Simple interface for actions that want have the user ojbect injected.  
 */

public interface UserAware {
	
	public void setUser( User user );
	
}