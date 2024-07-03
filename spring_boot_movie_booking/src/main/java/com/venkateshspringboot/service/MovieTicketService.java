package com.venkateshspringboot.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.venkateshspringboot.dto.MovieTicketAcknowledgement;
import com.venkateshspringboot.dto.MovieTicketRequest;
import com.venkateshspringboot.entity.PaymentInfo;
import com.venkateshspringboot.entity.TicketInfo;
import com.venkateshspringboot.repository.PaymentInfoRepo;
import com.venkateshspringboot.repository.TicketInfoRepo;
import com.venkateshspringboot.utility.ValidatePaymentInfo;

@Service // it is useful to recognize by the springboot
public class MovieTicketService {
	@Autowired
	PaymentInfoRepo paymentInfoRepo;
	@Autowired
	TicketInfoRepo ticketInfoRepo;

	public MovieTicketAcknowledgement bookMovieTicket(MovieTicketRequest request) {

		TicketInfo ticketinfo = request.getTicketInfo();
		ticketInfoRepo.save(ticketinfo);

		PaymentInfo paymentInfo = request.getPaymentInfo();

		ValidatePaymentInfo.validateCreditLimit(paymentInfo.getAccountNo(), ticketinfo.getTicketPrize());

		paymentInfo.setAmount(ticketinfo.getTicketPrize());
		paymentInfo.setTicketId(ticketinfo.getId());
		
		paymentInfoRepo.save(paymentInfo);
		
		return new MovieTicketAcknowledgement("Success",ticketinfo.getTicketPrize(),UUID.randomUUID().toString().split("-")[0], ticketinfo);
	}

}
