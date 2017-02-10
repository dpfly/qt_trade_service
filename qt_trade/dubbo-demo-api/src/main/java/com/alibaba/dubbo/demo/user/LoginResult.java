package com.alibaba.dubbo.demo.user;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class LoginResult implements Serializable{

	private Long userId;
	private String userName;
	private String cookie;
	
	public void setUserName(String userName){
		this.userName =userName;
	}
	public String getUserName()
	{
		return this.userName;
	}
	public void setUserId(Long userId){
		this.userId =userId;
	}
	public Long getUserId()
	{
		return this.userId;
	}
	public void setCookie(String cookie){
		this.cookie =cookie;
	}
	public String getCookie()
	{
		return this.cookie;
	}
}
