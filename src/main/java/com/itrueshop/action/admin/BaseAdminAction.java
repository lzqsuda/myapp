package com.itrueshop.action.admin;

import com.itrueshop.action.BaseAction;
import com.itrueshop.bean.Pager;
import com.itrueshop.bean.SystemConfig;
import com.itrueshop.util.SystemConfigUtil;

/**
 * 后台Action类 - 管理中心基类
 * 
 */
public class BaseAdminAction extends BaseAction {

	private static final long serialVersionUID = 6718838822334455667L;

		
	protected String id;
	protected String[] ids;
	protected Pager pager;
	protected String logInfo;// 日志记录信息
	protected String redirectionUrl;// 操作提示后的跳转URL,为null则返回前一页
	
	public String input() {
		return null;
	}

	// 获取系统配置信息
	public SystemConfig getSystemConfig() {
		return SystemConfigUtil.getSystemConfig();
	}
	
	// 获取商品价格货币格式
	public String getPriceCurrencyFormat() {
		return SystemConfigUtil.getPriceCurrencyFormat();
	}
	
	// 获取商品价格货币格式（包含货币单元）
	public String getPriceUnitCurrencyFormat() {
		return SystemConfigUtil.getPriceUnitCurrencyFormat();
	}
	
	// 获取订单货币格式
	public String getOrderCurrencyFormat() {
		return SystemConfigUtil.getOrderCurrencyFormat();
	}
	
	// 获取订单货币格式（包含货币单位）
	public String getOrderUnitCurrencyFormat() {
		return SystemConfigUtil.getOrderUnitCurrencyFormat();
	}

	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String[] getIds() {
		return ids;
	}

	public void setIds(String[] ids) {
		this.ids = ids;
	}

	public Pager getPager() {
		return pager;
	}

	public void setPager(Pager pager) {
		this.pager = pager;
	}

	public String getLogInfo() {
		return logInfo;
	}

	public void setLogInfo(String logInfo) {
		this.logInfo = logInfo;
	}

	public String getRedirectionUrl() {
		return redirectionUrl;
	}

	public void setRedirectionUrl(String redirectionUrl) {
		this.redirectionUrl = redirectionUrl;
	}

}