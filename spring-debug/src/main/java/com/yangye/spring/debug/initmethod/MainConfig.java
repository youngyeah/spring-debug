package com.yangye.spring.debug.initmethod;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class MainConfig {

	@Bean(initMethod = "initMethod")
	public Person person() {
		return new Person();
	}
}
