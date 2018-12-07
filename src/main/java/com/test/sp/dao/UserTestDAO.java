package com.test.sp.dao;

import com.test.sp.vo.UserTest;

public interface UserTestDAO {
	public UserTest loginUser(UserTest user);
	public UserTest selectUserById(String id);
	public int insertUser(UserTest user);
}
