package com.alibaba.dubbo.demo.dao;

import java.util.List;

import com.alibaba.dubbo.demo.Entity.Deviate;
import com.alibaba.dubbo.demo.user.User;

public interface IDeviateDAO {
	public List<Deviate> getDeviates();
}
