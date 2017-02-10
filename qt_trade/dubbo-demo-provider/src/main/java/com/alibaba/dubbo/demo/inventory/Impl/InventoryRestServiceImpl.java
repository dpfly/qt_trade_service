package com.alibaba.dubbo.demo.inventory.Impl;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.alibaba.dubbo.demo.Entity.InventoryEntity;
import com.alibaba.dubbo.demo.Entity.TradeEntity;
import com.alibaba.dubbo.demo.inventory.IInventoryService;
import com.alibaba.dubbo.demo.inventory.IInventoryRestService;
import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
@Path("inventory")
@Consumes({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
@Produces({ ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8 })
public class InventoryRestServiceImpl implements IInventoryRestService {
	private IInventoryService inventoryService;

	public void setInventoryService(IInventoryService inventoryService) {
		this.inventoryService = inventoryService;
	}

	@POST
	@Path("getlist")
	@Override
	public List<InventoryEntity> getInventorys() {
		 
		return inventoryService.getInventorys();
	}

}
