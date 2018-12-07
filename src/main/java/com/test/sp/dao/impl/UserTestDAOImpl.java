package com.test.sp.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.sp.dao.UserTestDAO;
import com.test.sp.vo.UserTest;

@Repository
public class UserTestDAOImpl implements UserTestDAO {

	@Autowired
	private SqlSession ss;
	
	@Override
	public UserTest loginUser(UserTest ut) {
		return ss.selectOne("com.test.sp.vo.UserTest.loginUser",ut);
	}

	@Override
	public UserTest selectUserById(String id) {
		return ss.selectOne("com.test.sp.vo.UserTest.selectUserById", id);
	}

	@Override
	public int insertUser(UserTest user) {
		return ss.insert("com.test.sp.vo.UserTest.insertUser");
	}
}
