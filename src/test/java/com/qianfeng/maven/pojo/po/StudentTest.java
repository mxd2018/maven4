package com.qianfeng.maven.pojo.po;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
	@SuppressWarnings("resource")
	@Test
	public void testStudent(){
		//ioc����֤
		//��������ֵע��ref
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student s = ctx.getBean("student",Student.class);
		System.out.println(s);
		
		//��֤��̬����ģʽ�Ķ��󴴽�
		/*Student s = ctx.getBean("studentFactory",Student.class);
		System.out.println(s);*/
		
		//���췽��ע�룬ʵ������Բ��ṩset/get����
		/*Phone phone = ctx.getBean("phone", Phone.class);
		System.out.println(phone);*/
	}
}
