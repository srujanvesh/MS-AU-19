package Project1.Annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class App2 {

	
	@Override
	public String toString() {
		return "App2 [name=" + name + ", rno=" + rno + "]";
	}
	private String name;
	private int rno;
	
	 
	public String getName() {
		return name;
	}
	 
	@Autowired
	@Qualifier("n")
	public void setName(String name) {
		this.name = name;
	}
	 
	
	public int getRno() {
		return rno;
	}
	 
	@Required
	public void setRno(int rno) {
		this.rno = rno;
	}
	
	
	
	
	
	
}
