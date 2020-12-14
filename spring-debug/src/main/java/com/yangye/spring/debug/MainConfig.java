package com.yangye.spring.debug;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfig {

	@Bean
	public BeanPostProcessor myBeanPostProcessor() {
		return new MyBeanPostProcessor();
	}

	@Bean
	public BeanDefinitionRegistryPostProcessor myBeanDefinitionRegistryPostProcessor() {
		return new MyBeanDefinitionRegistryPostProcessor();
	}
}
