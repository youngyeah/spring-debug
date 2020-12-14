package com.yangye.spring.debug;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person2 {

	@Autowired
	private Person person;
}
