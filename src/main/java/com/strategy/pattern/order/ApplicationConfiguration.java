package com.strategy.pattern.order;

import java.util.EnumMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.strategy.pattern.order.product.service.CableTypeService;
import com.strategy.pattern.order.product.service.MobileTypeService;
import com.strategy.pattern.order.product.service.NbnTypeService;
import com.strategy.pattern.order.product.service.ProductType;
import com.strategy.pattern.order.util.EnumProductType;

@Configuration
public class ApplicationConfiguration {

	@Autowired MobileTypeService mobileType;
	@Autowired NbnTypeService nbnType;
	@Autowired CableTypeService cableType;

	
	@Bean(name = "productTypeMap")
	public Map<EnumProductType, ProductType> productTypeMap(){
		Map<EnumProductType, ProductType> typeMap = new EnumMap<>(EnumProductType.class);
		typeMap.put(EnumProductType.MOBILE, mobileType);
		typeMap.put(EnumProductType.NBN, nbnType);
		typeMap.put(EnumProductType.CABLE, cableType);
		return typeMap;
	}

}
