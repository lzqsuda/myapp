package com.itrueshop.dao;

import java.util.List;


import com.itrueshop.entity.LogConfig;
import com.itrueshop.service.BaseService;



/**
 * Service接口 - 日志设置
 * 
 */

public interface LogConfigService extends BaseService<LogConfig, String> {

	/**
	 * 根据Action类名称获取LogConfig对象集合.
	 * 
	 * @param actionClassName
	 *            Action类名称
	 * @return LogConfig对象集合
	 */
	public List<LogConfig> getLogConfigList(String actionClassName);

}