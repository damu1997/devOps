package bus.reservation.sys;

public class TicketBookingThread extends  Thread {
private TicketCounter ticketcounter;
private String passangerName;
private int NoOfSeats;
public TicketBookingThread( TicketCounter ticketcounter,String passangerName, int NoOfSeats) {
	this.NoOfSeats=NoOfSeats;
	this.passangerName=passangerName;
	this.ticketcounter=ticketcounter;
}

public  void run() {
	
	ticketcounter.bookTickets(passangerName,NoOfSeats);
}
	
}


