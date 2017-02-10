package com.alibaba.dubbo.demo.Entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.plaf.synth.SynthInternalFrameUI;

public class Deviate implements Serializable {

	private int id;
	private String stockCode;
	private String stockName;
	private Date floorStartDate;
	private Timestamp createTime;
	
	private Time floorStartTime;
 
	private BigDecimal floorStartPrice;
	private Date floorEndDate;
	private Time floorEndTime;
	private BigDecimal floorEndPrice;
 
	private Integer status;
	private String codeType;
	
	private Integer macdInterval;

	// 记录id
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	// 股票代码
	public String getStockCode() {
		return this.stockCode;
	}

	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}

	// 股票名称
	public String getStockName() {
		return this.stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	// 第一次低点日期
	public Date getFloorStartDate() {
		return this.floorStartDate;
	}

	public void setFloorStartDate(Date floorStartDate) {
		this.floorStartDate = floorStartDate;
	}
	public String getFloorStartDateStr() {
		 SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		return format.format(this.floorStartDate);
	}
 
	// 第一次低点时间
	public Date getFloorStartTime() {
		return this.floorStartTime;
	}

 

	// 第一次低点价格
	public BigDecimal getFloorStartPrice() {
		return this.floorStartPrice;
	}

	public void setFloorStartPrice(BigDecimal floorStartPrice) {
		this.floorStartPrice = floorStartPrice;
	}

	// 第二次低点日期
	public Date getFloorEndDate() {
		return this.floorEndDate;
	}
	public String getFloorEndDateStr() {
		 SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		return format.format(this.floorEndDate);
	}
	public void setFloorEndDate(Date floorEndDate) {
		this.floorEndDate = floorEndDate;
	}

	// 第二次低点时间
	public Date getFloorEndTime() {
		return this.floorEndTime;
	}

	public void setFloorEndTime(Time floorEndTime) {
		this.floorEndTime = floorEndTime;
	}

	// 第二次低点价格
	public BigDecimal getFloorEndPrice() {
		return this.floorEndPrice;
	}

	public void setFloorEndPrice(BigDecimal floorEndPrice) {
		this.floorEndPrice = floorEndPrice;
	}

 
 
	// 状态
	public Integer getStatus() {
		return this.status;
	}
	public void setSstatus(Integer status) {
		this.status = status;
	}
	// 股票类型
	public String getCodeType() {
		return this.codeType;
	}
	public void setCodeType(String codeType) {
		this.codeType = codeType;
	}
	// 创建时间
	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		 
		this.createTime = createTime;
	}
	public String getCreateTimeStr() {
		 SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return format.format(this.createTime);
	}

	public Integer getMacdInterval() {
		return macdInterval;
	}

	public void setMacdInterval(Integer macdInterval) {
		this.macdInterval = macdInterval;
	}
}
