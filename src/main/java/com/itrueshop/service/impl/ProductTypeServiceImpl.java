package com.itrueshop.service.impl;

import javax.annotation.Resource;


import org.springframework.stereotype.Service;

import com.itrueshop.dao.ProductTypeDao;
import com.itrueshop.entity.ProductType;
import com.itrueshop.service.ProductTypeService;


/**
 * Service实现类 - 商品类型
 *
 */

@Service
public class ProductTypeServiceImpl extends BaseServiceImpl<ProductType, String> implements
		ProductTypeService {

	@Resource
	public void setBaseDao(ProductTypeDao productTypeDao) {
		super.setBaseDao(productTypeDao);
	}

}
