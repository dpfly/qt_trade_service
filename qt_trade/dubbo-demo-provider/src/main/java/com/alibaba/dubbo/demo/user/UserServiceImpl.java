/**
 * Copyright 1999-2014 dangdang.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.dubbo.demo.user;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.demo.dao.IUserDAO;

/**
 * @author lishen
 */
public class UserServiceImpl implements UserService {

	@Autowired
	private IUserDAO userDAO;
	private final AtomicLong idGen = new AtomicLong();

	public User getUser(Long id) {
		System.out.print("start....");
		User user = userDAO.getUserById(id);
		return new User(id, "username:" + user.getUserName());
	}

	public Long registerUser(User user) {
		System.out.print("start....");
		userDAO.registerUser(user);
		return 1L;
	}

	@Override
	public LoginResult login(String userName, String userPwd) {
		System.out.print(userName+":"+userPwd);
		User user = userDAO.getUserByNamePwd(userName, userPwd);
		if (user != null) {
			LoginResult result = new LoginResult();
			result.setUserId(user.getUserId());
			result.setUserName(user.getUserName());
			return result;
		}
		return null;
	}

}
