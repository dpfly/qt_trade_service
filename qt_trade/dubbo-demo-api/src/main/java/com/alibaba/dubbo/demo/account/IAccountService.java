package com.alibaba.dubbo.demo.account;

import java.util.List;

import com.alibaba.dubbo.demo.Entity.AccountEntity;
public interface IAccountService {
	 public List<AccountEntity>getAccountInfo();
}
