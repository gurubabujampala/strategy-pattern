package com.strategy.pattern.order.source.mobile.service;

import org.springframework.stereotype.Service;

import com.strategy.pattern.order.source.service.SourceType;

@Service
public class MobileMicaSourceTypeService implements SourceType {

	@Override
	public String createOrder(String input) {
		return "Mobile MICA Order Creation Method!!!!!  ---> "+ input;
	}

}
