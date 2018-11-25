/** 
 * <pre>项目名称:shop-admin 
 * 文件名称:AreaController.java 
 * 包名:com.fh.shop.admin.controller.area 
 * 创建日期:2018年10月8日下午8:39:35 
 * Copyright (c) 2018, 3319787644@qq.com All Rights Reserved.</pre> 
 */  
package com.fh.shop.admin.controller.area;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fh.shop.admin.biz.area.IAreaService;
import com.fh.shop.admin.po.area.Area;

/** 
 * <pre>项目名称：shop-admin    
 * 类名称：AreaController    
 * 类描述：    
 * 创建人：肖治超3319787644@qq.com    
 * 创建时间：2018年10月8日 下午8:39:35    
 * 修改人：肖治超 3319787644@qq.com     
 * 修改时间：2018年10月8日 下午8:39:35    
 * 修改备注：       
 * @version </pre>    
 */
@Controller
@RequestMapping("/area")
public class AreaController {

	
	@Resource(name="areaServiceImpl")
	private IAreaService areaService ;
	
	
	@RequestMapping("/list")
	@ResponseBody
	public Map findAreaList(){
		Map resultMap=new HashMap();
		try {
			List<Area> lAreas=areaService.findAreaList();
			List<Map> lMaps=new ArrayList<Map>();
 			for (Area area : lAreas) {
				Map item=new HashMap();
				item.put("id",area.getId());
				item.put("name",area.getAreaName());
				item.put("pId", area.getAreaFatherId());
				lMaps.add(item);
			}
 			resultMap.put("data", lMaps);
			resultMap.put("status", "ok");
		} catch (Exception e) {
			// TODO: handle exception
			resultMap.put("status", "error");
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return resultMap;
		
	}
}
