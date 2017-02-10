package com.alibaba.dubbo.demo.dao;

import java.util.List;

import com.alibaba.dubbo.demo.Entity.AccountEntity;
 
public interface IAccountDAO {
	public List<AccountEntity> getAccountInfo();
}
