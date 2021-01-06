package com.yangye.spring.debug.beansetter;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
		Person person = ctx.getBean(Person.class);
		System.out.println(person.getName());

		person.setName("lisi");
		Person p = ctx.getBean(Person.class);
		System.out.println(p.getName());
	}
}
