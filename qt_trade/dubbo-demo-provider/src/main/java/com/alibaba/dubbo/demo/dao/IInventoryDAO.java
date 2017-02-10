package com.alibaba.dubbo.demo.dao;

import java.util.List;

import com.alibaba.dubbo.demo.Entity.InventoryEntity;
 

public interface IInventoryDAO {
	public List<InventoryEntity> getInventorys();
}
