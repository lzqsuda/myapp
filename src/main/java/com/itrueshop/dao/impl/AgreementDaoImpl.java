package com.itrueshop.dao.impl;


import org.springframework.stereotype.Repository;

import com.itrueshop.dao.AgreementDao;
import com.itrueshop.entity.Agreement;


/**
 * Dao实现类 - 会员注册协议
 */

@Repository
public class AgreementDaoImpl extends BaseDaoImpl<Agreement, String> implements AgreementDao {

	public Agreement getAgreement() {
		return load(Agreement.AGREEMENT_ID);
	}

}