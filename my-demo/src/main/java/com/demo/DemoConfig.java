package com.demo;

import com.another.NameConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: luo kai fa
 * @Date: 2021/7/18
 */
@Configuration
@ComponentScan("com")
public class DemoConfig {

	@Autowired
	private NameConfig nameConfig;

	public DemoConfig() {
		System.out.println(this.getClass().getName() + "实例化了");
	}
}
