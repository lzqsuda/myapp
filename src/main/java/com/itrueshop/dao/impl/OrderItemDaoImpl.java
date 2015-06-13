package com.itrueshop.dao.impl;


import org.springframework.stereotype.Repository;

import com.itrueshop.dao.OrderItemDao;
import com.itrueshop.entity.OrderItem;


/**
 * Dao实现类 - 订单项
 */

@Repository
public class OrderItemDaoImpl extends BaseDaoImpl<OrderItem, String> implements OrderItemDao {

}