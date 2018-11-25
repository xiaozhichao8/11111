/** 
 * <pre>项目名称:shop-admin 
 * 文件名称:Area.java 
 * 包名:com.fh.shop.admin.po.area 
 * 创建日期:2018年10月8日下午8:08:09 
 * Copyright (c) 2018, 3319787644@qq.com All Rights Reserved.</pre> 
 */  
package com.fh.shop.admin.po.area;

import java.io.Serializable;

/** 
 * <pre>项目名称：shop-admin    
 * 类名称：Area    
 * 类描述：    
 * 创建人：肖治超3319787644@qq.com    
 * 创建时间：2018年10月8日 下午8:08:09    
 * 修改人：肖治超 3319787644@qq.com     
 * 修改时间：2018年10月8日 下午8:08:09    
 * 修改备注：       
 * @version </pre>    
 */
public class Area implements Serializable {

	private static final long serialVersionUID = -5883879769595824974L;

	private Integer id;
	private String areaName;
	private Integer areaFatherId;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public Integer getAreaFatherId() {
		return areaFatherId;
	}
	public void setAreaFatherId(Integer areaFatherId) {
		this.areaFatherId = areaFatherId;
	}
	@Override
	public String toString() {
		return "Area [id=" + id + ", areaName=" + areaName + ", areaFatherId="
				+ areaFatherId + "]";
	}
	
	
}
