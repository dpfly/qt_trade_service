package com.alibaba.dubbo.demo.account.Impl;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.alibaba.dubbo.demo.Entity.AccountEntity;
import com.alibaba.dubbo.demo.account.IAccountRestService;
import com.alibaba.dubbo.demo.account.IAccountService;
import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
@Path("account")
@Consumes({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
@Produces({ ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8 })
public class AccountRestServiceImpl implements IAccountRestService {
	private IAccountService accountService;

	public void setAccountService(IAccountService accountService) {
		this.accountService = accountService;
	}

	@POST
	@Path("getaccountinfo")
	@Override
	public List<AccountEntity> getAccountInfo() {
	 
		return accountService.getAccountInfo();
	}

}
