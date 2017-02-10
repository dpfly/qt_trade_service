package com.alibaba.dubbo.demo.code;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.alibaba.dubbo.demo.Entity.CodeEntity;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;

@Path("code")
@Consumes({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
@Produces({ ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8 })
public class CodeRestServiceImpl implements ICodeRestService {
	private ICodeService codeService;

	public void setCodeService(ICodeService codeService) {
		this.codeService = codeService;
	}

	@Override
	@POST
	@Path("getlist")
	public List<CodeEntity> getList() {
		List<CodeEntity> lstDeviates = codeService.getCodeAVG30();
		return lstDeviates;
	}

}
