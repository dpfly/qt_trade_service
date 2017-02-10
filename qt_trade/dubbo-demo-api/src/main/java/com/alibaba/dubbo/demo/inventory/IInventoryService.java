package com.alibaba.dubbo.demo.inventory;

import java.util.List;

import com.alibaba.dubbo.demo.Entity.InventoryEntity;
 

public interface IInventoryService {
	 public List<InventoryEntity>getInventorys();
}
