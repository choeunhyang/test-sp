package com.test.sp.service.impl.UserServiceImpl;

import com.test.sp.vo.UserTest;

public interface UserTestService {
	public UserTest loginUser(UserTest user);
	public UserTest selectUserById(String id);
	public int insertUser(UserTest user);
}
