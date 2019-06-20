package testing;

public class Person {

	public String name;
	public int age;
	public void details(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	
	public int check(Person person)
	{
		
		return person.age;
//		if(person.age>=18)
//		{
//			return true;
//		}
//		else
//		{
//			return false;
//		}
	}
	
	
	
	 
}
