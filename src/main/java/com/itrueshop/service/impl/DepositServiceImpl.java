package com.itrueshop.service.impl;

import javax.annotation.Resource;


import org.springframework.stereotype.Service;

import com.itrueshop.bean.Pager;
import com.itrueshop.dao.DepositDao;
import com.itrueshop.entity.Deposit;
import com.itrueshop.entity.Member;
import com.itrueshop.service.DepositService;


/**
 * Service实现类 - 预存款记录
 *
 */

@Service
public class DepositServiceImpl extends BaseServiceImpl<Deposit, String> implements DepositService {

	@Resource
	private DepositDao depositDao;
	
	@Resource
	public void setBaseDao(DepositDao depositDao) {
		super.setBaseDao(depositDao);
	}
	
	public Pager getDepositPager(Member member, Pager pager) {
		return depositDao.getDepositPager(member, pager);
	}

}