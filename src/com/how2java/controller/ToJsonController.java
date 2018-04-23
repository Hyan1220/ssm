package com.how2java.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.how2java.pojo.Category;

//告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("")
public class ToJsonController {
	@ResponseBody
    @RequestMapping("/submitCategory")
    public String submitCategory(@RequestBody Category category) {
        System.out.println("SSM接受到浏览器提交的json，并转换为Category对象:"+category);
        return "ok";
    }
    @ResponseBody
    @RequestMapping("/getOneCategory")
    public String getOneCategory() {
         Category c = new Category();
         c.setId(100);
         c.setName("第100个分类");
         JSONObject json= new JSONObject();
         json.put("category", JSONObject.toJSON(c));
         return json.toJSONString();
    }
    @ResponseBody
    @RequestMapping("/getManyCategory")
    public String getManyCategory() {
        List<Category> cs = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Category c = new Category();
            c.setId(i);
            c.setName("分类名称:"+i);
            cs.add(c);
        }
 
        return JSONObject.toJSON(cs).toString();
    }
    
    @RequestMapping("/hello5")
    @ResponseBody
    public String test(HttpServletResponse response) {
        System.out.println("test测试");
        Category cg = new Category();
        cg.setId(89);
        cg.setName("huoy");
        String jsonString = JSON.toJSONString(cg);
        return jsonString;
    }
}
