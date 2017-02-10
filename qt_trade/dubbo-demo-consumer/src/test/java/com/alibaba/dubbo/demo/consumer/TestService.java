package com.alibaba.dubbo.demo.consumer;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.demo.user.User;
import com.alibaba.dubbo.demo.user.UserService;
import com.alibaba.dubbo.demo.user.facade.AnotherUserRestService;

public class TestService {
	@Autowired
	private   UserService userService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public User getUser() {
		User user = userService.getUser(2L);
		return user;
	}
}
