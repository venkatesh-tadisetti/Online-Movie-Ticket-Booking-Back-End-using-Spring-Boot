package com.venkateshspringboot.dto;

import com.venkateshspringboot.entity.TicketInfo;

public class MovieTicketAcknowledgement {
	private String status;
	private double totalFare;
	private String prnNO;
	private TicketInfo ticketInfo;
	public MovieTicketAcknowledgement(String status, double totalFare, String prnNO, TicketInfo ticketInfo) {
		super();
		this.status = status;
		this.totalFare = totalFare;
		this.prnNO = prnNO;
		this.ticketInfo = ticketInfo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getTotalFare() {
		return totalFare;
	}
	public void setTotalFare(double totalFare) {
		this.totalFare = totalFare;
	}
	public String getPrnNO() {
		return prnNO;
	}
	public void setPrnNO(String prnNO) {
		this.prnNO = prnNO;
	}
	public TicketInfo getTicketInfo() {
		return ticketInfo;
	}
	public void setTicketInfo(TicketInfo ticketInfo) {
		this.ticketInfo = ticketInfo;
	}
	@Override
	public String toString() {
		return "MovieTicketAcknowledgement [status=" + status + ", totalFare=" + totalFare + ", prnNO=" + prnNO
				+ ", ticketInfo=" + ticketInfo + "]";
	}


}
