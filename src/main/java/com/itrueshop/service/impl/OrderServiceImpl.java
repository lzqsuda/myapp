package com.itrueshop.service.impl;

import javax.annotation.Resource;


import org.springframework.stereotype.Service;

import com.itrueshop.bean.Pager;
import com.itrueshop.dao.OrderDao;
import com.itrueshop.entity.Member;
import com.itrueshop.entity.Order;
import com.itrueshop.service.OrderService;
import com.itrueshop.util.SerialNumberUtil;


/**
 * Service实现类 - 订单
 * 
 */

@Service
public class OrderServiceImpl extends BaseServiceImpl<Order, String> implements OrderService {
	
	@Resource
	private OrderDao orderDao;

	@Resource
	public void setBaseDao(OrderDao orderDao) {
		super.setBaseDao(orderDao);
	}
	
	public String getLastOrderSn() {
		return orderDao.getLastOrderSn();
	}
	
	public Pager getOrderPager(Member member, Pager pager) {
		return orderDao.getOrderPager(member, pager);
	}
	
	public Long getUnprocessedOrderCount() {
		return orderDao.getUnprocessedOrderCount();
	}
	
	public Long getPaidUnshippedOrderCount() {
		return orderDao.getPaidUnshippedOrderCount();
	}

	// 重写对象，保存时自动设置订单编号
	@Override
	public String save(Order order) {
		order.setOrderSn(SerialNumberUtil.buildOrderSn());
		return super.save(order);
	}

}