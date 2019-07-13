package com.strategy.pattern.order.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.strategy.pattern.order.product.service.ProductType;
import com.strategy.pattern.order.util.EnumProductType;
import com.strategy.pattern.order.util.EnumSourceType;

@Service
public class OrderCreateServiceImpl implements OrderCreateService {

	@Autowired
	public Map<EnumProductType, ProductType> productTypeMap;

	@Override
	public String createOrder(EnumProductType productType, EnumSourceType sourceType, String input) {
		return productTypeMap.get(productType).sourceType(sourceType).createOrder(input);
	}

}
