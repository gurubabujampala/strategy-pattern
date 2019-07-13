package com.strategy.pattern.order.product.service;

import java.util.EnumMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.strategy.pattern.order.source.mobile.service.MobileMicaSourceTypeService;
import com.strategy.pattern.order.source.mobile.service.MobileSalesfourceSourceTypeService;
import com.strategy.pattern.order.source.mobile.service.MobileSiebelSourceTypeService;
import com.strategy.pattern.order.source.service.SourceType;
import com.strategy.pattern.order.util.EnumSourceType;

@Service
public class MobileTypeService implements ProductType {

	@Autowired MobileMicaSourceTypeService mobileMicaSourceTypeService;
	@Autowired MobileSalesfourceSourceTypeService mobileSalesfourceSourceTypeService;
	@Autowired MobileSiebelSourceTypeService mobileSiebelSourceTypeService;

	@Autowired
	public Map<EnumSourceType, SourceType> mobileSourceMap(){
		Map<EnumSourceType, SourceType> sourceMap = new EnumMap<>(EnumSourceType.class);
		sourceMap.put(EnumSourceType.MICA, mobileMicaSourceTypeService);
		sourceMap.put(EnumSourceType.SALESFORCE, mobileSalesfourceSourceTypeService);
		sourceMap.put(EnumSourceType.SIEBEL, mobileSiebelSourceTypeService);
		return sourceMap;
	}
	
	@Override
	public SourceType sourceType(EnumSourceType source) {
		return mobileSourceMap().get(source);
	}
}
