package com.alibaba.dubbo.demo.ladder;

import java.util.List;

import com.alibaba.dubbo.demo.Entity.LadderEntity;

public interface ILadderService {
	   List<LadderEntity> getLadders();
}
