package com.itrueshop.dao;

import com.itrueshop.entity.Agreement;


/**
 * Dao接口 - 会员注册协议
 * 
 */
public interface AgreementDao extends BaseDao<Agreement, String> {

	/**
	 * 获取Agreement对象
	 * 
	 * @return Agreement对象
	 * 
	 */
	public Agreement getAgreement();

}
