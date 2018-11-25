/** 
 * <pre>项目名称:shop-admin 
 * 文件名称:Emp.java 
 * 包名:com.fh.shop.admin.po.emp 
 * 创建日期:2018年10月10日上午9:49:21 
 * Copyright (c) 2018, 3319787644@qq.com All Rights Reserved.</pre> 
 */  
package com.fh.shop.admin.po.emp;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fh.shop.admin.util.Page;

/** 
 * <pre>项目名称：shop-admin    
 * 类名称：Emp    
 * 类描述：    
 * 创建人：肖治超3319787644@qq.com    
 * 创建时间：2018年10月10日 上午9:49:21    
 * 修改人：肖治超 3319787644@qq.com     
 * 修改时间：2018年10月10日 上午9:49:21    
 * 修改备注：       
 * @version </pre>    
 */
public class Emp extends Page implements Serializable {

	private static final long serialVersionUID = -4616064809317943524L;
	private Integer id;
	private String ename;
	private Integer sex;
	@DateTimeFormat(pattern="yyyy-mm-dd")
	private Date birthday;
	private Integer pay;
	
	private Integer mainPay;
	private Integer maxPay;
	
	@DateTimeFormat(pattern="yyyy-mm-dd")
	private Date startBirthday;
	@DateTimeFormat(pattern="yyyy-mm-dd")
	private Date endBirthday;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	@JsonFormat(pattern="yyyy-MM-dd")
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Integer getPay() {
		return pay;
	}
	public void setPay(Integer pay) {
		this.pay = pay;
	}
	public Integer getMainPay() {
		return mainPay;
	}
	public void setMainPay(Integer mainPay) {
		this.mainPay = mainPay;
	}
	public Integer getMaxPay() {
		return maxPay;
	}
	public void setMaxPay(Integer maxPay) {
		this.maxPay = maxPay;
	}
	public Date getStartBirthday() {
		return startBirthday;
	}
	public void setStartBirthday(Date startBirthday) {
		this.startBirthday = startBirthday;
	}
	public Date getEndBirthday() {
		return endBirthday;
	}
	public void setEndBirthday(Date endBirthday) {
		this.endBirthday = endBirthday;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", ename=" + ename + ", sex=" + sex
				+ ", birthday=" + birthday + ", pay=" + pay + ", mainPay="
				+ mainPay + ", maxPay=" + maxPay + ", startBirthday="
				+ startBirthday + ", endBirthday=" + endBirthday + "]";
	}
}
