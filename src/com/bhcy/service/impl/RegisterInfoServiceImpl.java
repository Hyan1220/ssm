package com.bhcy.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhcy.mapper.RegisterInfoMapper;
import com.bhcy.pojo.RegisterInfo;
import com.bhcy.service.RegisterInfoService;
import com.bhcy.util.DateUtil;
import com.bhcy.util.JsonUtil;
import com.bhcy.util.MapUtil;
import com.bhcy.util.Page;
import com.bhcy.util.ResponseMessage;

@Service
public class RegisterInfoServiceImpl implements RegisterInfoService {
	@Autowired
	RegisterInfoMapper registerInfoMapper;
	
	@Override
	public String addRegisterInfo(RegisterInfo registerInfo) {
		registerInfo.setRegisterDate(DateUtil.doFormatDate(new Date(), "yyyy-MM-dd HH:mm:ss"));
		ResponseMessage responseMessage = new ResponseMessage();
		if(registerInfoMapper.add(registerInfo)==1){
			responseMessage.setStatus("ok");
		}else{
			responseMessage.setStatus("error");
		}
		return JsonUtil.pojoToJson(responseMessage);
	}

	@Override
	public String queryRegisterInfo() {
		List<RegisterInfo> list = registerInfoMapper.list();
		return JsonUtil.ListToJson(list);
	}
	@Override
	public String queryRegisterInfo(RegisterInfo registerInfo,Page page) {
		Map<String,Object> params  =  MapUtil.objectToMap(registerInfo);
    	params.put("start", page.getStart());
    	params.put("pageSize", page.getPageSize());
		List<RegisterInfo> list = registerInfoMapper.list(params);
		int total = registerInfoMapper.total(registerInfo);
		return "{ \"page\":\"1\",\"total\" : "+total+", \"rows\" : "+JsonUtil.ListToJson(list)+"}";
	}

	@Override
	public int total(RegisterInfo registerInfo) {
		return registerInfoMapper.total(registerInfo);
	}

}
