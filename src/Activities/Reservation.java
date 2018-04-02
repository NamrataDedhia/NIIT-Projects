package Activities;

public class Reservation {
	int TicketID;
	
	public void ShowTicket()
	{
		System.out.println("TicketID is " +TicketID);
	}
	Reservation()
	{
		TicketID=101;
	}
	
	public static void main(String[] args) {
		
		Reservation r =new Reservation();
		r.ShowTicket();

	}

}
