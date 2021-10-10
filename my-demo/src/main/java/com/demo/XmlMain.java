package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: luo kai fa
 * @Date: 2021/9/8
 */
public class XmlMain {
	public static void main(String[] args) {
		//BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("springBean.xml"));
		//User user = (User) beanFactory.getBean("user");

		ApplicationContext context = new ClassPathXmlApplicationContext("springBean.xml");
		User user = (User) context.getBean("user");
		user.print();
	}
}
