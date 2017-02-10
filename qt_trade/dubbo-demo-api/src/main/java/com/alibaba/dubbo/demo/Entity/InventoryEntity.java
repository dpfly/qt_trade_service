package com.alibaba.dubbo.demo.Entity;

import java.math.BigDecimal;

public class InventoryEntity {

	private Integer id;
	private String code;
	private String codeType;
	private String name;
	private Integer count;//持仓数量
	private BigDecimal tradePrice;//成本
	private BigDecimal currentPrice;//现价
	private BigDecimal inventoryAmount;//持仓市值
	private BigDecimal balance;//盈亏金额
	private BigDecimal percent;//盈亏比例
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
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public BigDecimal getTradePrice() {
		return tradePrice;
	}
	public void setTradePrice(BigDecimal tradePrice) {
		this.tradePrice = tradePrice;
	}
	public BigDecimal getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(BigDecimal currentPrice) {
		this.currentPrice = currentPrice;
	}
	public BigDecimal getInventoryAmount() {
		return inventoryAmount;
	}
	public void setInventoryAmount(BigDecimal inventoryAmount) {
		this.inventoryAmount = inventoryAmount;
	}
	 
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	public BigDecimal getPercent() {
		return percent;
	}
	public void setPercent(BigDecimal percent) {
		this.percent = percent;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
}
