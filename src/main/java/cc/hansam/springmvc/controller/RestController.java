package cc.hansam.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import cc.hansam.springmvc.po.Student;

/**
 * @author hansam 945210972@qq.com
 * @date 2017年7月25日上午9:55:18
 */
@Controller
@RequestMapping("restcontroller") // 请求的路径
public class RestController {

	/**
	 * 直接返回字符串
	 */
	// 请求的路径，方式
	@RequestMapping(value = "v1.0/new/{project}", method = RequestMethod.GET)
	@ResponseBody
	public String demo01(@PathVariable String project, HttpServletRequest request) {

		// 可以使用project获取url路径分隔

		// 获取请求的参数
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String age = request.getParameter("age");

		Student student = new Student();
		student.setId(Integer.parseInt(id));
		student.setName(name);
		student.setAge(Integer.valueOf(age));


		return "123456";
	}
	
	/**
	 * 直接返回对象，自动转化为JSON格式
	 */
	@RequestMapping(value = "v2.0/new/{project}", method = RequestMethod.GET)
	@ResponseBody
	public Student demo02(@PathVariable String project, HttpServletRequest request) {

		// 可以使用project获取url路径分隔

		// 获取请求的参数
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String age = request.getParameter("age");

		Student student = new Student();
		student.setId(Integer.parseInt(id));
		student.setName(name);
		student.setAge(Integer.valueOf(age));

		return student;
	}
	
	/**
	 * 直接返回List，自动转化为JSON格式
	 */
	@RequestMapping(value = "v3.0/new/{project}", method = RequestMethod.GET)
	@ResponseBody
	public List<Student> demo03(@PathVariable String project, HttpServletRequest request) {

		// 可以使用project获取url路径分隔

		// 获取请求的参数
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String age = request.getParameter("age");

		Student student = new Student();
		student.setId(Integer.parseInt(id));
		student.setName(name);
		student.setAge(Integer.valueOf(age));
		
		Student student2 = new Student();
		student2.setId(2);
		student2.setName("hansam");
		student2.setAge(23);
		
		List<Student> list = new ArrayList<>();
		list.add(student);
		list.add(student2);

		return list;
	}
	
	
	/**
	 * 封装odb数据格式要求
	 */
	@RequestMapping(value = "v4.0/new/{project}", method = RequestMethod.GET)
	@ResponseBody
	public JSONObject demo04(@PathVariable String project, HttpServletRequest request) {

		// 可以使用project获取url路径分隔

		// 获取请求的参数
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String age = request.getParameter("age");

		Student student = new Student();
		student.setId(Integer.parseInt(id));
		student.setName(name);
		student.setAge(Integer.valueOf(age));

		JSONArray jsonArray = new JSONArray();
		jsonArray.add(student);

		JSONObject jsonObject = new JSONObject(true);
		jsonObject.put("data", jsonArray);
		jsonObject.put("code", -1);
		jsonObject.put("success", true);

		return jsonObject;
	}
	
	
	/**
	 * 封装odb数据格式要求
	 */
	@RequestMapping(value = "v5.0/new/{project}", method = RequestMethod.POST)
	@ResponseBody
	public JSONObject demo05(@PathVariable String project, HttpServletRequest request,@RequestBody Student student) {

		// 可以使用project获取url路径分隔

		// 获取请求的参数
		
		

		JSONArray jsonArray = new JSONArray();
		jsonArray.add(student);

		JSONObject jsonObject = new JSONObject(true);
		jsonObject.put("data", jsonArray);
		jsonObject.put("code", -1);
		jsonObject.put("success", true);

		return jsonObject;
	}

}
