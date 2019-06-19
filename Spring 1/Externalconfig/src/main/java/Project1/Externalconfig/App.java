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
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the rno
	 */
	public int getRno() {
		return rno;
	}
	/**
	 * @param rno the rno to set
	 */
	public void setRno(int rno) {
		this.rno = rno;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "App [name=" + name + ", rno=" + rno + ", age=" + age + "]";
	}
}
