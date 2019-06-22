package template;
import java.util.List;

public abstract class TicketBooking {

	public abstract void checkAvailableSeats(String source,String dest,List<Integer> list);
	public abstract int selectSeat(List<Integer> list);
	public abstract void makePayment();
	public abstract void  confirmTicket(int seat);
	public final void book(String source,String dest,List<Integer> list)
	{
		checkAvailableSeats(source,dest,list);
		int x=selectSeat(list);
		makePayment();
		confirmTicket(x);
	}
	
}



