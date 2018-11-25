/** 
 * <pre>项目名称:shop-admin 
 * 文件名称:IDeptServiceImpl.java 
 * 包名:com.fh.shop.admin.biz.dept 
 * 创建日期:2018年10月6日下午7:40:11 
 * Copyright (c) 2018, 3319787644@qq.com All Rights Reserved.</pre> 
 */  
package com.fh.shop.admin.biz.dept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auth0.jwt.internal.org.bouncycastle.crypto.RuntimeCryptoException;
import com.fh.shop.admin.mapper.dept.IDeptMapper;
import com.fh.shop.admin.po.dept.Dept;

/** 
 * <pre>项目名称：shop-admin    
 * 类名称：IDeptServiceImpl    
 * 类描述：    
 * 创建人：肖治超3319787644@qq.com    
 * 创建时间：2018年10月6日 下午7:40:11    
 * 修改人：肖治超 3319787644@qq.com     
 * 修改时间：2018年10月6日 下午7:40:11    
 * 修改备注：       
 * @version </pre>    
 */
@Service("deptService")
public class DeptServiceImpl implements IDeptService {

	@Autowired
	private IDeptMapper deptMapper;

	/* (non-Javadoc)    
	 * @see com.fh.shop.admin.biz.dept.IDeptService#addDept(com.fh.shop.admin.po.dept.Dept)    
	 */
	@Override
	public void addDept(Dept dept)throws Exception{
		// TODO Auto-generated method stub
		deptMapper.addDept(dept);
		throw new RuntimeException();
	}

	/* (non-Javadoc)    
	 * @see com.fh.shop.admin.biz.dept.IDeptService#findDeptList()    
	 */
	@Override
	public List<Dept> findDeptList() {
		// TODO Auto-generated method stub
		return deptMapper.findDeptList();
	}

	/* (non-Javadoc)    
	 * @see com.fh.shop.admin.biz.dept.IDeptService#updateDept(com.fh.shop.admin.po.dept.Dept)    
	 */
	@Override
	public void updateDept(Dept dept) {
		// TODO Auto-generated method stub
		deptMapper.updateDept(dept);
	}

	/* (non-Javadoc)    
	 * @see com.fh.shop.admin.biz.dept.IDeptService#deleteDept(java.lang.String)    
	 */
	@Override
	public void deleteDept(List<Integer> str) {
		// TODO Auto-generated method stub
		if (str.size()>0) {
			deptMapper.deleteDept(str);
		}
	}
}
