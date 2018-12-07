package com.test.sp.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.ResponseBody;

import com.test.sp.service.impl.UserServiceImpl.UserTestService;
import com.test.sp.vo.UserTest;

@Controller

public class UserTestController {

	@Autowired
	private UserTestService userService;
	
	@GetMapping("/users/{id}")
	public @ResponseBody UserTest getUserById(@PathVariable("id") String id) {
		return userService.selectUserById(id);
	}
	
	@PostMapping("/user")
	public @ResponseBody UserTest loginUser(@RequestBody UserTest user) {
		return userService.loginUser(user);
	}
	
	@PostMapping("/users")
	public @ResponseBody int insertUser(@RequestBody UserTest user) {
		return userService.insertUser(user);
	}
	
	
}