package com.yangye.spring.debug.initmethod;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);

		Person bean = ctx.getBean(Person.class);
	}
}
