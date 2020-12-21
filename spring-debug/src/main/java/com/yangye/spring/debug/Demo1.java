package com.yangye.spring.debug;

import com.yangye.spring.debug.facotrybean.MyFactoryBean;
import com.yangye.spring.debug.facotrybean.User;
import com.yangye.spring.debug.lookupmethod.Apple;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo1 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
//		Person person = ctx.getBean(Person.class);
//		System.out.println(person);
//		User user = (User) ctx.getBean("user");
//		System.out.println(user.getUsername());
//		MyFactoryBean factoryBean = (MyFactoryBean) ctx.getBean("&user");
//		System.out.println(factoryBean);

		// 未使用lookup-method
		Apple apple = ctx.getBean(Apple.class);
		System.out.println(apple.getBanana());
		Apple apple2 = ctx.getBean(Apple.class);
		System.out.println(apple.getBanana());

		// 使用lookup-method
		System.out.println(apple.createBanana());
		System.out.println(apple.createBanana());

	}
}
