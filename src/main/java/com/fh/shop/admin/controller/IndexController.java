/** 
 * <pre>项目名称:shop-admin 
 * 文件名称:IndexController.java 
 * 包名:com.fh.shop.admin.controller 
 * 创建日期:2018年10月7日下午2:18:52 
 * Copyright (c) 2018, 3319787644@qq.com All Rights Reserved.</pre> 
 */  
package com.fh.shop.admin.controller;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aliyuncs.http.HttpRequest;
import com.fh.shop.admin.biz.dept.IDeptService;
import com.fh.shop.admin.biz.emp.IEmpService;
import com.fh.shop.admin.biz.log.ILogService;
import com.fh.shop.admin.po.dept.Dept;
import com.fh.shop.admin.po.emp.Emp;
import com.fh.shop.admin.po.log.Log;
import com.fh.shop.admin.util.DateUtil;
import com.fh.shop.admin.util.Page;

/** 
 * <pre>项目名称：shop-admin    
 * 类名称：IndexController   
 * 类描述：    
 * 创建人：肖治超3319787644@qq.com    
 * 创建时间：2018年10月7日 下午2:18:52    
 * 修改人：肖治超 3319787644@qq.com     
 * 修改时间：2018年10月7日 下午2:18:52    
 * 修改备注：       
 * @version </pre>    
 */
@Controller
public class IndexController {
	private static final Logger LOGGER=LoggerFactory.getLogger(IndexController.class);
	
	
	@Resource(name="deptService")
	private IDeptService deptService;
	
	
	@Resource(name="empServiceImpl")
	private IEmpService empService;
	
	@Resource(name="logServiceImpl")
	private ILogService logService;
	
	@RequestMapping("/index")
	public String index(){
		return "index";
	}
	
	@RequestMapping("/areaIndex")
	public String areaIndex(){
		return "areaIndex";
	}
	
	@RequestMapping("/dept/findDeptList")
	@ResponseBody
	public Map findDeptList(HttpServletRequest request){
		Map resultMap=new HashMap();
		
		List<Dept> lDepts = deptService.findDeptList();

		List<Map> liMaps=new ArrayList<Map>();
		for (Dept dept : lDepts) {
			Map item=new HashMap();
			item.put("id", dept.getId());
			item.put("name", dept.getDeptName());
			item.put("pId", dept.getFatherId());
			item.put("description", dept.getDescription());
			item.put("establishTime",DateUtil.date2String(dept.getEstablishTime(),DateUtil.YMD));
			liMaps.add(item);
		}
		
		resultMap.put("status", "ok");
		resultMap.put("data", liMaps);
		
		return resultMap;
	}
	
	@RequestMapping("/dept/add")
	@ResponseBody
	public Map add(Dept dept,HttpServletRequest request) throws Exception{
		
		Map resultMap=new HashMap();
		
		deptService.addDept(dept);
		resultMap.put("status", "ok");
		resultMap.put("data", dept);
		
		return resultMap;
	}
	//修改
	@RequestMapping("/dept/update")
	@ResponseBody
	public Map updateDept(Dept dept,HttpServletRequest request){

		Map resultMap=new HashMap();
		
		deptService.updateDept(dept);
		resultMap.put("status", "ok");
		
		return resultMap;
		
	}
	//删除
	@RequestMapping("/dept/delete")
	@ResponseBody
	public Map deleteDept(@RequestParam(value="str[]")List<Integer> str,HttpServletRequest request){

		Map resultMap=new HashMap();
		
		deptService.deleteDept(str);
		resultMap.put("status", "ok");
			
		return resultMap;
	}
	//员工 查询
	@RequestMapping("/emp/findEmpList")
	@ResponseBody
	public Map findEmpList(Emp emp,int draw,int start,int length,HttpServletRequest request){

		Map resultMap=new HashMap();
		
		String  orderColumn= request.getParameter("order[0][column]");
		String  orderDir = request.getParameter("order[0][dir]");
		emp.setLength(length);
		emp.setStart(start);
		emp.setOrderColumn(orderColumn);
		emp.setOrderDir(orderDir);
		
		int countEmp=empService.countEmp(emp);
		List<Emp> lEmps=empService.findEmpList(emp);
		resultMap.put("draw", draw);
		resultMap.put("recordsTotal", countEmp);
		resultMap.put("recordsFiltered", countEmp);
		resultMap.put("data", lEmps);
		
		return resultMap;
	}
	//员工 增加
	@RequestMapping("/emp/addEmp")
	@ResponseBody
	public Map addEmp(Emp emp,HttpServletRequest request){
		Map resultMap=new HashMap();
		
		empService.addEmp(emp);
		resultMap.put("status", "ok");
		
		return resultMap;
	}

	/** <pre>recordLog(这里用一句话描述这个方法的作用)   
	 * 创建人：肖治超 3319787644@qq.com    
	 * 创建时间：2018年10月10日 下午3:42:07    
	 * 修改人：肖治超 3319787644@qq.com     
	 * 修改时间：2018年10月10日 下午3:42:07    
	 * 修改备注： 
	 * @param log</pre>    
	 */
	private void recordLog(Log log) {
		// TODO Auto-generated method stub
		logService.recordLog(log);
	}
	
	
	//员工修改
	@RequestMapping("/emp/updateEmp")
	@ResponseBody
	public Map updateEmp(Emp emp,HttpServletRequest request){
		Map resultMap=new HashMap();

		empService.updateEmp(emp);
		resultMap.put("status", "ok");
			
		return resultMap;
	}
	
	//员工删除
	@RequestMapping("/emp/deleteEmp")
	@ResponseBody
	public Map deleteEmp(Integer id,HttpServletRequest request){
		Map resultMap=new HashMap();
			
		empService.deleteEmp(id);
		resultMap.put("status", "ok");
			
		return resultMap;
	}
	
}
