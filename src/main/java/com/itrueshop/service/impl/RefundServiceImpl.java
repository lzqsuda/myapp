package com.itrueshop.service.impl;

import javax.annotation.Resource;


import org.springframework.stereotype.Service;

import com.itrueshop.dao.RefundDao;
import com.itrueshop.entity.Refund;
import com.itrueshop.service.RefundService;
import com.itrueshop.util.SerialNumberUtil;


/**
 * Service实现类 - 退款
 * 
 */

@Service
public class RefundServiceImpl extends BaseServiceImpl<Refund, String> implements RefundService {
	
	@Resource
	private RefundDao refundDao;

	@Resource
	public void setBaseDao(RefundDao refundDao) {
		super.setBaseDao(refundDao);
	}
	
	public String getLastRefundSn() {
		return refundDao.getLastRefundSn();
	}
	
	public Refund getRefundByRefundSn(String refundSn) {
		return refundDao.getRefundByRefundSn(refundSn);
	}

	// 重写对象，保存时自动设置退款编号
	@Override
	public String save(Refund refund) {
		refund.setRefundSn(SerialNumberUtil.buildRefundSn());
		return super.save(refund);
	}

}