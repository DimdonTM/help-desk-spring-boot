package com.example.oop_spring.repository;

import com.example.oop_spring.model.Ticket;
import com.example.oop_spring.model.TicketStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket, Long> {

    List<Ticket> findAllByOrderByCreatedAtDesc();

    List<Ticket> findByStatus(TicketStatus status);

    List<Ticket> findByCustomerNameContainingIgnoreCase(String customerName);
}
