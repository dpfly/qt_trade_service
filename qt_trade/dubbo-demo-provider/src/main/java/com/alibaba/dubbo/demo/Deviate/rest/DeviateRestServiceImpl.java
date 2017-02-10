package com.alibaba.dubbo.demo.Deviate.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.alibaba.dubbo.demo.Deviate.IDeviateRestService;
import com.alibaba.dubbo.demo.Deviate.IDeviateService;
import com.alibaba.dubbo.demo.Entity.Deviate;
import com.alibaba.dubbo.demo.user.LoginModel;
import com.alibaba.dubbo.demo.user.LoginResult;
import com.alibaba.dubbo.demo.user.UserService;
import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;

@Path("deviate")
@Consumes({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
@Produces({ ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8 })
public class DeviateRestServiceImpl implements IDeviateRestService {

	private IDeviateService deviateService;

	public void setDeviateService(IDeviateService deviateService) {
		this.deviateService = deviateService;
	}

 
	@POST
	@Path("getlist")
	public List<Deviate> getList() {
		System.out.print("start....");
		List<Deviate> lstDeviates = deviateService.getDeviates();
		return lstDeviates;
	}

 
 
}
