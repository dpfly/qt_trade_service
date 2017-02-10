package com.alibaba.dubbo.demo.dao;

import java.util.List;

import com.alibaba.dubbo.demo.Entity.TradeEntity;

public interface ITradeDAO {

	public List<TradeEntity>getTrades();
}
