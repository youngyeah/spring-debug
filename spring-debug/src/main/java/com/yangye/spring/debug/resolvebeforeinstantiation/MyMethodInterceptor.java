package com.yangye.spring.debug.resolvebeforeinstantiation;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class MyMethodInterceptor implements MethodInterceptor {
	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		System.out.println("准备执行目标方法");
		Object res = methodProxy.invokeSuper(o, objects);
		System.out.println("完成执行目标方法");
		return res;
	}
}
