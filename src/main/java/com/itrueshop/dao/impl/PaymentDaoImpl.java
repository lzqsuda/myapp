package com.itrueshop.dao.impl;

import java.util.List;


import org.springframework.stereotype.Repository;

import com.itrueshop.dao.PaymentDao;
import com.itrueshop.entity.Payment;


/**
 * Dao实现类 - 支付
 */

@Repository
public class PaymentDaoImpl extends BaseDaoImpl<Payment, String> implements PaymentDao {
	
	@SuppressWarnings("unchecked")
	public String getLastPaymentSn() {
		String hql = "from Payment as payment order by payment.createDate desc";
		List<Payment> paymentList =  getSession().createQuery(hql).setFirstResult(0).setMaxResults(1).list();
		if (paymentList != null && paymentList.size() > 0) {
			return paymentList.get(0).getPaymentSn();
		} else {
			return null;
		}
	}
	
	public Payment getPaymentByPaymentSn(String paymentSn) {
		String hql = "from Payment as payment where payment.paymentSn = ?";
		return (Payment) getSession().createQuery(hql).setParameter(0, paymentSn).uniqueResult();
	}

}