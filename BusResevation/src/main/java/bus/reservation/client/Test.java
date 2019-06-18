package bus.reservation.client;

import bus.reservation.sys.TicketBookingThread;
import bus.reservation.sys.TicketCounter;

public class Test {
public static void main(String[] args) {
	TicketCounter ticketcounter=new TicketCounter();
	TicketBookingThread t1=new TicketBookingThread(ticketcounter, "CristianoRonaldo", 2);
	TicketBookingThread t2=new TicketBookingThread(ticketcounter, "Messi",2);
	t1.start();
	t2.start();
}
}
