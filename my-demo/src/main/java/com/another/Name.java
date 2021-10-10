package com.another;

import com.demo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: luo kai fa
 * @Date: 2021/9/11
 */
@Component
public class Name {

	@Autowired
	User user;

	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
