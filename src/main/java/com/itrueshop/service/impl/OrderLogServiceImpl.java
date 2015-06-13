package com.itrueshop.service.impl;

import javax.annotation.Resource;


import org.springframework.stereotype.Service;

import com.itrueshop.dao.OrderLogDao;
import com.itrueshop.entity.OrderLog;
import com.itrueshop.service.OrderLogService;


/**
 * Service实现类 - 订单日志
 *
 */

@Service
public class OrderLogServiceImpl extends BaseServiceImpl<OrderLog, String> implements OrderLogService {

	@Resource
	public void setBaseDao(OrderLogDao orderLogDao) {
		super.setBaseDao(orderLogDao);
	}

}