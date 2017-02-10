/*
 * Copyright 1999-2011 Alibaba Group.
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
package com.alibaba.dubbo.demo.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.alibaba.dubbo.demo.bid.BidService;
import com.alibaba.dubbo.demo.user.User;
import com.alibaba.dubbo.demo.user.UserService;
import com.alibaba.dubbo.demo.user.facade.AnotherUserRestService;
 
public class DemoConsumer {
	 
	public static void main(String[] args) throws Exception {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:META-INF/spring/*.xml");
		context.start();
	 	UserService userService = context.getBean(UserService.class);
//	com.alibaba.dubbo.container.Main.main(args);
	  User user = userService.getUser(2L);
		 
		System.out.println("大楼水电费水电费 "+user.getUserName() ); //
	}

}

