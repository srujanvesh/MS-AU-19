package Project1.Externalconfig;



/**
 * Hello world!
 *
 */
public class App 
{

public App()
{
	System.out.println("Hello");
}
	
	private String name;
	

	private int rno;
	private int age;
	
	 
	public String getName() {
		return name;
	}
	 
	public void setName(String name) {
		this.name = name;
	}
	 
	public int getRno() {
		return rno;
	}
	 
	public void setRno(int rno) {
		this.rno = rno;
	}
	 
	public int getAge() {
		return age;
	}
	 
	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "App [name=" + name + ", rno=" + rno + ", age=" + age + "]";
	}
}
