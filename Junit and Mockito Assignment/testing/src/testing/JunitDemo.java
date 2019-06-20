package testing;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class JunitDemo {
	
	
	Class1 a;

	Person personobj;
	
	
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}

	@Before
	public void before() {
		System.out.println("Before Test Case");
		personobj=mock(Person.class);
		
	}
	
	@Test
	public void test_method2()
	{
		a=new Class1();
    	assertEquals("srujankotha",a.appending("srujan","kotha"));
    	
	}

	 @Test
	    public void test_method() {
	        
	    	a=new Class1();    	
	    	
	    	when(personobj.check(personobj)).thenReturn(20);
	    	boolean ans=a.hasrighttovote(personobj);
	    	assertEquals(true, ans);
	    	
	    	
	    }

	@After
	public void after() {
		System.out.println("After Test Case");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
}
