package com.itrueshop.dao.impl;

import java.util.List;


import org.springframework.stereotype.Repository;

import com.itrueshop.dao.LogConfigDao;
import com.itrueshop.entity.LogConfig;


/**
 * Dao实现类 - 日志设置
 */

@Repository
public class LogConfigDaoImpl extends BaseDaoImpl<LogConfig, String> implements LogConfigDao {

	@SuppressWarnings("unchecked")
	public List<LogConfig> getLogConfigList(String actionClassName) {
		String hql = "from LogConfig as logConfig where logConfig.actionClassName = ?";
		return getSession().createQuery(hql).setParameter(0, actionClassName).list();
	}

}
