package com.itrueshop;

import org.springframework.stereotype.Component;

/**
 * 从配置文件中获取值
 * 
 * @author lzq
 * 
 */
@Component
public class SystemETC {
	// public static String FILE_PATH = "";// 文件存储目录
	public static String I18N = "i18n/i18n";// 配置i18n目录

	// @Value("@{file.path}")
	// public void setFilePath(String filePath) {
	// FILE_PATH = filePath;
	// }
}
