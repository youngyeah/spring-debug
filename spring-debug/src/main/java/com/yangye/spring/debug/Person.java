package com.yangye.spring.debug;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
	@Autowired
	private Person2 person2;

	private String name;
}
