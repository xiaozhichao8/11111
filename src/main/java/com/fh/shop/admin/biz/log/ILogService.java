/** 
 * <pre>项目名称:shop-admin 
 * 文件名称:ILogService.java 
 * 包名:com.fh.shop.admin.biz.log 
 * 创建日期:2018年10月10日下午3:43:47 
 * Copyright (c) 2018, 3319787644@qq.com All Rights Reserved.</pre> 
 */  
package com.fh.shop.admin.biz.log;

import com.fh.shop.admin.po.log.Log;

/** 
 * <pre>项目名称：shop-admin    
 * 类名称：ILogService    
 * 类描述：    
 * 创建人：肖治超3319787644@qq.com    
 * 创建时间：2018年10月10日 下午3:43:47    
 * 修改人：肖治超 3319787644@qq.com     
 * 修改时间：2018年10月10日 下午3:43:47    
 * 修改备注：       
 * @version </pre>    
 */
public interface ILogService {

	/** <pre>recordLog(这里用一句话描述这个方法的作用)   
	 * 创建人：肖治超 3319787644@qq.com    
	 * 创建时间：2018年10月10日 下午3:45:37    
	 * 修改人：肖治超 3319787644@qq.com     
	 * 修改时间：2018年10月10日 下午3:45:37    
	 * 修改备注： 
	 * @param log</pre>    
	 */
	void recordLog(Log log);

}
