package com.alibaba.dubbo.demo.code;

import java.util.List;
import com.alibaba.dubbo.demo.Entity.CodeEntity;


public interface ICodeRestService {
	  List<CodeEntity> getList();
}
