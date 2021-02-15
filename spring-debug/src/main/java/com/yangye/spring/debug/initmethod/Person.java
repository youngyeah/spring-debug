package com.yangye.spring.debug.initmethod;

import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;

public class Person implements InitializingBean {


	@PostConstruct
	public void postConstruct() {
		System.out.println("postConstruct");
	}

	public void initMethod() {
		System.out.println("initMethod");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet");
	}
}
