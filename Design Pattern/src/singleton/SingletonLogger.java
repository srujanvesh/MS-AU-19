package singleton;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class SingletonLogger {

private static SingletonLogger log = null;
	

	private PrintWriter writer;
	
	private SingletonLogger() {
		try {
			FileWriter fw = new FileWriter("C:\\Users\\kotha.srujanvesh\\Desktop\\log.txt");
		    writer = new PrintWriter(fw, true);
		} catch (IOException e) {}
	}
	
	public static synchronized SingletonLogger getInstance(){
		if(log == null)
			log = new SingletonLogger();
		return log;
	}
	
	public void logging() {

		   writer.println(new Date().toString());

		}
	
}
