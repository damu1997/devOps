package bus.reservation.sys;

public class TicketCounter {
private int availableSeats=3;//only 3 tickets are available 
public  synchronized void bookTickets(String pname,int numberOfSeats) {
	if((availableSeats>=numberOfSeats)&&(numberOfSeats>0)) {
		System.out.println("Hi, "+pname+"  " +numberOfSeats+ "  tickets "+ "booked succesfully");
		availableSeats=availableSeats-numberOfSeats;
				
				
	}
	else {
		System.out.println("Hi, "+pname+ "  tickets   not avaliable!!");
	}
}
}
