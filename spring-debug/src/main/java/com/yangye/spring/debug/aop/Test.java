package com.yangye.spring.debug.aop;

import org.springframework.stereotype.Component;

@Component
public class Test {


	public int add(Integer i, Integer j) {
		return i + j;
	}
}
