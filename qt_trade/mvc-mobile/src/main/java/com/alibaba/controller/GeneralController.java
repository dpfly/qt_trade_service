package com.alibaba.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import com.alibaba.dubbo.demo.user.User;
import com.alibaba.dubbo.demo.user.UserService;

@Controller
@RequestMapping(value = "/general/")
public class GeneralController {
	@Autowired
	private UserService userService;
	@RequestMapping(value = "index.do")
	public void index_jsp(Model model) {
 
		int value = 100;
		double m = value + 100;
		User user = userService.getUser(1L);
		User newUser=new User(56L, "liyuanliang");
		userService.registerUser(newUser);
		model.addAttribute("str0121", "Hellow world hao" + m + user.getUserName());
		System.out.println("index.jsp" + user.toString());
	}
}