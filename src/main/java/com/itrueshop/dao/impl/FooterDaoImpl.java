package com.itrueshop.dao.impl;


import org.springframework.stereotype.Repository;

import com.itrueshop.dao.FooterDao;
import com.itrueshop.entity.Footer;


/**
 * Dao实现类 - 网页底部信息
 */

@Repository
public class FooterDaoImpl extends BaseDaoImpl<Footer, String> implements FooterDao {

	public Footer getFooter() {
		return load(Footer.FOOTER_ID);
	}

}
