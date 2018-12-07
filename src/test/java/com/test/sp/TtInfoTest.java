package com.test.sp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.test.sp.dao.TtInfoDAO;
import com.test.sp.service.impl.UserServiceImpl.TtInfoService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class TtInfoTest {

	@Autowired
	private TtInfoDAO tidao; //DAOTEST 얘네 둘은 root-context.xml변경
	
	@Autowired
	private TtInfoService tis; //SERVISETEST
	
	@Test
	public void test() {
		assertEquals(3, tidao.getTtInfoList().size());
	}
	
	@Test
	public void objTest() {
		assertNotNull(tidao.getTtInfo(1));
	}
	
	@Test
	public void serviceTest() {
		assertNotNull(tis.getTtInfo(1));
	}
}
