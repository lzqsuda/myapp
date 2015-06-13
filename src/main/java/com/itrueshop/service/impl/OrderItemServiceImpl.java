package com.itrueshop.service.impl;

import javax.annotation.Resource;


import org.springframework.stereotype.Service;

import com.itrueshop.dao.OrderItemDao;
import com.itrueshop.entity.OrderItem;
import com.itrueshop.service.OrderItemService;


/**
 * Service实现类 - 订单项
 * 
 */

@Service
public class OrderItemServiceImpl extends BaseServiceImpl<OrderItem, String> implements OrderItemService {

	@Resource
	public void setBaseDao(OrderItemDao orderItemDao) {
		super.setBaseDao(orderItemDao);
	}

}