package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: luo kai fa
 * @Date: 2021/7/18
 */
public class AnnotationMain {

	/*@Autowired
	User user;*/

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		User user = (User)context.getBean("user");
		user.print();
	}
}
