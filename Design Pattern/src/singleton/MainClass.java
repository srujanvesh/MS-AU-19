package singleton;

public class MainClass {

	public static void main(String[] args) {
	
		
		SingletonLogger log1=SingletonLogger.getInstance();
		log1.getInstance();
		log1.logging();
	}

}
