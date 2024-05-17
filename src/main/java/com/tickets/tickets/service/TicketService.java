package com.tickets.tickets.service;

import com.tickets.tickets.model.Ticket;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TicketService {
    private final List<Ticket> tickets = new ArrayList<>();
    public List<Ticket> getAllTickets(){
        return tickets;
    }
    public Ticket addTicket(Ticket addedTicket){
        tickets.add(addedTicket);
        return addedTicket;
    }
}
