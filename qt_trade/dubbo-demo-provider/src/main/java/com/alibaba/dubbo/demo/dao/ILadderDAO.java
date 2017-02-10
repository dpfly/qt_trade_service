package com.alibaba.dubbo.demo.dao;

import java.util.List;

import com.alibaba.dubbo.demo.Entity.Deviate;
import com.alibaba.dubbo.demo.Entity.LadderEntity;

public interface ILadderDAO {
	public List<LadderEntity> getLadders();
}
