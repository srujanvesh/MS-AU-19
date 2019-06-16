
public class GenericClass<T> implements Comparable<GenericClass> {
	T object;
	String personname;
	public String getName() {
		return personname;
	}
	public void setName(String personname) {
		this.personname = personname;
	}
	public T getObject() {
		return object;
	}
	public void setObject(T object) {
		this.object = object;
	}
	public int compareTo(GenericClass  gc) {
		return this.personname.compareTo(gc.personname);
	}
	public boolean equals(Object obj) {
		if(obj instanceof GenericClass)  {
			GenericClass ob = (GenericClass)obj;
			if(this.personname.equals(ob.personname)) {
				return this.object.equals(ob.object);
			} else return false;
			
		} else {
			return false;
		}
	} 

//With String Object(T)
	public static void main(String[] args)
	{
		GenericClass<String> gc1=new GenericClass<>();
		gc1.setName("Srujan");
		gc1.setObject("Accolite");
		GenericClass<String> gc2=new GenericClass<>();
		gc2.setName("Srujan");
		gc2.setObject("Accolite");
		//Using Equals 
		System.out.println("objects are equal:"+ gc1.equals(gc2));
		
		//With Integer Object(T)
		GenericClass<Integer> gc3=new GenericClass<>();
		gc3.setName("srujan");
		gc3.setObject(100);
		GenericClass<Integer> gc4=new GenericClass<>();
		gc4.setName("srujan");
		gc4.setObject(100);
		//Using Equals 
		System.out.println("objects are equal"+ gc3.equals(gc4));
	}
}