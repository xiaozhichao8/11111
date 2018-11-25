/** 
 * <pre>项目名称:shop-admin 
 * 文件名称:LogAspect.java 
 * 包名:com.fh.shop.admin.aspect 
 * 创建日期:2018年10月12日下午5:11:05 
 * Copyright (c) 2018, 3319787644@qq.com All Rights Reserved.</pre> 
 */  
package com.fh.shop.admin.aspect;

import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
 * <pre>项目名称：shop-admin    
 * 类名称：LogAspect    
 * 类描述：    
 * 创建人：肖治超3319787644@qq.com    
 * 创建时间：2018年10月12日 下午5:11:05    
 * 修改人：肖治超 3319787644@qq.com     
 * 修改时间：2018年10月12日 下午5:11:05    
 * 修改备注：       
 * @version </pre>    
 */
public class LogAspect {
	
	private static final Logger LOG=LoggerFactory.getLogger(LogAspect.class);
	
	public Object doLog(ProceedingJoinPoint pjp){
		//类名
		String className= pjp.getTarget().getClass().getName();
		//方法名
		String methodName = pjp.getSignature().getName();
		Object result=null;
		try {
			LOG.info("执行了{}里的{}方法",className,methodName);
			result = pjp.proceed();
			LOG.info("{}里的{}方法执行结束",className,methodName);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			LOG.info("{}里的{}方法出现异常：{}",className,methodName,e);
			Map resultMap=new HashMap();
			resultMap.put("status", "error");
			return resultMap;
		}
		return result;
	}
}
