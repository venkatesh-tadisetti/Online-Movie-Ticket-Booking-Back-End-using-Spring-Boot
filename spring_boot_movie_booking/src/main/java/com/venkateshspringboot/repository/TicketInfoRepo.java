package com.venkateshspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.venkateshspringboot.entity.TicketInfo;

public interface TicketInfoRepo extends JpaRepository<TicketInfo,Long >{

}
