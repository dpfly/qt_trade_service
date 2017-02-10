package com.alibaba.controller;
import org.springframework.stereotype.Controller;    
import org.springframework.ui.Model;    
import org.springframework.web.bind.annotation.RequestMapping;    
    
@Controller    
public class AccountController {
	   @RequestMapping(value="account.do")    
	    public void index_jsp(Model model){    
	    	int value = 100;
	    	double m =value +100;
	        model.addAttribute("str0121", "Hellow world"+m);    
	}
}
