/** 
 * <pre>项目名称:shop-admin 
 * 文件名称:IEmpService.java 
 * 包名:com.fh.shop.admin.biz.emp 
 * 创建日期:2018年10月10日上午10:11:29 
 * Copyright (c) 2018, 3319787644@qq.com All Rights Reserved.</pre> 
 */  
package com.fh.shop.admin.biz.emp;

import java.util.List;

import com.fh.shop.admin.po.emp.Emp;
import com.fh.shop.admin.util.Page;

/** 
 * <pre>项目名称：shop-admin    
 * 类名称：IEmpService    
 * 类描述：    
 * 创建人：肖治超3319787644@qq.com    
 * 创建时间：2018年10月10日 上午10:11:29    
 * 修改人：肖治超 3319787644@qq.com     
 * 修改时间：2018年10月10日 上午10:11:29    
 * 修改备注：       
 * @version </pre>    
 */
public interface IEmpService {

	/** <pre>countEmp(这里用一句话描述这个方法的作用)   
	 * 创建人：肖治超 3319787644@qq.com    
	 * 创建时间：2018年10月10日 上午10:13:44    
	 * 修改人：肖治超 3319787644@qq.com     
	 * 修改时间：2018年10月10日 上午10:13:44    
	 * 修改备注： 
	 * @param emp 
	 * @return</pre>    
	 */
	int countEmp(Emp emp);

	/** <pre>findEmpList(这里用一句话描述这个方法的作用)   
	 * 创建人：肖治超 3319787644@qq.com    
	 * 创建时间：2018年10月10日 上午10:23:43    
	 * 修改人：肖治超 3319787644@qq.com     
	 * 修改时间：2018年10月10日 上午10:23:43    
	 * 修改备注： 
	 * @param start
	 * @param length
	 * @return</pre>    
	 */
	List<Emp> findEmpList(Emp emp);

	/** <pre>addEmp(这里用一句话描述这个方法的作用)   
	 * 创建人：肖治超 3319787644@qq.com    
	 * 创建时间：2018年10月10日 上午10:55:48    
	 * 修改人：肖治超 3319787644@qq.com     
	 * 修改时间：2018年10月10日 上午10:55:48    
	 * 修改备注： 
	 * @param emp</pre>    
	 */
	void addEmp(Emp emp);

	/** <pre>updateEmp(这里用一句话描述这个方法的作用)   
	 * 创建人：肖治超 3319787644@qq.com    
	 * 创建时间：2018年10月11日 上午11:14:44    
	 * 修改人：肖治超 3319787644@qq.com     
	 * 修改时间：2018年10月11日 上午11:14:44    
	 * 修改备注： 
	 * @param emp</pre>    
	 */
	void updateEmp(Emp emp);

	/** <pre>deleteEmp(这里用一句话描述这个方法的作用)   
	 * 创建人：肖治超 3319787644@qq.com    
	 * 创建时间：2018年10月11日 下午12:12:39    
	 * 修改人：肖治超 3319787644@qq.com     
	 * 修改时间：2018年10月11日 下午12:12:39    
	 * 修改备注： 
	 * @param id</pre>    
	 */
	void deleteEmp(int id);


}
