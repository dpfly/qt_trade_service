package com.alibaba.dubbo.demo.Entity;

import java.io.Serializable;
import java.math.BigDecimal;
 

public class CodeEntity implements Serializable {
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String code;
	private String name;
	private String codeType;
	private BigDecimal avg30Price;
	private BigDecimal currentPrice;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCodeType() {
		return codeType;
	}

	public void setCodeType(String codeType) {
		this.codeType = codeType;
	}

	public BigDecimal getAvg30Price() {
		return avg30Price;
	}

	public void setAvg30Price(BigDecimal avg30Price) {
		this.avg30Price = avg30Price;
	}

	public BigDecimal getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(BigDecimal currentPrice) {
		this.currentPrice = currentPrice;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
