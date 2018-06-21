package cc.hansam.business.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cc.hansam.business.dao.StudentDao;
import cc.hansam.business.po.Student;
import cc.hansam.business.service.StudentService;

/**
 * @author hansam 945210972@qq.com
 * @date 2017年8月2日下午1:52:12
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {
	
	@Resource
	private StudentDao studentDao;

	@Override
	public Student getStudentById(int id) {
		return studentDao.selectByPrimaryKey(id);
	}

}
