package com.itrueshop.web;


import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import org.apache.commons.io.IOUtils;

import freemarker.cache.TemplateLoader;

/** 
 * 全局转义html的模板
 *
 **/
public class HtmlTemplateLoader implements TemplateLoader {

	private static final String HTML_ESCAPE_PREFIX= "<#escape x as x?html>";
    private static final String HTML_ESCAPE_SUFFIX = "</#escape>";
    
    private final TemplateLoader delegate;
    
    public HtmlTemplateLoader(TemplateLoader delegate) {
        this.delegate = delegate;
    }
    
	@Override
	public void closeTemplateSource(Object templateSource) throws IOException {
		delegate.closeTemplateSource(templateSource);
	}

	@Override
	public Object findTemplateSource(String name) throws IOException {
		return delegate.findTemplateSource(name);
	}

	@Override
	public long getLastModified(Object templateSource) {
		return delegate.getLastModified(templateSource);
	}

	/* (non-Javadoc)
	 * @see freemarker.cache.TemplateLoader#getReader(java.lang.Object, java.lang.String)
	 * 在读取template文件之后, 在前后套上<#escape>标签
	 */
	@Override
	public Reader getReader(Object templateSource, String encoding)
			throws IOException {
		Reader reader = delegate.getReader(templateSource, encoding);
		String templateText = IOUtils.toString(reader);
		return new StringReader(HTML_ESCAPE_PREFIX + templateText
				+ HTML_ESCAPE_SUFFIX);
	}

}
