package com.itrueshop.service.impl;

import javax.annotation.Resource;


import org.springframework.stereotype.Service;

import com.itrueshop.dao.CartItemDao;
import com.itrueshop.entity.CartItem;
import com.itrueshop.service.CartItemService;


/**
 * Service实现类 - 品牌
 * 
 */

@Service
public class CartItemServiceImpl extends BaseServiceImpl<CartItem, String> implements CartItemService {

	@Resource
	public void setBaseDao(CartItemDao cartItemDao) {
		super.setBaseDao(cartItemDao);
	}

}