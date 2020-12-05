package com.yangye.spring.debug;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo1 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
		Person person = ctx.getBean(Person.class);
		System.out.println(person);
	}
}
