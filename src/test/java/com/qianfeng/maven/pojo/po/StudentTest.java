package com.qianfeng.maven.pojo.po;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
	@SuppressWarnings("resource")
	@Test
	public void testStudent(){
		//ioc简单验证
		//引入类型值注入ref
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student s = ctx.getBean("student",Student.class);
		System.out.println(s);
		
		//验证静态工厂模式的对象创建
		/*Student s = ctx.getBean("studentFactory",Student.class);
		System.out.println(s);*/
		
		//构造方法注入，实体类可以不提供set/get方法
		/*Phone phone = ctx.getBean("phone", Phone.class);
		System.out.println(phone);*/
	}
}
