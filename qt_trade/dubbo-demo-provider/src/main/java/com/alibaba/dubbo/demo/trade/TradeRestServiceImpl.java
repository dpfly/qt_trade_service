package com.alibaba.dubbo.demo.trade;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.alibaba.dubbo.demo.Entity.TradeEntity;
import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
@Path("trade")
@Consumes({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
@Produces({ ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8 })
public class TradeRestServiceImpl implements ITradeRestService {
	private ITradeService tradeService;

	public void setTradeService(ITradeService tradeService) {
		this.tradeService = tradeService;
	}

	@Override
	@POST
	@Path("getlist")
	public List<TradeEntity> getTrades() {
		 return tradeService.getTrades();
	}
}
