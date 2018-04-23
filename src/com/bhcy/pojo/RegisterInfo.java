package com.bhcy.pojo;

import java.io.Serializable;
import java.util.Date;

import com.bhcy.util.DateUtil;


/**
 * @author huoy
 * @ClassName :RegisterInfo
 * @version 版本
 * @ModifiedBy 修改人
 * @date 2018年3月27日	
 */
public class RegisterInfo implements Serializable{

	/**
	 * 注册信息
	 */
	private static final long serialVersionUID = -2311051560234522993L;
	
	private String id;
	//电话
	private String telephone;
	//姓名
	private String name;
	//公司地区
	private String companyArea;
	//公司类型
	private String companyType;
	//公司名称
	private String companyName;
	//时间
	private String registerDate;
	
	public RegisterInfo(){
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompanyArea() {
		return companyArea;
	}
	public void setCompanyArea(String companyArea) {
		this.companyArea = companyArea;
	}
	public String getCompanyType() {
		return companyType;
	}
	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public String getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}
	@Override
	public String toString() {
		return "RegisterInfo [id=" + id + ", telephone=" + telephone
				+ ", name=" + name + ", companyArea=" + companyArea
				+ ", companyType=" + companyType + ", companyName="
				+ companyName + "]";
	}
	
}
