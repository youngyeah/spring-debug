package com.yangye.spring.debug.beansetter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class MainConfig {

	@Bean
	public Person person() {
		Person person = new Person();
		person.setName("zhangsan");
		return person;
	}
}
