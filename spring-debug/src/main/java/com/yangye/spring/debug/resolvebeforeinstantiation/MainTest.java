package com.yangye.spring.debug.resolvebeforeinstantiation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
		BeforeInstantiationBean bean = ctx.getBean(BeforeInstantiationBean.class);
		bean.doSomething();
	}
}
