package com.strategy.pattern.order.source.nbn.service;

import org.springframework.stereotype.Service;

import com.strategy.pattern.order.source.service.SourceType;

@Service
public class NbnSiebelSourceTypeService implements SourceType {

	@Override
	public String createOrder(String input) {
		
		return "NBN Siebel Order Creation Method!!!!! ---> "+input;
	}

}
