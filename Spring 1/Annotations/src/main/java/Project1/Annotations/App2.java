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
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	
	@Autowired
	@Qualifier("n")
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
	@Required
	public void setRno(int rno) {
		this.rno = rno;
	}
	/**
	 * @return the age
	 */
	
	/**
	 * @param age the age to set
	 */
	
	
	
	
	
}
