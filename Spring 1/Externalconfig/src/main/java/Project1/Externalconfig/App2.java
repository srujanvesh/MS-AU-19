package Project1.Externalconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App2 {

	
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    	ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/main/resources/beans.xml");
		App a=(App)context.getBean("information");
		
        System.out.println(a);
    }
}
