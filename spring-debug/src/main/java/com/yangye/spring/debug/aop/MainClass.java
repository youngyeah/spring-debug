package com.yangye.spring.debug.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
		Test bean = ctx.getBean(Test.class);
		int add = bean.add(1, 2);
		System.out.println(add);
	}
}
