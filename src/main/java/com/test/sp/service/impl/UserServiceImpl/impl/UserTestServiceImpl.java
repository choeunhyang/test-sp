package com.test.sp.service.impl.UserServiceImpl.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.sp.dao.UserTestDAO;
import com.test.sp.service.impl.UserServiceImpl.UserTestService;
import com.test.sp.vo.UserTest;

@Service
public class UserTestServiceImpl implements UserTestService{

	@Autowired
	private UserTestDAO utdao;

	@Override
	public UserTest loginUser(UserTest user) {
		return utdao.loginUser(user);
	}

	@Override
	public UserTest selectUserById(String id) {
		return utdao.selectUserById(id);
	}

	@Override
	public int insertUser(UserTest user) {
		return utdao.insertUser(user);
	}
}
