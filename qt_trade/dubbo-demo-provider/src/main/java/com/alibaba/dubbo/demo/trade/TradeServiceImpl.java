package com.alibaba.dubbo.demo.trade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.demo.Entity.TradeEntity;
import com.alibaba.dubbo.demo.dao.ITradeDAO;

public class TradeServiceImpl implements ITradeService {

	@Autowired
	private ITradeDAO tradeDAO;

	@Override
	public List<TradeEntity> getTrades() {
		return tradeDAO.getTrades();
	}
	
}
