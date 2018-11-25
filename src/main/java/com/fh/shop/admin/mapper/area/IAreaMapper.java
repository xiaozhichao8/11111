/** 
 * <pre>项目名称:shop-admin 
 * 文件名称:IAreaMapper.java 
 * 包名:com.fh.shop.admin.mapper.area 
 * 创建日期:2018年10月8日下午8:58:55 
 * Copyright (c) 2018, 3319787644@qq.com All Rights Reserved.</pre> 
 */  
package com.fh.shop.admin.mapper.area;

import java.util.List;

import com.fh.shop.admin.po.area.Area;

/** 
 * <pre>项目名称：shop-admin    
 * 类名称：IAreaMapper    
 * 类描述：    
 * 创建人：肖治超3319787644@qq.com    
 * 创建时间：2018年10月8日 下午8:58:55    
 * 修改人：肖治超 3319787644@qq.com     
 * 修改时间：2018年10月8日 下午8:58:55    
 * 修改备注：       
 * @version </pre>    
 */
public interface IAreaMapper {

	/** <pre>findAreaList(这里用一句话描述这个方法的作用)   
	 * 创建人：肖治超 3319787644@qq.com    
	 * 创建时间：2018年10月8日 下午8:59:12    
	 * 修改人：肖治超 3319787644@qq.com     
	 * 修改时间：2018年10月8日 下午8:59:12    
	 * 修改备注： 
	 * @return</pre>    
	 */
	List<Area> findAreaList();

}
