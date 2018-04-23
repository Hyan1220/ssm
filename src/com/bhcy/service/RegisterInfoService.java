package com.bhcy.service;

import com.bhcy.pojo.RegisterInfo;
import com.bhcy.util.Page;


/**
 * 注册信息
 * @author huoy
 * @ClassName :RegisterInfoService
 * @version 版本
 * @ModifiedBy 修改人
 * @date 2018年3月27日
 */
public interface RegisterInfoService {
	//注册信息
	public String addRegisterInfo(RegisterInfo registerInfo);
	//查询注册信息
	public String queryRegisterInfo();
	public String queryRegisterInfo(RegisterInfo registerInfo,Page page);
	public int total(RegisterInfo registerInfo);
	
}
