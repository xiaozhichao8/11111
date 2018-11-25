/** 
 * <pre>项目名称:shop-admin 
 * 文件名称:IAreaService.java 
 * 包名:com.fh.shop.admin.biz.area 
 * 创建日期:2018年10月8日下午8:42:18 
 * Copyright (c) 2018, 3319787644@qq.com All Rights Reserved.</pre> 
 */  
package com.fh.shop.admin.biz.area;

import java.util.List;

import com.fh.shop.admin.po.area.Area;

/** 
 * <pre>项目名称：shop-admin    
 * 类名称：IAreaService    
 * 类描述：    
 * 创建人：肖治超3319787644@qq.com    
 * 创建时间：2018年10月8日 下午8:42:18    
 * 修改人：肖治超 3319787644@qq.com     
 * 修改时间：2018年10月8日 下午8:42:18    
 * 修改备注：       
 * @version </pre>    
 */

public interface IAreaService {

	/** <pre>findAreaList(这里用一句话描述这个方法的作用)   
	 * 创建人：肖治超 3319787644@qq.com    
	 * 创建时间：2018年10月8日 下午8:51:43    
	 * 修改人：肖治超 3319787644@qq.com     
	 * 修改时间：2018年10月8日 下午8:51:43    
	 * 修改备注： 
	 * @return</pre>    
	 */
	List<Area> findAreaList();

}
