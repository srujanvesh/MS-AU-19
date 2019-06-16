
public class MyGenericClass<T> implements Comparable<MyGenericClass> {
	int id;
	T obj;
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public T getObj() {
		return obj;
	}
	public void setObj(T obj) {
		this.obj = obj;
	}
	public int compareTo(MyGenericClass  mg) {
		return this.name.compareTo(mg.name);
	}
	public boolean equals(Object o) {
		if(o instanceof MyGenericClass)  {
			MyGenericClass ob = (MyGenericClass)o;
			if(this.id==ob.id && this.name.equals(ob.name)) {
				return this.obj.equals(ob.obj);
			} else return false;
			
		} else {
			return false;
		}
	} 

//With String Object(T)
	public static void main(String[] args)
	{
		MyGenericClass<String> mg1=new MyGenericClass<>();
		mg1.setId(1);
		mg1.setName("Name");
		mg1.setObj("NewObject");
		MyGenericClass<String> mg2=new MyGenericClass<>();
		mg2.setId(1);
		mg2.setName("Name");
		mg2.setObj("NewObject");
		//Using Equals 
		System.out.println("mg1==mg2 " + mg1.equals(mg2));
		
		//With Integer Object(T)
		MyGenericClass<Integer> mg3=new MyGenericClass<>();
		mg3.setId(1);
		mg3.setName("Name");
		mg3.setObj(101);
		MyGenericClass<Integer> mg4=new MyGenericClass<>();
		mg4.setId(1);
		mg4.setName("Name");
		mg4.setObj(101);
		//Using Equals 
		System.out.println("mg3==mg4 " + mg3.equals(mg4));
	}
}