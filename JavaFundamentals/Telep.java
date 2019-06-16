import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Telep {

	public static void main(String[] args) {
		
		User user=new User("srujan","Hyderabad","123456");
		MobileNumber mobileNumber=new MobileNumber(user,"Airtel",true,"9133422449");
		MobileNumber contact1=new MobileNumber(user,"Jio",true,"6304682023");
		MobileNumber contact2=new MobileNumber(user,"Jio",true,"4696426803");
		Phone phone=new Phone(mobileNumber,"Iphone");
		phone.makeCall(contact1);
		phone.makeCall(contact2);
		phone.liftCall(contact2);
		System.out.println("recieved calls");
		phone.recievedCalls();
		System.out.println("dialled calls");
		phone.dialledCalls();
		
	}
}

interface Telephone
{
	public void liftCall(MobileNumber mobileNumber);
	public void makeCall(MobileNumber mobileNumber);

	public void recievedCalls();

	public void dialledCalls();
}

class Phone implements Telephone
{
	

	MobileNumber mobileNumber;
	String phoneModel;
	Map<MobileNumber,List<callDetails>> dialledCalls;
	Map<MobileNumber,List<callDetails>> recievedCalls;
	
	public Phone(MobileNumber mobileNumber,String phoneModel) 
	{
		this.mobileNumber=mobileNumber;
		this.phoneModel=phoneModel;
		this.dialledCalls=new HashMap<MobileNumber,List<callDetails>>();
		this.recievedCalls=new HashMap<MobileNumber,List<callDetails>>();
	}
	
	public void liftCall(MobileNumber mobileNumber)
	{
		
		System.out.println("recieved a call from "+mobileNumber.mobileNumber);
		Date startTime=new Date();
		try {
		Thread.sleep(2000);
		}
		catch(InterruptedException ie) {
			System.out.println(ie.getMessage());
		}
		Date endTime=new Date();
		callDetails callDetails=new callDetails(mobileNumber,startTime,endTime);
		System.out.println("call ended");
		if(recievedCalls.containsKey(mobileNumber))
		{
			recievedCalls.get(mobileNumber).add(callDetails);
					
		}
		else {
			List <callDetails> calldet=new ArrayList<>();
			calldet.add(callDetails);
			recievedCalls.put(mobileNumber,calldet);
			
		}
		
		
	}
	
	public void makeCall(MobileNumber mobileNumber)
	{
		System.out.println("dialled a call to "+mobileNumber.mobileNumber);
		Date startTime=new Date();
		try {
		Thread.sleep(2000);
		}
		catch(InterruptedException ie) {
			System.out.println(ie.getMessage());
		}
		Date endTime=new Date();
		callDetails callDetails=new callDetails(mobileNumber,startTime,endTime);
		System.out.println("call ended");
		if(dialledCalls.containsKey(mobileNumber))
		{
			dialledCalls.get(mobileNumber).add(callDetails);
					
		}
		else {
			List <callDetails> calldet=new ArrayList<>();
			calldet.add(callDetails);
			dialledCalls.put(mobileNumber,calldet);
			
		}
	}
	
	public void recievedCalls()
	{
		int i=1;
		for(Map.Entry<MobileNumber, List<callDetails>> entry: this.recievedCalls.entrySet()) {
			List <callDetails>recievedhist=new ArrayList<>();
			recievedhist= entry.getValue();
			
			for(callDetails lis:recievedhist)
			{
				System.out.println(i+")"+lis.mobileNumber.user.name+" , "+lis.mobileNumber.user.address+" , "
			+lis.mobileNumber.mobileNumber+" , start time"+ lis.startTime+" ,end time"+lis.endTime);
			}
			i++;
		}
		
	}
	
	
	
	public void dialledCalls()
	{
		int i=1;
		for(Map.Entry<MobileNumber, List<callDetails>> entry: this.dialledCalls.entrySet()) {
			List <callDetails>dialledhist=new ArrayList<>();
			dialledhist= entry.getValue();
			
			for(callDetails lis:dialledhist)
			{
				System.out.println(i+")"+lis.mobileNumber.user.name+" , "+lis.mobileNumber.user.address+" , "
						+lis.mobileNumber.mobileNumber+" , start time"+ lis.startTime+" ,end time"+lis.endTime);
			}
			i++;
		}
		
	}
	
}

class User
{
	String name;
	String address;
	String aadharNo;
	public User(String name,String address,String aadharNo)
	{
		this.name=name;
		this.address=address;
		this.aadharNo=aadharNo;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", address=" + address + ", aadharNo=" + aadharNo + "]";
	}
}
class MobileNumber
{
	User user;
	String networkOperator;
	boolean isActive;
	String mobileNumber;
	public MobileNumber(User user,String networkOperator,boolean isActive, String mobileNumber)
	{
		this.user = user;
		this.networkOperator=networkOperator;
		this.isActive=isActive;
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "MobileNumber [user=" + user + ", networkOperator=" + networkOperator + ", isActive=" + isActive
				+ ", mobileNumber=" + mobileNumber + "]";
	}
	
}
class callDetails
{
	MobileNumber mobileNumber;
	Date startTime;
	Date endTime;
	public callDetails(MobileNumber mobileNumber,Date startTime,Date endTime)
	{
		this.mobileNumber = mobileNumber;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	@Override
	public String toString() {
		return "callDetails [mobileNumber=" + mobileNumber + ", startTime=" + startTime + ", endTime=" + endTime + "]";
	}
	
}









