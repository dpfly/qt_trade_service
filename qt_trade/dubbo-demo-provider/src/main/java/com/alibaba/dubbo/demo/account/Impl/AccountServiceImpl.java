package com.alibaba.dubbo.demo.account.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.demo.Entity.AccountEntity;
import com.alibaba.dubbo.demo.account.IAccountService;
import com.alibaba.dubbo.demo.dao.IAccountDAO;

public class AccountServiceImpl implements IAccountService {

	@Autowired
	private IAccountDAO accountDAO;
	@Override
	public List<AccountEntity> getAccountInfo() {
	 
		return accountDAO.getAccountInfo();
	}

}
