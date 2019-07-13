package com.strategy.pattern.order.service;

import com.strategy.pattern.order.util.EnumProductType;
import com.strategy.pattern.order.util.EnumSourceType;

public interface OrderCreateService {
	String createOrder(EnumProductType productType, EnumSourceType sourceType, String input);
}
