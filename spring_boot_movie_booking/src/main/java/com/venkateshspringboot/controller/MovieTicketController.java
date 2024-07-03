package com.venkateshspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.venkateshspringboot.dto.MovieTicketAcknowledgement;
import com.venkateshspringboot.dto.MovieTicketRequest;
import com.venkateshspringboot.service.MovieTicketService;

@RestController
public class MovieTicketController {
	@Autowired
	MovieTicketService movieTicketService;
	@PostMapping("/bookingticket")
	public MovieTicketAcknowledgement bookMovieTicket(@RequestBody MovieTicketRequest movieticketrequest) {
		return movieTicketService.bookMovieTicket(movieticketrequest);
	}
	
}
