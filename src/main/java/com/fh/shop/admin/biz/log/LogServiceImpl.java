/** 
 * <pre>项目名称:shop-admin 
 * 文件名称:LogServiceImpl.java 
 * 包名:com.fh.shop.admin.biz.log 
 * 创建日期:2018年10月10日下午3:44:39 
 * Copyright (c) 2018, 3319787644@qq.com All Rights Reserved.</pre> 
 */  
package com.fh.shop.admin.biz.log;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fh.shop.admin.mapper.log.ILogMapper;
import com.fh.shop.admin.po.log.Log;

/** 
 * <pre>项目名称：shop-admin    
 * 类名称：LogServiceImpl    
 * 类描述：    
 * 创建人：肖治超3319787644@qq.com    
 * 创建时间：2018年10月10日 下午3:44:39    
 * 修改人：肖治超 3319787644@qq.com     
 * 修改时间：2018年10月10日 下午3:44:39    
 * 修改备注：       
 * @version </pre>    
 */
@Service
public class LogServiceImpl implements ILogService {

	@Autowired
	private ILogMapper logMapper;

	/* (non-Javadoc)    
	 * @see com.fh.shop.admin.biz.log.ILogService#recordLog(com.fh.shop.admin.po.log.Log)    
	 */
	@Override
	public void recordLog(Log log) {
		// TODO Auto-generated method stub
		logMapper.recordLog(log);
	}
}
