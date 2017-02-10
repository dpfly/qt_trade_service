package com.alibaba.dubbo.demo.inventory.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.demo.Entity.InventoryEntity;
import com.alibaba.dubbo.demo.dao.IInventoryDAO;
import com.alibaba.dubbo.demo.inventory.IInventoryService;

public class InventoryServiceImpl implements IInventoryService  {
	@Autowired
	private IInventoryDAO inventoryDAO;
	@Override
	public List<InventoryEntity> getInventorys() {
		 
		return inventoryDAO.getInventorys();
	}

}
