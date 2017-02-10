package com.alibaba.dubbo.demo.Entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LadderEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String code;
	private String name;
	private Date ladderDate;
	private Date createTime;
	private String codeType;
	private Integer smallDays;
	private BigDecimal currentPrice;
	private BigDecimal todayIncrease;
	private Boolean isNew;
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getCode()
	{
		return this.code;
	}
	public void setCode(String code)
	{
		this.code =code;
	}
	public String getName()
	{
		return this.name;
	}
	public void setName(String name)
	{
		this.name =name;
	}
	
	public Date getLadderDate()
	{
		return this.ladderDate;
	}
	public void setLadderDate(Date ladderDate)
	{
		this.ladderDate =ladderDate;
	}
	public String getLadderDateStr() {
		 SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		return format.format(this.ladderDate);
	}
 

	public String getCodeType() {
		return codeType;
	}

	public void setCodeType(String codeType) {
		this.codeType = codeType;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public BigDecimal getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(BigDecimal currentPrice) {
		this.currentPrice = currentPrice;
	}

	public BigDecimal getTodayIncrease() {
		return todayIncrease;
	}

	public void setTodayIncrease(BigDecimal todayIncrease) {
		this.todayIncrease = todayIncrease;
	}

	public Integer getSmallDays() {
		return smallDays;
	}

	public void setSmallDays(Integer smallDays) {
		this.smallDays = smallDays;
	}

	public Boolean getIsNew() {
		return isNew;
	}

	public void setIsNew(Boolean isNew) {
		this.isNew = isNew;
	}
}
