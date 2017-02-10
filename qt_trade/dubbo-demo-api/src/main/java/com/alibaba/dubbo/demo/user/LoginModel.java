package com.alibaba.dubbo.demo.user;

public class LoginModel {

	private String userName;
	private String userPwd;
	public void setUserName(String userName)
	{
		this.userName =userName;
	}
	public String getUserName()
	{
		return this.userName;
	}
	
	public void setUserPwd(String userPwd)
	{
		this.userPwd =userPwd;
	}
	public String getUserPwd()
	{
		return this.userPwd;
	}
}
