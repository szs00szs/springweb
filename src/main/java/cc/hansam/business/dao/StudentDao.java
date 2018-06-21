package cc.hansam.business.dao;

import cc.hansam.business.po.Student;

/**
 * @author hansam 945210972@qq.com
 * @date 2017年8月2日下午1:49:32
 */
public interface StudentDao {

	Student selectByPrimaryKey(Integer id);
}