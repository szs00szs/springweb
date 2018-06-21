package cc.hansam.business.po;

import com.alibaba.fastjson.annotation.JSONType;

/**
 * @author hansam 945210972@qq.com
 * @date 2017年7月5日下午12:11:37
 */
@JSONType(orders= {"id","name","age"})
public class Student {

	private Integer id;
	private String name;
	private Integer age;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}
