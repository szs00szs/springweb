package cc.hansam.business.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author hansam 945210972@qq.com
 * @date 2017年7月4日下午6:08:52
 */
@Controller
@RequestMapping("/hello")
@PropertySource("classpath:dev.properties")
public class HelloController {

	@Value(value = "${dev.name}")
	private String name;

	@Value(value = "${dev.pass}")
	private String pass;

	@RequestMapping(method = RequestMethod.GET)
	public String printHello(ModelMap model) {
		model.addAttribute("message", "Hello Spring MVC Framework!");
		System.out.println("test value inject: [name=" + name + "],[pass=" + pass + "]");
		return "hello";
	}
}
