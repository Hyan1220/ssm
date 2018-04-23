package com.bhcy.test;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bhcy.mapper.RegisterInfoMapper;
import com.bhcy.pojo.RegisterInfo;
import com.bhcy.service.RegisterInfoService;
import com.bhcy.util.JsonUtil;
import com.bhcy.util.MapUtil;
import com.bhcy.util.Page;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class MybatiesTest {
	@Autowired
	RegisterInfoMapper registerInfoMapper;
	
	@Autowired
	RegisterInfoService registerInfoService;
	
	@Test
	public void testAdd(){
			
			RegisterInfo registerInfo= new RegisterInfo();
			registerInfo.setTelephone("95530");
			registerInfo.setName("huoy");
			registerInfo.setCompanyType("国企");
			registerInfo.setCompanyName("中国人民银行");
			registerInfo.setCompanyArea("天河");
			registerInfoMapper.add(registerInfo);
	}
	@Test
	public void TestList(){
		
		RegisterInfo registerInfo= new RegisterInfo();
		registerInfo.setTelephone("95530");
		Map<String,Object> params  =  MapUtil.objectToMap(registerInfo);
		/*Map<String,Object> params  = new HashMap<String,Object>();
		params.put("name1", "huoy1");*/
		params.put("start", 1);
		params.put("pageSize", 4);
		List<RegisterInfo> list = registerInfoMapper.list(params);
		for(RegisterInfo registerInfo1:list){
			System.out.println(registerInfo1.toString());
		}
	}
	@Test
	public void JsonTest(){
		List<RegisterInfo> list = registerInfoMapper.list();
		System.out.println(JsonUtil.ListToJson(list));
	}
	@Test
	public void Test(){
		RegisterInfo registerInfo= new RegisterInfo();
		Page page = new Page();
		String str = registerInfoService.queryRegisterInfo(registerInfo,page);
		System.out.println(str);
	}
}
