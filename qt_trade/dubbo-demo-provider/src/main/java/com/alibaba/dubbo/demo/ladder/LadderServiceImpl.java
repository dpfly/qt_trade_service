package com.alibaba.dubbo.demo.ladder;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.demo.Entity.LadderEntity;
import com.alibaba.dubbo.demo.dao.ILadderDAO;

public class LadderServiceImpl implements ILadderService {

	@Autowired
	private ILadderDAO ladderDAO;
	@Override
	public List<LadderEntity> getLadders() {
		 return ladderDAO.getLadders();
	}

}
