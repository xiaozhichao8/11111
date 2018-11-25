/** 
 * <pre>项目名称:shop-admin 
 * 文件名称:IDeptMapper.java 
 * 包名:com.fh.shop.admin.mapper.dept 
 * 创建日期:2018年10月6日下午7:41:43 
 * Copyright (c) 2018, 3319787644@qq.com All Rights Reserved.</pre> 
 */  
package com.fh.shop.admin.mapper.dept;

import java.util.List;

import com.fh.shop.admin.po.dept.Dept;

/** 
 * <pre>项目名称：shop-admin    
 * 类名称：IDeptMapper    
 * 类描述：    
 * 创建人：肖治超3319787644@qq.com    
 * 创建时间：2018年10月6日 下午7:41:43    
 * 修改人：肖治超 3319787644@qq.com     
 * 修改时间：2018年10月6日 下午7:41:43    
 * 修改备注：       
 * @version </pre>    
 */
public interface IDeptMapper {

	/** <pre>addDept(增加)   
	 * 创建人：肖治超 3319787644@qq.com    
	 * 创建时间：2018年10月6日 下午8:04:33    
	 * 修改人：肖治超 3319787644@qq.com     
	 * 修改时间：2018年10月6日 下午8:04:33    
	 * 修改备注： 
	 * @param dept</pre>    
	 */
	void addDept(Dept dept);

	/** <pre>findDeptList(查询)   
	 * 创建人：肖治超 3319787644@qq.com    
	 * 创建时间：2018年10月7日 下午2:54:27    
	 * 修改人：肖治超 3319787644@qq.com     
	 * 修改时间：2018年10月7日 下午2:54:27    
	 * 修改备注： 
	 * @return</pre>    
	 */
	List<Dept> findDeptList();

	/** <pre>updateDept(修改)   
	 * 创建人：肖治超 3319787644@qq.com    
	 * 创建时间：2018年10月8日 下午12:23:27    
	 * 修改人：肖治超 3319787644@qq.com     
	 * 修改时间：2018年10月8日 下午12:23:27    
	 * 修改备注： 
	 * @param dept</pre>    
	 */
	void updateDept(Dept dept);

	/** <pre>deleteDept(删除)   
	 * 创建人：肖治超 3319787644@qq.com    
	 * 创建时间：2018年10月8日 下午2:27:48    
	 * 修改人：肖治超 3319787644@qq.com     
	 * 修改时间：2018年10月8日 下午2:27:48    
	 * 修改备注： 
	 * @param liIntegers</pre>    
	 */
	void deleteDept(List<Integer> liIntegers);

}
