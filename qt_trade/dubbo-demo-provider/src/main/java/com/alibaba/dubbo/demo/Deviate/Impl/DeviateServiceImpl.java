package com.alibaba.dubbo.demo.Deviate.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.demo.Deviate.IDeviateService;
import com.alibaba.dubbo.demo.Entity.Deviate;
import com.alibaba.dubbo.demo.dao.IDeviateDAO;
import com.alibaba.dubbo.demo.dao.IUserDAO;
import com.alibaba.dubbo.demo.user.UserService;

public class DeviateServiceImpl implements IDeviateService {
	@Autowired
	private IDeviateDAO deviateDAO;
	@Override
	public List<Deviate> getDeviates() {
		return deviateDAO.getDeviates();
	}

}
