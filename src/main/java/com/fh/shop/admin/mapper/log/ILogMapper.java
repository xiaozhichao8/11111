/** 
 * <pre>项目名称:shop-admin 
 * 文件名称:ILogMapper.java 
 * 包名:com.fh.shop.admin.mapper.log 
 * 创建日期:2018年10月10日下午3:45:19 
 * Copyright (c) 2018, 3319787644@qq.com All Rights Reserved.</pre> 
 */  
package com.fh.shop.admin.mapper.log;

import com.fh.shop.admin.po.log.Log;

/** 
 * <pre>项目名称：shop-admin    
 * 类名称：ILogMapper    
 * 类描述：    
 * 创建人：肖治超3319787644@qq.com    
 * 创建时间：2018年10月10日 下午3:45:19    
 * 修改人：肖治超 3319787644@qq.com     
 * 修改时间：2018年10月10日 下午3:45:19    
 * 修改备注：       
 * @version </pre>    
 */
public interface ILogMapper {

	/** <pre>recordLog(这里用一句话描述这个方法的作用)   
	 * 创建人：肖治超 3319787644@qq.com    
	 * 创建时间：2018年10月10日 下午3:46:04    
	 * 修改人：肖治超 3319787644@qq.com     
	 * 修改时间：2018年10月10日 下午3:46:04    
	 * 修改备注： 
	 * @param log</pre>    
	 */
	void recordLog(Log log);
}
