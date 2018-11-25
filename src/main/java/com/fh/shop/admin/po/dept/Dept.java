package com.fh.shop.admin.po.dept;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.auth0.jwt.internal.com.fasterxml.jackson.annotation.JsonFormat;

public class Dept implements Serializable {

	private static final long serialVersionUID = -2327148725232780217L;
	
	private Integer id;
	private String deptName;
	private Integer fatherId;
	private String description;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date establishTime;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	/*public Dept(String deptName){
		this.deptName=deptName;
	}
	*/
	
	
	
	public Integer getFatherId() {
		return fatherId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@JsonFormat(pattern="yyyy-MM-dd")
	public Date getEstablishTime() {
		return establishTime;
	}
	public void setEstablishTime(Date establishTime) {
		this.establishTime = establishTime;
	}
	public void setFatherId(Integer fatherId) {
		this.fatherId = fatherId;
	}
	@Override
	public String toString() {
		return "Dept [id=" + id + ", deptName=" + deptName + ", fatherId="
				+ fatherId + ", description=" + description
				+ ", establishTime=" + establishTime + "]";
	}
}
