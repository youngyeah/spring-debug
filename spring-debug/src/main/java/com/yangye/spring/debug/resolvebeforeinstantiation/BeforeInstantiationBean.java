package com.yangye.spring.debug.resolvebeforeinstantiation;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class BeforeInstantiationBean {

	public void doSomething() {
		System.out.println("do something...");
	}
}
