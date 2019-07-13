package com.strategy.pattern.order.source.mobile.service;

import org.springframework.stereotype.Service;

import com.strategy.pattern.order.source.service.SourceType;

@Service
public class MobileSiebelSourceTypeService implements SourceType {

	@Override
	public String createOrder(String input) {
		return "Mobile Siebel Order Creation Method!!!!! ---> "+input;
	}

}
