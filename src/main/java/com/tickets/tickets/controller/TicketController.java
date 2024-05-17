package com.tickets.tickets.controller;

import com.tickets.tickets.model.FlightDto;
import com.tickets.tickets.model.Ticket;
import com.tickets.tickets.service.FlightClient;
import com.tickets.tickets.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketController {
    @Autowired
    private TicketService ticketService;
    @Autowired
    private FlightClient flightClient;
    @GetMapping("")
    public List<Ticket> getAllTickets(){ return ticketService.getAllTickets();}
    @PostMapping("/add")
    public Ticket addTicket(@RequestBody Ticket ticket){
        System.out.println(ticket.toString());
        return ticketService.addTicket(ticket);
    }
    @GetMapping("/flights")
    public List<FlightDto> getAllFlights(){
        return flightClient.getAllFlights();
    }

}
