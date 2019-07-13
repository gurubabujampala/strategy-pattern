package com.strategy.pattern.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.strategy.pattern.order.service.OrderCreateService;
import com.strategy.pattern.order.util.EnumProductType;
import com.strategy.pattern.order.util.EnumSourceType;

import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderCreateService orderCreateService;
	
	@GetMapping("/create/productType/{productType}/sourceType/{sourceType}/input/{input}")
	public String createOrder(@PathVariable EnumProductType productType, @PathVariable EnumSourceType sourceType, @PathVariable String input) {
		log.info("Product Type :: "+productType+ "Source Type :: "+sourceType+" Input :: "+input);
		return orderCreateService.createOrder(productType, sourceType, input);
	}
}
