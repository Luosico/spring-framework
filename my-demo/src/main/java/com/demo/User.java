package com.demo;

import org.springframework.stereotype.Component;

/**
 * @Author: luo kai fa
 * @Date: 2021/7/18
 */
@Component
public class User {
	private String name;
	private Integer id;

	public User() {
		System.out.println(this.getClass().getName() + "实例化了");
	}

	public User(String name, Integer id) {
		this.name = name;
		this.id = id;
	}

	public void print(){
		System.out.println("This is user print");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
