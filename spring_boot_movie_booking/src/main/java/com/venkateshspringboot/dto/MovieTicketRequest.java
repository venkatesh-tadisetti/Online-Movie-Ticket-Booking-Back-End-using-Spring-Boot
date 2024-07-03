package com.venkateshspringboot.dto;

import com.venkateshspringboot.entity.PaymentInfo;
import com.venkateshspringboot.entity.TicketInfo;

public class MovieTicketRequest {
    PaymentInfo paymentInfo;
    TicketInfo TicketInfo;
	public PaymentInfo getPaymentInfo() {
		return paymentInfo;
	}
	public void setPaymentInfo(PaymentInfo paymentInfo) {
		this.paymentInfo = paymentInfo;
	}
	public TicketInfo getTicketInfo() {
		return TicketInfo;
	}
	public void setTicketInfo(TicketInfo ticketInfo) {
		TicketInfo = ticketInfo;
	}
	@Override
	public String toString() {
		return "MovieTicketRequest [paymentInfo=" + paymentInfo + ", TicketInfo=" + TicketInfo + "]";
	}
	
    
}
