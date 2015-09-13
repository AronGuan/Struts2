package manning.chapterTwo;

public class HelloWorld {
	
	private static final String GREETING = "Hello";
	private String name;
	private String CustomGreeting;
	
	public String execute(){
		setCustomGreeting(GREETING + ":" + name);
		return "SUCCESS";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCustomGreeting() {
		return CustomGreeting;
	}

	public void setCustomGreeting(String customGreeting) {
		CustomGreeting = customGreeting;
	}

	
	
	
}
