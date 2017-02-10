package com.alibaba.dubbo.demo.trade;

import java.util.List;

import com.alibaba.dubbo.demo.Entity.TradeEntity;

public interface ITradeRestService {

	List<TradeEntity>getTrades();
}
