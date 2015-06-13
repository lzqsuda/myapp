package com.itrueshop.service.impl;

import javax.annotation.Resource;


import org.springframework.stereotype.Service;

import com.itrueshop.dao.DeliveryItemDao;
import com.itrueshop.entity.DeliveryItem;
import com.itrueshop.service.DeliveryItemService;


/**
 * Service实现类 - 发货项
 * 
 */

@Service
public class DeliveryItemServiceImpl extends BaseServiceImpl<DeliveryItem, String> implements DeliveryItemService {

	@Resource
	public void setBaseDao(DeliveryItemDao deliveryItemDao) {
		super.setBaseDao(deliveryItemDao);
	}

}