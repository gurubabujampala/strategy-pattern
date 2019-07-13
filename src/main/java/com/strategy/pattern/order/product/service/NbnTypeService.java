package com.strategy.pattern.order.product.service;

import java.util.EnumMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.strategy.pattern.order.source.nbn.service.NbnMicaSourceTypeService;
import com.strategy.pattern.order.source.nbn.service.NbnSalesfourceSourceTypeService;
import com.strategy.pattern.order.source.nbn.service.NbnSiebelSourceTypeService;
import com.strategy.pattern.order.source.service.SourceType;
import com.strategy.pattern.order.util.EnumSourceType;

@Service
@Primary
public class NbnTypeService implements ProductType {
	
	@Autowired NbnMicaSourceTypeService nbnMicaSourceTypeService;
	@Autowired NbnSalesfourceSourceTypeService nbnSalesfourceSourceTypeService;
	@Autowired NbnSiebelSourceTypeService nbnSiebelSourceTypeService;
	
	@Autowired
	public Map<EnumSourceType, SourceType> nbnSourceMap(){
		Map<EnumSourceType, SourceType> sourceMap = new EnumMap<>(EnumSourceType.class);
		sourceMap.put(EnumSourceType.MICA, nbnMicaSourceTypeService);
		sourceMap.put(EnumSourceType.SALESFORCE, nbnSalesfourceSourceTypeService);
		sourceMap.put(EnumSourceType.SIEBEL, nbnSiebelSourceTypeService);
		return sourceMap;
	}
	
	@Override
	public SourceType sourceType(EnumSourceType source) {
		return nbnSourceMap().get(source);
	}
	
}
