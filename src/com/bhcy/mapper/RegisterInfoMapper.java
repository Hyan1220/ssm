package com.bhcy.mapper;

import java.util.List;
import java.util.Map;

import com.bhcy.pojo.RegisterInfo;

public interface RegisterInfoMapper {
	
	public int add(RegisterInfo registerInfo); 
    
    public void delete(String id); 
        
    public RegisterInfo get(String id); 
      
    public int update(RegisterInfo registerInfo);  
        
    public List<RegisterInfo> list();
     
    public List<RegisterInfo> list(Map<String,Object> params);
     
    public int total(RegisterInfo registerInfo); 
}
