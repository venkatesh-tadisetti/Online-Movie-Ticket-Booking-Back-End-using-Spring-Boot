package com.venkateshspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.venkateshspringboot.entity.PaymentInfo;

public interface PaymentInfoRepo extends JpaRepository<PaymentInfo, String> {
  
}
