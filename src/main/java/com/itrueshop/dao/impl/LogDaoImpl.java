package com.itrueshop.dao.impl;


import org.springframework.stereotype.Repository;

import com.itrueshop.dao.LogDao;
import com.itrueshop.entity.Log;


/**
 * Dao实现类 - 日志
 * 
 */

@Repository
public class LogDaoImpl extends BaseDaoImpl<Log, String> implements LogDao {

}
