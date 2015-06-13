package com.itrueshop.service.impl;

import javax.annotation.Resource;


import org.springframework.stereotype.Service;

import com.itrueshop.dao.BrandDao;
import com.itrueshop.entity.Brand;
import com.itrueshop.service.BrandService;


/**
 * Service实现类 - 品牌
 * 
 */

@Service
public class BrandServiceImpl extends BaseServiceImpl<Brand, String> implements BrandService {

	@Resource
	public void setBaseDao(BrandDao brandDao) {
		super.setBaseDao(brandDao);
	}

}