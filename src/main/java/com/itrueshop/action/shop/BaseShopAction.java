package com.itrueshop.action.shop;



import java.util.List;
import javax.annotation.Resource;
import org.apache.commons.lang.StringUtils;

import com.itrueshop.action.BaseAction;
import com.itrueshop.bean.Pager;
import com.itrueshop.bean.SystemConfig;
import com.itrueshop.entity.Footer;
import com.itrueshop.entity.FriendLink;
import com.itrueshop.entity.Member;
import com.itrueshop.entity.Navigation;
import com.itrueshop.service.FooterService;
import com.itrueshop.service.FriendLinkService;
import com.itrueshop.service.MemberService;
import com.itrueshop.service.NavigationService;
import com.itrueshop.util.SystemConfigUtil;


/**
 * 前台Action类 - 前台基类
 * 
 */

public class BaseShopAction extends BaseAction {

	private static final long serialVersionUID = 6718838811223344556L;
	
	
	
	protected String id;
	protected String[] ids;
	protected Pager pager;
	protected String logInfo;// 日志记录信息
	protected String redirectionUrl;// 操作提示后的跳转URL,为null则返回前一页
	
	@Resource
	protected MemberService memberService;
	
	@Resource
	protected NavigationService navigationService;
	@Resource
	protected FriendLinkService friendLinkService;
	@Resource
	protected FooterService footerService;
	
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
	
	// 获取商品价格货币格式（包含货币单位）
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

	// 获取当前登录会员，若未登录则返回null
	public Member getLoginMember() {
		String id = (String) getSession(Member.LOGIN_MEMBER_ID_SESSION_NAME);
		if (StringUtils.isEmpty(id)) {
			return null;
		}
		Member loginMember = memberService.load(id);
		return loginMember;
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
	
	public List<Navigation> getTopNavigationList() {
		return navigationService.getTopNavigationList();
	}

	public List<Navigation> getMiddleNavigationList() {
		return navigationService.getMiddleNavigationList();
	}

	public List<Navigation> getBottomNavigationList() {
		return navigationService.getBottomNavigationList();
	}

	public List<FriendLink> getFriendLinkList() {
		return friendLinkService.getAll();
	}

	public List<FriendLink> getPictureFriendLinkList() {
		return friendLinkService.getPictureFriendLinkList();
	}

	public List<FriendLink> getTextFriendLinkList() {
		return friendLinkService.getTextFriendLinkList();
	}

	public Footer getFooter() {
		return footerService.getFooter();
	}

}