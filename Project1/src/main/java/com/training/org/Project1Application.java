package com.training.org;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.training.org.dao.TicketDao;
import com.training.org.model.Ticket;

@SpringBootApplication
public class Project1Application implements CommandLineRunner{
	@Autowired
	private TicketDao dao;
	public static void main(String[] args) {
		
		SpringApplication.run(Project1Application.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		dao.save(new Ticket(1, 286, "Gorakhpur", "New Delhi", "AC III"));
		
	}

}
