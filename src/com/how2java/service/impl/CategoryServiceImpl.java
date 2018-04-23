package com.how2java.service.impl;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.how2java.mapper.CategoryMapper;
import com.how2java.pojo.Category;
import com.how2java.service.CategoryService;
import com.how2java.util.Page;
 /**
  * CategoryServiceImpl被注解@Service标示为一个Service并且装配了categoryMapper
  */
@Service
public class CategoryServiceImpl  implements CategoryService{
    @Autowired
    CategoryMapper categoryMapper;
     
    public List<Category> list(){
        return categoryMapper.list();
    };
    @Override
    public List<Category> list(Page page) {
        // TODO Auto-generated method stub
        return categoryMapper.list(page);
    }
 
    @Override
    public int total() {
        return categoryMapper.total();
    }
    
    @Override
    public void deleteAll() {
        List<Category> cs = list();
        for (Category c : cs) {
             
            categoryMapper.delete(c.getId());
        }
    }
     
    //为addTwo方法加上事务注解 version 1.0
    //@Transactional(propagation=Propagation.REQUIRED,rollbackForClassName="Exception")
    
    // version 2.0 
    @Override
    public void addTwo() {
         
        Category c1 = new Category();
        c1.setName("短的名字");
        categoryMapper.add(c1);
         
        Category c2 = new Category();
        c2.setName("名字长对应字段放不下,名字长对应字段放不下,名字长对应字段放不下,名字长对应字段放不下,名字长对应字段放不下,名字长对应字段放不下,名字长对应字段放不下,名字长对应字段放不下,");
        categoryMapper.add(c2);
    };
 
}