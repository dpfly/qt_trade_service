package com.alibaba.dubbo.demo.dao;

import org.apache.ibatis.annotations.Param;

import com.alibaba.dubbo.demo.user.User;

public interface IUserDAO {
	 public User getUserById(long userId);
	 public Long registerUser(User user);
	 public User getUserByNamePwd(@Param("userName") String userName,@Param("userPwd")  String userPwd);
}
