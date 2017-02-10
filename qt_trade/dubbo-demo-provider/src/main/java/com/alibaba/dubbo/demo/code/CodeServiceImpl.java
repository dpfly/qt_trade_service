package com.alibaba.dubbo.demo.code;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.demo.Entity.CodeEntity;
import com.alibaba.dubbo.demo.Entity.LadderEntity;
import com.alibaba.dubbo.demo.dao.ICodeDAO;
import com.alibaba.dubbo.demo.dao.ILadderDAO;

public class CodeServiceImpl implements ICodeService {
	@Autowired
	private ICodeDAO codeDAO;

	@Override
	public List<CodeEntity> getCodeAVG30() {
		 
		return codeDAO.getCodeAVG30();
	}
 
}
