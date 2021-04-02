package com.yangye.spring.debug;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yangye
 * @date 2020/12/24
 */
@Configuration
public class MainConfig2 {

	@Bean("person2")
	public Person person() {
		return new Person();
	}
}
