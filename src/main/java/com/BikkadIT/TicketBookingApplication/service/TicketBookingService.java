package com.BikkadIT.TicketBookingApplication.service;

import org.springframework.stereotype.Service;

import com.BikkadIT.TicketBookingApplication.model.Passanger;
import com.BikkadIT.TicketBookingApplication.model.Ticket;

@Service
public class TicketBookingService  implements TicketBookingServiceI{

	
	public Ticket bookTicket(Passanger psg) {
		
		if(psg==null) {
			return null;
		}else {
			Ticket ticket=new Ticket();
			ticket.setPnr(111);
			ticket.setTicketStatus("Confirmed");
			ticket.setTicketPrice(123.00);
			return ticket;
		}
		
		
	}

}