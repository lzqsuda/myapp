package com.itrueshop.dao.impl;


import org.springframework.stereotype.Repository;

import com.itrueshop.dao.OrderLogDao;
import com.itrueshop.entity.OrderLog;


/**
 * Dao实现类 - 订单日志
 */

@Repository
public class OrderLogDaoImpl extends BaseDaoImpl<OrderLog, String> implements OrderLogDao {
	
}