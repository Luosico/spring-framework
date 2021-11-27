package com.demo;

import org.springframework.beans.factory.support.GenericBeanDefinition;
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

		/*AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
		beanDefinition.setBeanClass(User.class);
		beanDefinition.setInstanceSupplier(()->{
			return new User();
		});

		context.registerBeanDefinition(User.class.getSimpleName(), beanDefinition);*/
	}
}
