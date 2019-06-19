package Project1.Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/main/resources/beans.xml");
		App2 a=(App2)context.getBean("a");
		App2 b=(App2)context.getBean("b");
        System.out.println(a);
        System.out.println(b);
    }
}
