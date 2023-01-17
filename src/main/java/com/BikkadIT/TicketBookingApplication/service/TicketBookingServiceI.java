package com.BikkadIT.TicketBookingApplication.service;

import org.springframework.stereotype.Service;

import com.BikkadIT.TicketBookingApplication.model.Passanger;
import com.BikkadIT.TicketBookingApplication.model.Ticket;


public interface TicketBookingServiceI {

	

	public Ticket bookTicket(Passanger psg);
}
