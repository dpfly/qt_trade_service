package com.alibaba.dubbo.demo.trade;

import java.util.List;

import org.springframework.beans.factory.annotation.Configurable;

import com.alibaba.dubbo.demo.Entity.TradeEntity;

public interface ITradeService {

	 public List<TradeEntity>getTrades();
}
