package com.alibaba.dubbo.demo.ladder;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.alibaba.dubbo.demo.Entity.LadderEntity;
import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
@Path("ladder")
@Consumes({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
@Produces({ ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8 })
public class LadderRestServiceImpl implements ILadderRestService {
	private ILadderService ladderService;

	public void setLadderService(ILadderService ladderService) {
		this.ladderService = ladderService;
	}

	@Override
	@POST
	@Path("getlist")
	public List<LadderEntity> getList() {
		List<LadderEntity> lstDeviates = ladderService.getLadders();
		return lstDeviates;
	}

}
