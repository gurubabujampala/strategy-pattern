package com.strategy.pattern.order.source.mobile.service;

import org.springframework.stereotype.Service;

import com.strategy.pattern.order.source.service.SourceType;

@Service
public class MobileSalesfourceSourceTypeService implements SourceType {

	@Override
	public String createOrder(String input) {
		return "Mobile Salesfource Order Creation Method!!!!!  ---> "+input;
	}

}
