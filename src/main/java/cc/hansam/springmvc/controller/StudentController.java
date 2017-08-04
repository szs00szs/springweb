package cc.hansam.springmvc.controller;


import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;

import cc.hansam.springmvc.po.Student;
import cc.hansam.springmvc.service.StudentService;

/**
 * @author hansam 945210972@qq.com
 * @date 2017年7月5日下午12:13:29
 */
@Controller
public class StudentController {
	
	private static Logger logger = Logger.getLogger(StudentController.class);
	
	@Resource
	private StudentService studentService;

	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public ModelAndView student() {
		return new ModelAndView("student", "command", new Student());
	}

	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public String addStudent(@ModelAttribute("SpringWeb") Student student, ModelMap model) {
		model.addAttribute("name", student.getName());
		model.addAttribute("age", student.getAge());
		model.addAttribute("id", student.getId());

		return "result";
	}
	
	/**
	 * 整合spring+spirngmvc+mybatis
	 */
	@RequestMapping("/ssm")
	@ResponseBody
	public Student getStudent() {
		Student student = studentService.getStudentById(1);
		logger.info(JSON.toJSONString(student));
		return student;
	}
}