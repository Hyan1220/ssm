package com.bhcy.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.bhcy.pojo.RegisterInfo;
import com.bhcy.service.RegisterInfoService;
import com.bhcy.util.Page;
/**
 * 注册信息控制类
 * @author huoy
 * @ClassName :RegisterInfoController
 * @version 版本
 * @ModifiedBy 修改人
 * @date 2018年3月27日
 */
@Controller
@RequestMapping("")
public class RegisterInfoController {
		@Autowired
		RegisterInfoService registerInfoService;
		
	 	/**
	 	 * 新增注册登记信息
	 	 * @param json字符串
	 	 * @return json字符串
	 	 */
	    @ResponseBody
	    @RequestMapping("/addRegisterInfo")
	    public String addRegisterInfo(RegisterInfo registerInfo) {
	    	return registerInfoService.addRegisterInfo(registerInfo);
	    }
	    /**
	 	 * 查询注册登记信息
	 	 * @param  json 对象
	 	 * @return json字符串
	 	 */
	    @ResponseBody
	    @RequestMapping("/queryRegisterInfo")
	    public String queryRegisterInfo(RegisterInfo registerInfo,Page page) {
	        return registerInfoService.queryRegisterInfo(registerInfo,page);
	    }
	    
	  //返回测试
	    @ResponseBody
	    @RequestMapping("/test")
	    public String test(HttpServletResponse response) {
	    	RegisterInfo registerInfo= new RegisterInfo();
			registerInfo.setTelephone("95530");
			registerInfo.setName("huoy");
			registerInfo.setCompanyType("国企");
			registerInfo.setCompanyName("中国人民银行");
			registerInfo.setCompanyArea("天河");
	        String jsonString = JSON.toJSONString(registerInfo);
	        return jsonString;
	    }
}
