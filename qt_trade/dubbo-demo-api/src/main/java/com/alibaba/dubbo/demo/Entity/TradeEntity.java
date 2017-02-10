package com.alibaba.dubbo.demo.Entity;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TradeEntity {

	private Integer id; // ID
	private String code;// 股票代码
	private String codeType;// 股票类型 sz:深市 sh:沪市
	private String name;// 股票名称
	private Date tradeDate;
	private Date tradeTime;
	private Integer tradeCount;
	private BigDecimal tradePrice;
	private String tradeReason;
 
	private Integer macdInterval;
	private Integer status;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCodeType() {
		return codeType;
	}

	public void setCodeType(String codeType) {
		this.codeType = codeType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

 

	public String getTradeDateStr() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		if (this.tradeDate != null)
			return format.format(this.tradeDate);
		return "";
	}
	public String getTradeTimeStr() {
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		if (this.tradeTime != null)
			return format.format(this.tradeTime);
		return "";
	}
 

	 

	public Integer getMacdInterval() {
		return macdInterval;
	}

	public void setMacdInterval(Integer macdInterval) {
		this.macdInterval = macdInterval;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getTradeReason() {
		return tradeReason;
	}

	public void setTradeReason(String tradeReason) {
		this.tradeReason = tradeReason;
	}

	public BigDecimal getTradePrice() {
		return tradePrice;
	}

	public void setTradePrice(BigDecimal tradePrice) {
		this.tradePrice = tradePrice;
	}

	public Integer getTradeCount() {
		return tradeCount;
	}

	public void setTradeCount(Integer tradeCount) {
		this.tradeCount = tradeCount;
	}

	public Date getTradeTime() {
		return tradeTime;
	}

	public void setTradeTime(Date tradeTime) {
		this.tradeTime = tradeTime;
	}

}
