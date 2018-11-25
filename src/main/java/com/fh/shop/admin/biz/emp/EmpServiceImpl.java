/** 
 * <pre>项目名称:shop-admin 
 * 文件名称:EmpServiceImpl.java 
 * 包名:com.fh.shop.admin.biz.emp 
 * 创建日期:2018年10月10日上午10:11:54 
 * Copyright (c) 2018, 3319787644@qq.com All Rights Reserved.</pre> 
 */  
package com.fh.shop.admin.biz.emp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fh.shop.admin.mapper.emp.IEmpMapper;
import com.fh.shop.admin.po.emp.Emp;
import com.fh.shop.admin.util.Page;

/** 
 * <pre>项目名称：shop-admin    
 * 类名称：EmpServiceImpl    
 * 类描述：    
 * 创建人：肖治超3319787644@qq.com    
 * 创建时间：2018年10月10日 上午10:11:54    
 * 修改人：肖治超 3319787644@qq.com     
 * 修改时间：2018年10月10日 上午10:11:54    
 * 修改备注：       
 * @version </pre>    
 */
@Service
public class EmpServiceImpl implements IEmpService {

	@Autowired
	private IEmpMapper empMapper;

	/* (non-Javadoc)    
	 * @see com.fh.shop.admin.biz.emp.IEmpService#countEmp()    
	 */
	@Override
	public int countEmp(Emp emp) {
		// TODO Auto-generated method stub
		return empMapper.countEmp(emp);
	}

	/* (non-Javadoc)    
	 * @see com.fh.shop.admin.biz.emp.IEmpService#findEmpList(int, int)    
	 */
	@Override
	public List<Emp> findEmpList(Emp emp) {
		// TODO Auto-generated method stub
		String str="";
		String arr[] = {"id","id","ename","id","birthday","pay"};
		for (int i = 0; i < arr.length; i++) {
				if (i==Integer.parseInt(emp.getOrderColumn())) {
					str=arr[i];
				}
		}
		emp.setOrderColumn(str);
		List<Emp>  lEmps=empMapper.findEmpList(emp);
		return lEmps;
	}

	/* (non-Javadoc)    
	 * @see com.fh.shop.admin.biz.emp.IEmpService#addEmp(com.fh.shop.admin.po.emp.Emp)    
	 */
	@Override
	public void addEmp(Emp emp) {
		// TODO Auto-generated method stub
		empMapper.addEmp(emp);
	}

	/* (non-Javadoc)    
	 * @see com.fh.shop.admin.biz.emp.IEmpService#updateEmp(com.fh.shop.admin.po.emp.Emp)    
	 */
	@Override
	public void updateEmp(Emp emp) {
		// TODO Auto-generated method stub
		empMapper.updateEmp(emp);
	}

	/* (non-Javadoc)    
	 * @see com.fh.shop.admin.biz.emp.IEmpService#deleteEmp(int)    
	 */
	@Override
	public void deleteEmp(int id) {
		// TODO Auto-generated method stub
		empMapper.deleteEmp(id);
	} 
	
}
