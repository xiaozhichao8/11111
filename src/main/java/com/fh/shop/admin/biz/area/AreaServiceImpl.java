/** 
 * <pre>项目名称:shop-admin 
 * 文件名称:AreaServiceImpl.java 
 * 包名:com.fh.shop.admin.biz.area 
 * 创建日期:2018年10月8日下午8:52:18 
 * Copyright (c) 2018, 3319787644@qq.com All Rights Reserved.</pre> 
 */  
package com.fh.shop.admin.biz.area;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fh.shop.admin.mapper.area.IAreaMapper;
import com.fh.shop.admin.po.area.Area;

/** 
 * <pre>项目名称：shop-admin    
 * 类名称：AreaServiceImpl    
 * 类描述：    
 * 创建人：肖治超3319787644@qq.com    
 * 创建时间：2018年10月8日 下午8:52:18    
 * 修改人：肖治超 3319787644@qq.com     
 * 修改时间：2018年10月8日 下午8:52:18    
 * 修改备注：       
 * @version </pre>    
 */
@Service
public class AreaServiceImpl implements IAreaService {

	
	@Autowired
	private IAreaMapper areaMapper ;
	
	/* (non-Javadoc)    
	 * @see com.fh.shop.admin.biz.area.IAreaService#findAreaList()    
	 */
	@Override
	public List<Area> findAreaList() {
		// TODO Auto-generated method stub
		return areaMapper.findAreaList();
	}

}
