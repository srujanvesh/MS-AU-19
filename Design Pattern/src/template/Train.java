package template;
import java.util.List;

public class Train extends TicketBooking {

	public int name;
	int totalseats;
	
	public void checkAvailableSeats(String source,String dest,List<Integer> list)
	{
		
			if(list.size()<=totalseats)
			{
				System.out.println("seats are available in the train");
			}
	}
	public int selectSeat(List<Integer> list) {
		
		
		System.out.println(list.size()+1+"  "+"seat is avaialble in the train");
		return list.size();
		
		
	}
	public void makePayment() {
		
		System.out.println("payment is completed");
		
	}
	public void confirmTicket(int seat) {
		System.out.println("ticket confirmed for the train");
		
		
	}
	
}
