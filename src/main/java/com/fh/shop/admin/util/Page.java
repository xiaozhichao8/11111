package com.fh.shop.admin.util;

import java.io.Serializable;

public class Page implements Serializable {
    private static final long serialVersionUID = -3286498461125591331L;
    private  Integer start;
    private  Integer length;
    private String orderColumn;//排序字段
    private String 	orderDir;//排序 asc desc;
    

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }
    
    public String getOrderColumn() {
		return orderColumn;
	}

	public void setOrderColumn(String orderColumn) {
		this.orderColumn = orderColumn;
	}

	public String getOrderDir() {
		return orderDir;
	}

	public void setOrderDir(String orderDir) {
		this.orderDir = orderDir;
	}

	@Override
	public String toString() {
		return "Page [start=" + start + ", length=" + length + ", orderColumn="
				+ orderColumn + ", orderDir=" + orderDir + "]";
	}
}
