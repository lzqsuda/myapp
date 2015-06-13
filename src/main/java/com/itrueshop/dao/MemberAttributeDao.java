package com.itrueshop.dao;

import java.util.List;

import com.itrueshop.entity.MemberAttribute;




/**
 * Dao接口 - 会员属性
 * 
 */

public interface MemberAttributeDao extends BaseDao<MemberAttribute, String> {

	/**
	 * 获取已启用的会员注册项.
	 * 
	 * @return 已启用的会员注册项集合.
	 */
	public List<MemberAttribute> getEnabledMemberAttributeList();

}
