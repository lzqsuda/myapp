package com.itrueshop.service.impl;

import javax.annotation.Resource;


import org.springframework.stereotype.Service;

import com.itrueshop.dao.DeliveryCorpDao;
import com.itrueshop.entity.DeliveryCorp;
import com.itrueshop.service.DeliveryCorpService;


/**
 * Service实现类 - 物流公司
 * 
 */

@Service
public class DeliveryCorpServiceImpl extends BaseServiceImpl<DeliveryCorp, String> implements DeliveryCorpService {

	@Resource
	public void setBaseDao(DeliveryCorpDao deliveryCorpDao) {
		super.setBaseDao(deliveryCorpDao);
	}

}
