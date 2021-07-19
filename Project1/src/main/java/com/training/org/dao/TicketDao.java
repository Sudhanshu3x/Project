package com.training.org.dao;

import org.springframework.data.repository.CrudRepository;

import com.training.org.model.Ticket;


public interface TicketDao extends CrudRepository<Ticket, Integer> {

	
}
