package template;
import java.util.ArrayList;
import java.util.List;

public class mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> availableseats=new ArrayList<Integer>();
		TicketBooking bus = new Bus();
		
	      bus.book("mumbai","bangalore",availableseats);	
	      TicketBooking train=new Train();
		  train.book("kerala","hyderabad",availableseats);
		
	}

}
