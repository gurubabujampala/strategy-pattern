package com.strategy.pattern.order.product.service;

import com.strategy.pattern.order.source.service.SourceType;
import com.strategy.pattern.order.util.EnumSourceType;

public interface ProductType {
	SourceType sourceType(EnumSourceType source);
}