package com.yangye.spring.debug;

import com.yangye.spring.debug.facotrybean.MyFactoryBean;
import com.yangye.spring.debug.importselector.MyImportSelector;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(MyImportSelector.class)
public class MainConfig {

	@Bean
	public BeanPostProcessor myBeanPostProcessor() {
		return new MyBeanPostProcessor();
	}

	@Bean
	public BeanDefinitionRegistryPostProcessor myBeanDefinitionRegistryPostProcessor() {
		return new MyBeanDefinitionRegistryPostProcessor();
	}

	@Bean("user")
	public MyFactoryBean myFactoryBean() {
		return new MyFactoryBean();
	}
}
