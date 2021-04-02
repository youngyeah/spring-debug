package com.yangye.spring.debug.configurationannotation;

import com.yangye.spring.debug.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yangye
 * @date 2021/01/12
 */
@Configuration(proxyBeanMethods = false)
public class MainConfig {

	@Bean
	public Person person() {
		return new Person();
	}
}
