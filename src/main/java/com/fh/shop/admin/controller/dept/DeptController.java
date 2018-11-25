/** 
 * <pre>项目名称:shop-admin 
 * 文件名称:DeptController.java 
 * 包名:com.fh.shop.admin.controller.dept 
 * 创建日期:2018年10月6日下午7:38:15 
 * Copyright (c) 2018, 3319787644@qq.com All Rights Reserved.</pre> 
 */  
package com.fh.shop.admin.controller.dept;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fh.shop.admin.biz.dept.IDeptService;
import com.fh.shop.admin.po.dept.Dept;

/** 
 * <pre>项目名称：shop-admin    
 * 类名称：DeptController    
 * 类描述：    
 * 创建人：肖治超3319787644@qq.com    
 * 创建时间：2018年10月6日 下午7:38:15    
 * 修改人：肖治超 3319787644@qq.com     
 * 修改时间：2018年10月6日 下午7:38:15    
 * 修改备注：       
 * @version </pre>    
 */
@Controller
@RequestMapping("/dept")
public class DeptController {
	@Resource(name="deptService")
	private IDeptService deptService;
	
	@RequestMapping("/addDept")
	public String addDept(Dept dept){
		dept.setDeptName("电商管理");
		dept.setFatherId(0);
		try {
			deptService.addDept(dept);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
	
	
}
