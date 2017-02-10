package com.alibaba.dubbo.demo.inventory;

import java.util.List;

import com.alibaba.dubbo.demo.Entity.InventoryEntity;
 

public interface IInventoryRestService {
	List<InventoryEntity>getInventorys();
}
