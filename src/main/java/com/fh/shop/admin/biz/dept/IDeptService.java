/** 
 * <pre>项目名称:shop-admin 
 * 文件名称:IDeptService.java 
 * 包名:com.fh.shop.admin.biz.dept 
 * 创建日期:2018年10月6日下午7:39:32 
 * Copyright (c) 2018, 3319787644@qq.com All Rights Reserved.</pre> 
 */  
package com.fh.shop.admin.biz.dept;

import java.util.List;

import com.fh.shop.admin.po.dept.Dept;

/** 
 * <pre>项目名称：shop-admin    
 * 类名称：IDeptService    
 * 类描述：    
 * 创建人：肖治超3319787644@qq.com    
 * 创建时间：2018年10月6日 下午7:39:32    
 * 修改人：肖治超 3319787644@qq.com     
 * 修改时间：2018年10月6日 下午7:39:32    
 * 修改备注：       
 * @version </pre>    
 */
public interface IDeptService  {

	/** <pre>addDept(增加)   
	 * 创建人：肖治超 3319787644@qq.com    
	 * 创建时间：2018年10月6日 下午8:03:30    
	 * 修改人：肖治超 3319787644@qq.com     
	 * 修改时间：2018年10月6日 下午8:03:30    
	 * 修改备注： 
	 * @param dept</pre>    
	 * @throws Exception 
	 */
	void addDept(Dept dept) throws Exception;

	/** <pre>findDeptList(查询)   
	 * 创建人：肖治超 3319787644@qq.com    
	 * 创建时间：2018年10月7日 下午2:52:17    
	 * 修改人：肖治超 3319787644@qq.com     
	 * 修改时间：2018年10月7日 下午2:52:17    
	 * 修改备注： 
	 * @return</pre>    
	 */
	List<Dept> findDeptList();

	/** <pre>updateDept(修改)   
	 * 创建人：肖治超 3319787644@qq.com    
	 * 创建时间：2018年10月8日 下午12:22:29    
	 * 修改人：肖治超 3319787644@qq.com     
	 * 修改时间：2018年10月8日 下午12:22:29    
	 * 修改备注： 
	 * @param dept</pre>    
	 */
	void updateDept(Dept dept);

	/** <pre>deleteDept(删除)   
	 * 创建人：肖治超 3319787644@qq.com    
	 * 创建时间：2018年10月8日 下午2:21:05    
	 * 修改人：肖治超 3319787644@qq.com     
	 * 修改时间：2018年10月8日 下午2:21:05    
	 * 修改备注： 
	 * @param str</pre>    
	 */
	void deleteDept(List<Integer> str);
}
