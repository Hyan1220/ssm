package com.bhcy.util;

import java.util.List;

import net.sf.json.JSONArray;

import com.alibaba.fastjson.JSON;

public class JsonUtil {
	/**
	 * pojo转为Json 字符串
	 * @param obj
	 * @return
	 */
	public static String pojoToJson(Object obj){
		return JSON.toJSONString(obj);
	}
	/**
	 * 将list转为Json 字符串
	 * @param list
	 * @return
	 */
	public static <T> String ListToJson(List<T> list){
		return JSONArray.fromObject(list).toString();
	}
}
