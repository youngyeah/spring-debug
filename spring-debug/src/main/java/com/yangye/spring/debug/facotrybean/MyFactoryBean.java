package com.yangye.spring.debug.facotrybean;

import org.springframework.beans.factory.FactoryBean;

public class MyFactoryBean implements FactoryBean<User> {
	@Override
	public User getObject() throws Exception {
		return new User("zhangsan");
	}

	@Override
	public Class<?> getObjectType() {
		return User.class;
	}
}
