package cc.hansam.springmvc.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cc.hansam.springmvc.dao.IStudentDao;
import cc.hansam.springmvc.po.Student;
import cc.hansam.springmvc.service.IStudentService;

/**
 * @author hansam 945210972@qq.com
 * @date 2017年8月2日下午1:52:12
 */
@Service("studentService")
public class StudentServiceImpl implements IStudentService {
	
	@Resource
	private IStudentDao studentDao;

	@Override
	public Student getStudentById(int id) {
		return studentDao.selectByPrimaryKey(id);
	}

}
