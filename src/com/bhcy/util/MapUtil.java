package com.bhcy.util;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

public class MapUtil {
	/**
	 * java对象转map
	 * @param obj
	 * @return
	 * @throws Exception
	 */
	 public static Map<String, Object> objectToMap(Object obj) {    
	        if(obj == null){    
	            return null;    
	        }   
	  
	        Map<String, Object> map = new HashMap<String, Object>();    
	  
	        Field[] declaredFields = obj.getClass().getDeclaredFields();    
	        for (Field field : declaredFields) {    
	            field.setAccessible(true);  
	            try {
	            		map.put(field.getName(), field.get(obj));
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}  
	        }    
	  
	        return map;  
	 }
	 /**
	  * map转java对象
	  * @param map
	  * @param beanClass
	  * @return
	  * @throws Exception
	  */
	 public static Object mapToObject(Map<String, Object> map, Class<?> beanClass) {    
	        if (map == null)  
	            return null;    
	  
	        Object obj = null;
			try {
				obj = beanClass.newInstance();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}  
	  
	        Field[] fields = obj.getClass().getDeclaredFields();   
	        for (Field field : fields) {    
	            int mod = field.getModifiers();    
	            if(Modifier.isStatic(mod) || Modifier.isFinal(mod)){    
	                continue;    
	            }    
	  
	            field.setAccessible(true);    
	            try {
					field.set(obj, map.get(field.getName()));
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}   
	        }   
	  
	        return obj;    
	    }    
}
