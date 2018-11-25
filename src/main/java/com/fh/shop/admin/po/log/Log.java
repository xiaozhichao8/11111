/** 
 * <pre>项目名称:shop-admin 
 * 文件名称:Log.java 
 * 包名:com.fh.shop.admin.po.log 
 * 创建日期:2018年10月10日下午2:10:42 
 * Copyright (c) 2018, 3319787644@qq.com All Rights Reserved.</pre> 
 */  
package com.fh.shop.admin.po.log;

import java.io.Serializable;
import java.util.Date;

/** 
 * <pre>项目名称：shop-admin    
 * 类名称：Log    
 * 类描述：    
 * 创建人：肖治超3319787644@qq.com    
 * 创建时间：2018年10月10日 下午2:10:42    
 * 修改人：肖治超 3319787644@qq.com     
 * 修改时间：2018年10月10日 下午2:10:42    
 * 修改备注：       
 * @version </pre>    
 */
public class Log implements Serializable {

	private static final long serialVersionUID = 85982215372948041L;
	
	private String inif;
	
	private String ipArr;
	
	private Date cerateTime;
	
	private Integer state;

	public String getInif() {
		return inif;
	}

	public void setInif(String inif) {
		this.inif = inif;
	}

	public String getIpArr() {
		return ipArr;
	}

	public void setIpArr(String ipArr) {
		this.ipArr = ipArr;
	}

	public Date getCerateTime() {
		return cerateTime;
	}

	public void setCerateTime(Date cerateTime) {
		this.cerateTime = cerateTime;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Log [inif=" + inif + ", ipArr=" + ipArr + ", cerateTime="
				+ cerateTime + ", state=" + state + "]";
	}
}
