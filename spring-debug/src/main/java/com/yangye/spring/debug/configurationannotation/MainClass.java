package com.yangye.spring.debug.configurationannotation;

import com.yangye.spring.debug.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author yangye
 * @date 2021/01/12
 */
public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
		Person bean = ctx.getBean(Person.class);
	}
}
