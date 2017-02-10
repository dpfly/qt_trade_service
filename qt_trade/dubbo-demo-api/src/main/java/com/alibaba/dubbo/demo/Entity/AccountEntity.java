package com.alibaba.dubbo.demo.Entity;

import java.math.BigDecimal;

public class AccountEntity {

	private Integer id;
	private BigDecimal totalBaseAmount;//原始本金
	private BigDecimal inventoryAmount;//持仓市值
	private BigDecimal balance;//盈亏金额
	private BigDecimal validAmount;//可用金额
	private BigDecimal totalAsset;//总资产
	public BigDecimal getTotalBaseAmount() {
		return totalBaseAmount;
	}
	public void setTotalBaseAmount(BigDecimal totalBaseAmount) {
		this.totalBaseAmount = totalBaseAmount;
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
	public BigDecimal getValidAmount() {
		return validAmount;
	}
	public void setValidAmount(BigDecimal validAmount) {
		this.validAmount = validAmount;
	}
	public BigDecimal getTotalAsset() {
		return totalAsset;
	}
	public void setTotalAsset(BigDecimal totalAsset) {
		this.totalAsset = totalAsset;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
}
