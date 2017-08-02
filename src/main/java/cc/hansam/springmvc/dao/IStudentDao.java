package cc.hansam.springmvc.dao;

import cc.hansam.springmvc.po.Student;

/**
 * @author hansam 945210972@qq.com
 * @date 2017年8月2日下午1:49:32
 */
public interface IStudentDao {

	Student selectByPrimaryKey(Integer id);
}