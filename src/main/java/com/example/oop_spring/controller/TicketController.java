package com.example.oop_spring.controller;

import com.example.oop_spring.repository.TicketRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.oop_spring.model.TicketStatus;

@Controller
public class TicketController {

    private final TicketRepository ticketRepository;

    public TicketController(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    @GetMapping("/tickets")
    public String tickets(Model model) {
        model.addAttribute("tickets",
                ticketRepository.findAllByOrderByCreatedAtDesc());
        return "tickets";
    }
    @GetMapping("/tickets/new")
    public String newTickets(Model model) {
        model.addAttribute("tickets",
                ticketRepository.findByStatus(TicketStatus.NEW));
        return "tickets";
    }

    @GetMapping("/tickets/customer")
    public String customerTickets(Model model) {
        model.addAttribute("tickets",
                ticketRepository.findByCustomerNameContainingIgnoreCase("Иван"));
        return "tickets";
    }
}
