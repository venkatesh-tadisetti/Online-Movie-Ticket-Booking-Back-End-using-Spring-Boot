package com.venkateshspringboot.utility;

import java.util.*;

import com.venkateshspringboot.exception.InsufficientBalanceError;

public class ValidatePaymentInfo {
	private static Map<String,Double> paymentInfo =new HashMap<>();
	static {
		paymentInfo.put("acc1", 1000.0);
		paymentInfo.put("acc2", 500.0);
		paymentInfo.put("acc3", 2000.0);
	}
	public static Boolean validateCreditLimit(String accNo,double paidAmount) {
		if(paidAmount > paymentInfo.get(accNo)) {
			throw new InsufficientBalanceError("Insufficient Balance");
		}else {
			return true;
		}
	}
}
