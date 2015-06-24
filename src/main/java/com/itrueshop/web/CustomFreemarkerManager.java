package com.itrueshop.web;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.views.freemarker.FreemarkerManager;

import freemarker.cache.FileTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.TemplateException;
/**
 * 
 * 自动全局转义html的freemarker管理类
 * @author zhangb
 *
 */
public class CustomFreemarkerManager extends FreemarkerManager {
	private static final Log logger = LogFactory.getLog(CustomFreemarkerManager.class);
	private static final String CONFIG_SERVLET_CONTEXT_KEY = "buildhtml.freemarker.Configuration";
	private Configuration configuration;
	@Override
	protected Configuration createConfiguration(ServletContext servletContext)
			throws TemplateException {
		// 需要转义html的对象，用于动态页面渲染，防止XSS攻击
		Configuration configuration = super.createConfiguration(servletContext);
		// 原始的不转义html的对象，用于生成静态页面
		this.configuration = super.createConfiguration(servletContext);
		// 将生成静态页面的对象放到上下文中
		servletContext.setAttribute(CONFIG_SERVLET_CONTEXT_KEY, this.configuration);
		try {
			this.configuration.setSettings(getClass().getResourceAsStream("/freemarker.properties"));
			this.configuration.setTemplateLoader(new FileTemplateLoader(new File(servletContext.getRealPath("/"))));
		} catch (IOException e) {
			logger.error("", e);
		}
		return configuration;
	}
	@Override
	public synchronized Configuration getConfiguration(ServletContext arg0) {
		Configuration configuration =  super.getConfiguration(arg0);
		// 升级到2.3.15后templateLoader被设置为默认的了
		if(!(configuration.getTemplateLoader() instanceof HtmlTemplateLoader)){
			configuration.setTemplateLoader(new HtmlTemplateLoader(configuration.getTemplateLoader()));
		}
		return configuration;
	}
	/**
	 * 获取原始的不转义html的对象，用于生成静态页面
	 * @param servletContext
	 * @return
	 * @throws TemplateException
	 */
	public synchronized Configuration getBuildHtmlConfiguration(
			ServletContext servletContext) throws TemplateException {
		return (Configuration) servletContext.getAttribute(CONFIG_SERVLET_CONTEXT_KEY);
	}
}
