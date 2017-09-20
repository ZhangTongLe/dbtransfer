package com.iyooc.core.account.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.iyooc.core.account.model.util.BeanUtil;
import com.iyooc.core.account.service.imp.BaseNewDaoImpl;
import com.iyooc.core.account.service.imp.BaseOldDaoImpl;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring/spring-context.xml" })
public class TestDBTransfer {

	@Autowired
	private BaseOldDaoImpl<com.iyooc.core.account.model.db_old.AccountUB> baseOldDaoImpl;

	@Autowired
	private BaseNewDaoImpl<com.iyooc.core.account.model.db_new.AccountUB> baseNewDaoImpl;

	@Test
	public void testUBTransfer() {
		List<com.iyooc.core.account.model.db_old.AccountUB> list = baseOldDaoImpl.find("from com.iyooc.core.account.model.db_old.AccountUB order by userId", 0, 5);
		for (com.iyooc.core.account.model.db_old.AccountUB oldd : list) {
			System.out.println("hello====================================================" + list.size());
			com.iyooc.core.account.model.db_new.AccountUB neww = new com.iyooc.core.account.model.db_new.AccountUB();
			BeanUtil.copyNotNullProperties(oldd, neww);
			baseNewDaoImpl.save(neww);
		}
	}

}
